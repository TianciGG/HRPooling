$(document).ready(function() {
	//1.初始化Table
	InitTable();
	$('#tbNotice').on('click-row.bs.table', function(e, row, element) {
		$('.success').removeClass('success');// 去除之前选中的行的样式
		$(element).addClass('success');// 添加当前选中的success样式用于区别
	});
	$('#btnAdd').bind('click', Add_click);
	$('#btnEdit').bind('click', btnEdit_Click);
	$('#btnRemove').bind('click', del);
	$('#btnSearch').bind('click', InitTable);
	InitNoticTypeName();
	Initpublishuser();
	$('#btnsubmit').bind('click', savaInfo);
	$('#btnsure').bind('click', editInfo);
	NoticTypeName();
	publishuser();
	/*datetimepicker();*/
});

function InitTable() {
	$('#tbNotice').bootstrapTable('destroy');
	$('#tbNotice').bootstrapTable({
		url: '../notice/getNoticeList.do', //请求后台的URL（*）
		method: 'get', //请求方式（*）
		dateType:'json',
		toolbar: '#toolbar', //工具按钮用哪个容器
		striped: true, //是否显示行间隔色
		cache: false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
		pagination: true, //是否显示分页（*）
		sortable: false, //是否启用排序
		sortOrder: "asc", //排序方式

		sidePagination: "server", //分页方式：client客户端分页，server服务端分页（*）
		pageNumber: 1, //初始化加载第一页，默认第一页
		pageSize: 50, //每页的记录行数（*）
		pageList: [10, 25, 50, 100], //可供选择的每页的行数（*）
		strictSearch: true,
		clickToSelect: true, //是否启用点击选中行
		height: 460, //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
		uniqueId: "noticeid", //每一行的唯一标识，一般为主键列
		cardView: false, //是否显示详细视图
		detailView: false,
		queryParams : queryParams,

		columns: [{
			field: 'noticeid',
			title: '序号',
			formatter : function(value, row, index) {
				return index + 1;
			}
		}, {
			field: 'noticetitle',
			title: '公告标题'
		}, {
			field: 'noticetypename',
			title: '公告类型'
		}, {
			field: 'empname',
			title: '发布人ID'
		}, {
			field: 'publishtime',
			formatter: function(value,row,index){
				var unixTimestamp = new Date(value) ;
				commonTime = unixTimestamp.toLocaleString();
				
				return commonTime;
			},
			title: '发布时间'
		}, {
			field: 'content',
			title: '发布内容'
		}]
	});
}

function queryParams() {
	var temp = { // 这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
	// limit : params.limit, // 页面大小
	// offset : params.offset, // 页码
		// 后台请求传的查询参数
		noticetitle : $('#STitle').val(),
	};
	return temp;
};


//单击添加图标弹出模态框
function Add_click() {

	$('#noticetitle').val("");// 点完确定添加时下次再点添加清空文本框内的数据val("")
	$('#noticetypeid').val("");
	$('#publishuserid').val("");                                                          //?
	$('#publishtime').val("");                                                 //?
	$('#content').val("");                                                //?
	$('#myModal').modal('toggle');// 点击添加按钮时弹出模态框
}

//添加公告信息
function savaInfo() {
	
	//alert($('#publishtime').val());
	$.ajax({
		type : "post",
		url : "../notice/add.do",
		datatype : 'json',
		data : {
			noticetitle : $('#noticetitle').val(),
			noticetypeid : $('#noticetypeid').val(),
			publishuserid : $('#publishuserid').val(),
			content : $('#content').val()
		},
		success : function(data) {
			alert("添加成功");
			 $("#tbNotice").bootstrapTable('refresh', {url: "../notice/getNoticeList.do" });
		}
	});
}
//公告类型下拉列表
function InitNoticTypeName() {
	$.ajax({
		type : "get",
		url : "../noticeType/getAllNoticeType.do",
		dataType : 'json',
		async : true,
		success : function(data) {

			var innerHtml = "";

			$.each(data.rows, function(i, val) {

				innerHtml += "<option value=\"" + val.noticetypeid + "\">"
						+ val.noticetypename + "</option>";

			});
			$('#noticetypeid').html(innerHtml);
		}
	});
}


//发布人下拉列表
function Initpublishuser() {
	$.ajax({
		type : "get",
		url : "../employee/getAll.do",
		dataType : 'json',
		async : true,
		success : function(data) {

			var innerHtml = "";

			$.each(data.rows, function(i, val) {

				innerHtml += "<option value=\"" + val.empid + "\">"
						+ val.empname + "</option>";

			});
			$('#publishuserid').html(innerHtml);
		}
	});
}

//修改按钮
function btnEdit_Click() {
	var index = $('#tbNotice').find('tr.success').data('index');// 获取选中的行脚标
	var row = $('#tbNotice').bootstrapTable('getData')[index];// 返回选中行所有数据
															// 通过脚标index找到选中的数据

	$('#noticeid').val(row.noticeid);// 修改时为隐藏的文本框赋值
	$('#upnoticetitle').val(row.noticetitle);// 给点击修改弹出的模态框里的编号赋值
	$('#upnoticetypeid').val(row.noticetypename);// 给点击修改弹出的模态框里的电话赋值
	$('#uppublishuserid').val(row.empname);
	$('#upcontent').val(row.content);
	$('#upModal').modal('toggle');// 点击编辑弹出模态框
}

//修改公告信息
function editInfo() {
	$.ajax({
		type : "post",
		url : "../notice/edit.do",
		datatype : 'json',
		data : {
			noticeid : $('#noticeid').val(),
			noticetitle : $('#upnoticetitle').val(),
			noticetypeid : $('#upnoticetypeid').val(),
			/*publishuserid : $('#uppublishuserid').val(),*/
			content : $('#upcontent').val()
		},
		success : function(data) {
			alert("修改成功");
			 $("#tbNotice").bootstrapTable('refresh', {url: "../notice/getNoticeList.do" });
		}
	});
}


//修改模态框公告类型下拉列表
function NoticTypeName() {
	$.ajax({
		type : "get",
		url : "../noticeType/getAllNoticeType.do",
		dataType : 'json',
		async : true,
		success : function(data) {

			var innerHtml = "";

			$.each(data.rows, function(i, val) {

				innerHtml += "<option value=\"" + val.noticetypeid + "\">"
						+ val.noticetypename + "</option>";

			});
			$('#upnoticetypeid').html(innerHtml);
		}
	});
}

//修改发布人下拉列表
function publishuser() {
	$.ajax({
		type : "get",
		url : "../employee/getAll.do",
		dataType : 'json',
		async : true,
		success : function(data) {

			var innerHtml = "";

			$.each(data.rows, function(i, val) {

				innerHtml += "<option value=\"" + val.empid + "\">"
						+ val.empname + "</option>";

			});
			$('#uppublishuserid').html(innerHtml);
		}
	});
}


//删除公告
function del() {
	var index = $('#tbNotice').find('tr.success').data('index');// 获取选中的行脚标
	var row = $('#tbNotice').bootstrapTable('getData')[index];// 返回选中行所有数据
	// 通过脚标index找到选中的数据
	$('#noticeid').val(row.noticeid);

	if (!confirm("确认要删除？")) {
		window.event.returnValue = false; // 取消
	} else {
		$.ajax({ // 确定删除时执行改方法
			type : "post",
			url : "../notice/delete.do",
			datatype : 'json',
			data : {
				noticeid : $('#noticeid').val()
			},
			success : function(data) {
				$("#tbNotice").bootstrapTable('refresh', {
					url : "../notice/getNoticeList.do"
				});
			}
		});
	}
}

/*function datetimepicker(){
	$('#Time').datetimepicker({
        language:  'zh-CN',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0
    });
}*/





