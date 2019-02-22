/**
 * 处理员工档案相关的页面逻辑
 */

$(document).ready(function() {

	InitEmployeeList();
	$('#btnAdd').bind('click',btnAdd_Click);
	
	
	$('#btnSaveDept').bind('click',btnSaveDept_Click);
});

function InitEmployeeList() {

	$('#tbEmployeeList').bootstrapTable({
		url : '/HRPooling/employee/getAll.do',
		method : 'get',
		dataType:'json',

		method: 'get', // 请求方式（*）
		toolbar: '#toolbar', // 工具按钮用哪个容器
		striped: true, // 是否显示行间隔色
		cache: false, // 是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
		pagination: true, // 是否显示分页（*）
		sortable: true, // 是否启用排序
		sortOrder: "asc", // 排序方式
		queryParams : getParam,// 传递参数（*）
		sidePagination: "server", // 分页方式：client客户端分页，server服务端分页（*）
		pageNumber: 1, // 初始化加载第一页，默认第一页
		pageSize: 2, // 每页的记录行数（*）
		pageList: [10, 25, 50, 100], // 可供选择的每页的行数（*）
		strictSearch: true,
		clickToSelect: true, // 是否启用点击选中行
		showColumns: true,
		singleSelect: true,
		height: 460, // 行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
		uniqueId: "empid", // 每一行的唯一标识，一般为主键列
	
		cardView: false, // 是否显示详细视图
		detailView: false,
		columns : [

		{
			field : 'empno',
			title : '员工编号',
			  width:100
		}, {
			field : 'empname',
			title : '员工姓名',
			  width:100
		},
		{
			field: 'duty.dutyname',
			title: '职务名称',
			 width:100
		},
		{
			field: 'dept.deptname',
			title: '部门名称',
			 width:100
		}
		]
	});
}


function getParam(params) {
	var temp = { // 这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
		limit : params.limit, // 页面大小
		offset : params.offset // 页码
	};
	return temp;
}

function btnAdd_Click() {
	$('#txtDeptName').val(""); // 在jquery中给控件赋值，在jquery中基本没有属性都是方法
	// 弹出模块窗体
	$('#frmEmployee').modal('show');
}


function btnSaveDept_Click()
{
	$.ajax({
		type:"post", // 请求类型 post一般修改数据；get一般获取数据
		url:"/HRPooling/employee/add.do", // spring mvc的控制器
		datatype:'json',
		data:{
			empno: $('#txtEmpNO').val(),
			empname:$('#txtEmpName').val()
		},
	
		success:function(data){
			 alert(data); 获得返回数据之后的处理
		}
});
}
