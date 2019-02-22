$(document).ready(function() {

	DegreeMenu();
	UpDegreeMenu();
	SearchDegreeMenu();

	// alert($('#sdegreeid').val());
	// 1.初始化Table
	InitTable();
	$('#tbbasic').on('click-row.bs.table', function(e, row, element) {
		$('.success').removeClass('success');// 去除之前选中的行的样式
		$(element).addClass('success');// 添加当前选中的success样式用于区别
	});
	$('#btnAdd').bind('click', Add_click);
	$('#btnIntention').bind('click', btnIntention_Click); // 意向 : 1
	$('#btnUncom').bind('click', btnUncom_Click); // 不符 : 0
	$('#btnSigned').bind('click', btnSigned_Click); // 签约 : 2

	$('#btnsubmit').bind('click', saveResume);
	$('#upbtnsubmit').bind('click', updateDept);
	$('#btnSearch').bind('click', InitTable);

});

// 初始化表格，查询表格中的数据
function InitTable() {

	$('#tbbasic').bootstrapTable('destroy');
	$('#tbbasic')
			.bootstrapTable(
					{
						url : '../resume/getAll.do', // 请求后台的URL（*）
						method : 'get', // 请求方式（*）
						toolbar : '#toolbar', // 工具按钮用哪个容器
						striped : true, // 是否显示行间隔色
						cache : false, // 是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
						pagination : true, // 是否显示分页（*）
						sortable : false, // 是否启用排序
						sortOrder : "asc", // 排序方式

						// sidePagination : "server", //
						// 分页方式：client客户端分页，server服务端分页（*）
						pageNumber : 1, // 初始化加载第一页，默认第一页
						pageSize : 10, // 每页的记录行数（*）
						pageList : [ 3, 6, 9, 15 ], // 可供选择的每页的行数（*）
						strictSearch : true,
						clickToSelect : true, // 是否启用点击选中行
						// height : 540, // 行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
						uniqueId : "id", // 每一行的唯一标识，一般为主键列
						cardView : false, // 是否显示详细视图
						detailView : false,
						queryParams : queryParams,

						columns : [

								{
									field : 'basicInfoId',// 和Javabean对应
									title : '序号',
									formatter : function(value, row, index) {
										return index + 1;
									}
								},
								{
									field : 'name',
									title : '姓名'
								},
								{
									field : 'gender',
									title : '性别',
									formatter : function(value, row, index) {
										if (value == true) {
											return "女";
										} else {
											return "男";
										}
									}
								},
								{
									field : 'birthdate',
									title : '出生日期'
								},
								{
									field : 'address',
									title : '家庭地址',
								},
								{
									field : 'politicalstatus',
									title : '政治面貌'
								},
								{
									field : 'job',
									title : '申请职位',
								},
								{
									field : 'maritalstatus',
									title : '婚否',
									formatter : function(value, row, index) {
										if (value == true) {
											return "已婚";
										} else {
											return "未婚";
										}
									}
								},
								{
									field : 'phone',
									title : '联系方式',
								},
								{
									field : 'display',
									title : '学历'
								},
								{
									field : 'hobbies',
									title : '业余爱好'
								},
								{
									field : 'caozuo',
									title : '操作',
									align : "center",
									formatter : function(value, row, index) {
										return "<a href='javascript:Edit_Click()'><span class='glyphicon glyphicon-pencil' > </a> "
												+ "<a href='javascript:del()'><span class='glyphicon glyphicon-trash' > </a> ";
									}
								},
								{
									field : 'tag',
									title : '简历状态',
									align : "center",
									formatter : function(value, row, index) {

										if (row.tag == 1) {
											return "<span class=\"glyphicon glyphicon-user label label-primary\">意向</span>";
										}

										if (value == 0) {
											return "<span class=\"glyphicon glyphicon-remove label label-danger\">不符</span>";

										}

										if (value == 2) {
											return "<span class=\"glyphicon glyphicon-ok label label-success \">签约</span>";
										}

									}
								} ]
					});

}

function queryParams() {
	var temp = { // 这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
		// limit : params.limit, // 页面大小
		// offset : params.offset, // 页码
		// 后台请求传的查询参数
		name : $('#sname').val(),
		address : $('#saddress').val(),
		job : $('#sjob').val(),
		phone : $('#sphone').val(),
		gender : $('#sgender').val(),
		maritalstatus : $('#smaritalstatus').val(),
		degreeid : $('#sdegreeid').val(),
		politicalstatus : $('#spoliticalstatus').val(),
		birthdate : $('#sbirthdate').val(),

	};
	return temp;
};

// 单击添加图标弹出模态框
function Add_click() {

	$('#pname').val("");// 点完确定添加时下次再点添加清空文本框内的数据val("")
	$('#birthdate').val("");
	$('#gender').val("");
	$('#politicalstatus').val("");
	$('#maritalstatus').val("");
	$('#job').val("");
	$('#degreeid').val("");
	$('#phone').val("");
	$('#address').val("");
	$('#hobbies').val("");
	$('#your-modal').modal('toggle');// 点击添加按钮时弹出模态框
}

// 单击修改图标弹出模态框
function Edit_Click() {

	var index = $('#tbbasic').find('tr.success').data('index');// 获取选中的行脚标
	var row = $('#tbbasic').bootstrapTable('getData')[index];// 返回选中行所有数据
	// 通过脚标index找到选中的数据

	$('#upbasicinfoid').val(row.basicInfoId);// 修改时为隐藏的文本框赋值,这的row.对应modal属性和json串
	$('#uppname').val(row.name);
	$('#upbirthdate').val(row.birthdate);

	$('#uppoliticalstatus').val(row.politicalstatus);

	var gender = -1;
	if (row.gender) {
		gender = 1;
	}
	if (!row.gender) {
		gender = 0;
	}

	$("input:radio[name='upgender'][value=" + gender + "]").attr("checked",
			'true');
	
	var maritalstatus = -1;
	if (row.maritalstatus) {
		maritalstatus = 1;
	}
	if (!row.maritalstatus) {
		maritalstatus = 0;
	}
	
	$("input:radio[name='upmaritalstatus'][value=" + maritalstatus + "]").attr("checked",
	'true');
	
	
	$('#upjob').val(row.job);
	$('#updegreeid').val(row.degreeid);
	$('#upphone').val(row.phone);
	$('#upaddress').val(row.address);

	$('#uphobbies').val(row.hobbies);

	$('#your-modal2').modal('toggle');// 点击编辑弹出模态框
}

// 添加简历基本信息
function saveResume() {

	var gender = $("input:radio[name='gender']:checked").val();
	var maritalstatus = $("input:radio[name='maritalstatus']:checked").val();
	$.ajax({
		url : '../resume/save.do',
		method : 'post',
		dataType : 'json',
		data : {
			name : $('#pname').val(),
			birthdate : $('#birthdate').val(),
			// birthdate : ($('#birthdate')).toString().val(),
			// //将前台页面的date类型转为数据库的String类型插入数据库
			gender : gender,
			politicalstatus : $('#politicalstatus').val(),
			maritalstatus : maritalstatus,
			job : $('#job').val(),
			degreeid : $('#degreeid').val(),
			phone : $('#phone').val(),
			address : $('#address').val(),
			hobbies : $('#hobbies').val()
		},
		success : function(data) {

			alert("添加成功，请在页面中查看！");
			$("#tbbasic").bootstrapTable('refresh', {
				url : "../resume/getAll.do"
			});
		}
	});
}

// 修改简历基本信息
function updateDept() {

	var gender = $("input:radio[name='upgender']:checked").val();
	var maritalstatus = $("input:radio[name='upmaritalstatus']:checked").val();
	$.ajax({
		type : "post",
		url : "../resume/update.do",
		datatype : 'json',
		data : {
			basicinfoid : $('#upbasicinfoid').val(),
			name : $('#uppname').val(),
			gender : gender,
			politicalstatus : $('#uppoliticalstatus').val(),
			address : $('#upaddress').val(),
			birthdate : $('#upbirthdate').val(),
			maritalstatus : maritalstatus,
			degreeid : $('#updegreeid').val(),
			job : $('#upjob').val(),
			phone : $('#upphone').val(),
			hobbies : $('#uphobbies').val()
		},
		success : function(data) {

			if (data == 'true') {
				alert("修改成功，请在页面中查看！");
				$("#tbbasic").bootstrapTable('refresh', {
					url : "../resume/getAll.do"
				});
			} else {
				alert("修改失败!");
			}
		}
	});
}

function btnIntention_Click() {
	updateTag(1);// 设置标签为意向

}

function btnUncom_Click() {
	updateTag(0);// 设置标签为不符
}

function btnSigned_Click() {
	updateTag(2);// 设置标签为签约
}

function updateTag(tag) {
	var index = $('#tbbasic').find('tr.success').data('index');// 获取选中的行脚标
	var row = $('#tbbasic').bootstrapTable('getData')[index];// 返回选中行所有数据

	$.ajax({
		type : "post",
		url : "../resume/saveAsIntention.do",
		datatype : 'json',
		data : {
			basicinfoid : row.basicInfoId,
			tag : tag
		},
		success : function(data) {
			$("#tbbasic").bootstrapTable('refresh', {
				url : "../resume/getAll.do"
			});
		}
	});
}

// 删除简历基本信息
function del() {
	var index = $('#tbbasic').find('tr.success').data('index');// 获取选中的行脚标
	var row = $('#tbbasic').bootstrapTable('getData')[index];// 返回选中行所有数据
	// 通过脚标index找到选中的数据
	$('#upbasicinfoid').val(row.basicInfoId);

	if (!confirm("确认要删除？")) {
		window.event.returnValue = false; // 取消
	} else {
		$.ajax({ // 确定删除时执行改方法
			type : "post",
			url : "../resume/delete.do",
			datatype : 'json',
			data : {
				basicinfoid : $('#upbasicinfoid').val()
			},
			success : function(data) {
				$("#tbbasic").bootstrapTable('refresh', {
					url : "../resume/getAll.do"
				});
			}
		});
	}
}

// 添加模态学历下拉菜单
function DegreeMenu() {

	$.ajax({
		type : "get",
		url : "../sysdicvalue/getAllDegree.do",
		dataType : 'json',
		async : true,
		success : function(data) {

			var innerHtml = "";

			$.each(data, function(i, val) {

				innerHtml += "<option value=\"" + val.id + "\">" + val.display
						+ "</option>";

			});

			$('#degreeid').html(innerHtml);
		}
	});
}

// 修改模态学历下拉菜单
function UpDegreeMenu() {

	$.ajax({
		type : "get",
		url : "../sysdicvalue/getAllDegree.do",
		dataType : 'json',
		async : true,
		success : function(data) {

			var innerHtml = "";

			$.each(data, function(i, val) {

				innerHtml += "<option value=\"" + val.id + "\">" + val.display
						+ "</option>";

			});

			$('#updegreeid').html(innerHtml);
		}
	});
}

// 搜索栏学历下拉菜单
function SearchDegreeMenu() {
	$.ajax({
		type : "get",
		url : "../sysdicvalue/getAllDegree.do",
		dataType : 'json',
		async : true,
		success : function(data) {

			var innerHtml = "<option value='0'>全部</option>";

			$.each(data, function(i, val) {

				innerHtml += "<option value=\"" + val.id + "\">" + val.display
						+ "</option>";

			});

			$('#sdegreeid').html(innerHtml);
		}
	});
}
