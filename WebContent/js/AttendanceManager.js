$(document).ready(function() {

	// 1.初始化Table
	InitTable();
	$('#tbAttendance').on('click-row.bs.table', function(e, row, element) {
		$('.success').removeClass('success');// 去除之前选中的行的样式
		$(element).addClass('success');// 添加当前选中的success样式用于区别
	});
	$('#btnAdd').bind('click', Add_click);
	$('#btnEdit').bind('click', Edit_Click);
	$('#btnSubmit').bind('click', saveAtt);
	$('#btnSure').bind('click', updateAtt);
	$('#btnRemove').bind('click', del);
	$('#btnSearch').bind('click', InitTable);
});

//初始化表格，查询表格中的数据	
function InitTable() {
	$('#tbAttendance').bootstrapTable({
		url : '/HRPooling/attendance/getAll.do', // 请求后台的URL（*）
		method : 'get', // 请求方式（*）
		toolbar : '#toolbar', // 工具按钮用哪个容器
		striped : true, // 是否显示行间隔色
		cache : false, // 是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
		pagination : true, // 是否显示分页（*）
		sortable : false, // 是否启用排序
		sortOrder : "asc", // 排序方式

		sidePagination : "server", // 分页方式：client客户端分页，server服务端分页（*）
		pageNumber : 1, // 初始化加载第一页，默认第一页
		pageSize : 50, // 每页的记录行数（*）
		pageList : [ 10, 25, 50, 100 ], // 可供选择的每页的行数（*）
		strictSearch : true,
		clickToSelect : true, // 是否启用点击选中行
		height : 460, // 行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
		uniqueId : "id", // 每一行的唯一标识，一般为主键列
		cardView : false, // 是否显示详细视图
		detailView : false,
		queryParams : queryParams,

		columns : [ {
			field : 'attendanceid',
			title : '序号'
		}, {
			field : 'employee.empname',
			title : '员工姓名'
		}, /*{
			field : 'attdate',
			title : '上班日期'
		},*/ {
			field : 'attendaceTime',
			title : '上班时间'
		}, {
			field : 'closeingTime',
			title : '下班时间'
		}, {
			field : 'islate',
			title : '是否迟到'
		}, {
			field : 'istardy',
			title : '是否早退'
		}, {
			field : 'isleave',
			title : '是否请假'
		} ]
	});
}

function queryParams(params) {
	var temp = { // 这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
		limit : params.limit, // 页面大小
		offset : params.offset, // 页码
		// 后台请求传的查询参数
		/*employee.empname : $('#sempId').val()*/
	};
	return temp;
};

//单击添加图标弹出模态框
function Add_click() {
	$('#empid').val("");
	$('#attdate').val("");
	$('#attendaceTime').val("");
	$('#closeingTime').val("");
	$('#islate').val("");
	$('#istardy').val("");
	$('#isleave').val("");
	$('#addModal').modal('show');// 点击添加按钮时弹出模态框
}

//单击修改图标弹出模态框
function Edit_Click() {
	var index = $('#tbAttendance').find('tr.success').data('index');// 获取选中的行脚标
	var row = $('#tbAttendance').bootstrapTable('getData')[index];// 返回选中行所有数据
	// 通过脚标index找到选中的数据
	
	$('#attendaceId').val(row.attendanceid);
	$('#upempid').val(row.empid);
	$('#upattdate').val(row.attdate);
	$('#upattendaceTime').val(row.attendaceTime);
	$('#upcloseingTime').val(row.closeingTime);
	$('#upislate').val(row.islate);
	$('#upistardy').val(row.istardy);
	$('#upisleave').val(row.isleave);
	$('#upModal').modal('show');// 点击编辑弹出模态框
}

//添加信息
function saveAtt() {
	$.ajax({
		url : '/HRPooling/attendance/save.do',
		method : 'post',
		dataType : 'json',
		data : {
			empid : $('#empid').val(),
			attdate : new Date($('#attdate').val()),
//			attendaceTime : $('#attendaceTime').val(),
//			closeingTime : $('#closeingTime').val(),
//			islate : $('#islate').val(),
//			istardy : $('#istardy').val(),
//			isleave : $('#isleave').val()
		},
		success : function(data) {

			alert("添加成功，请在页面中查看！");
			/*$("#tbAttendance").bootstrapTable('refresh', {
				url : "/HRPooling/attendance/getAll.do"
			});*/
		}
	});
}

//修改信息
function updateAtt() {
	$.ajax({
		type : "post",
		url : "/HRPooling/attendance/update.do",
		datatype : 'json',
		data : {
			attendanceid : $('#attendaceId').val(),
			empid : $('#empid').val()
			/*attdate : $('#attdate').val(),
			attendaceTime : $('#attendaceTime').val(),
			closeingTime : $('#closeingTime').val(),
			islate : $('#islate').val(),
			istardy : $('#istardy').val(),
			isleave : $('#isleave').val()*/
			
		},
		success : function(data) {
			alert("修改成功，请在页面中查看！");
			$("#tbAttendance").bootstrapTable('refresh', {
				url : "/HRPooling/attendance/getAll.do"
			});
		}
	});
}

//删除信息
function del() {
	var index = $('#tbAttendance').find('tr.success').data('index');// 获取选中的行脚标
	var row = $('#tbAttendance').bootstrapTable('getData')[index];// 返回选中行所有数据
	// 通过脚标index找到选中的数据
	$('#attendaceId').val(row.attendanceid);

	if (!confirm("确认要删除？")) {
		window.event.returnValue = false; // 取消
	} else {
		$.ajax({ // 确定删除时执行改方法
			type : "post",
			url : "/HRPooling/attendance/delete.do",
			datatype : 'json',
			data : {
				attendanceid : $('#attendaceId').val()
			},
			success : function(data) {
				$("#tbAttendance").bootstrapTable('refresh', {
					url : "/HRPooling/attendance/getAll.do"
				});

			}
		});
	}
}
