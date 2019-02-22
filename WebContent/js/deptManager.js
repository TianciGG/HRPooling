$(document).ready(function() {

	// 1.初始化Table
	InitTable();

	$('#tbDept').on('click-row.bs.table', function(e, row, element) {
		$('.success').removeClass('success');// 去除之前选中的行的样式
		$(element).addClass('success');// 添加当前选中的success样式用于区别
	});

	// InitdeptName();

	InitsuperName();

	$('#btnAdd').bind('click', btnAdd_click);
	$('#btnEdit').bind('click', btnEdit_Click);// 为修改按钮绑定时间
	$('#btnsubmit').bind('click', SavaOrUpdate);
	$('#btnRemove').bind('click', del);

	// $('#btnshow').bind('click',showDept);

});

function InitTable() {
	$('#tbDept').bootstrapTable({
		url : '../GetDeptList', // 请求后台的URL（*）
		method : 'get', // 请求方式（*）
		toolbar : '#toolbar', // 工具按钮用哪个容器
		striped : true, // 是否显示行间隔色
		cache : false, // 是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
		pagination : true, // 是否显示分页（*）
		sortable : false, // 是否启用排序
		sortOrder : "asc", // 排序方式
		checkbox : true,

		sidePagination : "server", // 分页方式：client客户端分页，server服务端分页（*）
		pageNumber : 1, // 初始化加载第一页，默认第一页
		pageSize : 50, // 每页的记录行数（*）
		pageList : [ 10, 25, 50, 100 ], // 可供选择的每页的行数（*）
		strictSearch : true,
		clickToSelect : true, // 是否启用点击选中行
		height : 700, // 行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
		uniqueId : "id", // 每一行的唯一标识，一般为主键列
		cardView : false, // 是否显示详细视图
		detailView : false,

		columns : [ {
			field : 'deptId',
			title : '序号'
		}, {
			field : 'deptNO',
			title : '部门编号'
		}, {
			field : 'deptName',
			title : '部门名称'
		}, {
			field : 'dpPhone',
			title : '联系方式'
		}, {
			field : 'dpProfile',
			title : '备注'
		}, {
			field : 'superDeptName',
			title : '上级部门'
		} ]
	});
}

function SavaOrUpdate(){
	var deptId = $('#deptId').val();
	if(deptId==""){
		savaDept();
	}else{
		updateDept();
	}
}

// 弹出部门名称框下拉列表
/*
 * function InitdeptName() { $.ajax({ type: "get", url:
 * "../GetDeptList", async: true, success: function(data) {
 * 
 * var innerHtml = ""; $.each(data.rows, function(i, val) { innerHtml += "<option
 * value=\"" + val.deptId + "\">" + val.deptName + "</option>"; });
 * $('#deptName').html(innerHtml); } }); }
 */

// 弹出上级部门名称框下拉列表
function InitsuperName() {
	$.ajax({
		type : "get",
		url : "../GetDeptList",
		dataType : 'json',
		async : true,
		success : function(data) {

			var innerHtml = "";

			$.each(data.rows, function(i, val) {

				innerHtml += "<option value=\"" + val.deptId + "\">"
						+ val.deptName + "</option>";

			});
			$('#superId').html(innerHtml);
		}
	});
}

// 添加按钮
function btnAdd_click() {
	$('#deptNO').val("");// 点完确定添加时下次再点添加清空文本框内的数据val("")
	$('#dpPhone').val("");
	$('#dpProfile').val("");
	$('#deptName').val("");
	$('#add').show();
	$('#edit').hide();
	$('#your-modal').modal('toggle');// 点击添加按钮时弹出模态框
}

// 修改按钮
function btnEdit_Click() {
	var index = $('#tbDept').find('tr.success').data('index');// 获取选中的行脚标
	var row = $('#tbDept').bootstrapTable('getData')[index];// 返回选中行所有数据
															// 通过脚标index找到选中的数据

	$('#deptId').val(row.deptId);// 修改时为隐藏的文本框赋值
	$('#deptNO').val(row.deptNO);// 给点击修改弹出的模态框里的编号赋值
	$('#dpPhone').val(row.dpPhone);// 给点击修改弹出的模态框里的电话赋值
	$('#deptName').val(row.deptName);
	$('#dpProfile').val(row.dpProfile);
	$('#add').hide();
	$('#edit').show();
	$('#your-modal').modal('toggle');// 点击编辑弹出模态框
}

// 删除按钮
function del() {
	var index = $('#tbDept').find('tr.success').data('index');// 获取选中的行脚标
	var row = $('#tbDept').bootstrapTable('getData')[index];// 返回选中行所有数据
															// 通过脚标index找到选中的数据
	$('#deptId').val(row.deptId);

	if (!confirm("确认要删除？")) {
		window.event.returnValue = false;          //取消
	} else {
		$.ajax({                         //确定删除时执行改方法
			type : "post",
			url : "../RemoveDeptInfo",
			datatype : 'json',
			data : {
				deptId : $('#deptId').val()
			},
			success : function(data) {
				 $("#tbDept").bootstrapTable('refresh', {url: "../GetDeptList" });
				
			}
		});
	
}









// 添加部门
function savaDept() {
	$.ajax({
		type : "post",
		url : "../SaveDeptInfo",
		datatype : 'json',
		data : {
			deptNO : $('#deptNO').val(),
			deptName : $('#deptName').val(),
			dpPhone : $('#dpPhone').val(),
			dpProfile : $('#dpProfile').val(),
			superId : $('#superId').val()
		},
		success : function(data) {
			alert("添加成功");
			 $("#tbDept").bootstrapTable('refresh', {url: "../GetDeptList" });
		}
	});
}

// 修改部门
function updateDept() {
	$.ajax({
		type : "post",
		url : "../UpdateDeptInfo",
		datatype : 'json',
		data : {
			deptId : $('#deptId').val(),
			deptNO : $('#deptNO').val(),
			deptName : $('#deptName').val(),
			dpPhone : $('#dpPhone').val(),
			dpProfile : $('#dpProfile').val(),
			superId : $('#superId').val()
		},
		success : function(data) {
			alert("修改成功");
			 $("#tbDept").bootstrapTable('refresh', {url: "../GetDeptList" });
		}
	});
}
}