$(document).ready(function() {
	InitTable();
	$('#tbPayroll').on('click-row.bs.table', function(e, row, element) {
		$('.danger').removeClass('danger'); // 去除之前选中行的样式，选中样式
		$(element).addClass('danger'); // 添加当前选中的danger样式用于区别
	});

	$('#btnAdd').bind('click', btnAdd_Click); // 为添加按钮绑定事件
	$('#btnEdit').bind('click', btnEdit_Click); // 为修改选中按钮绑定事件

	$('#btnSubmit').bind('click',SaveOrUpdate);
	
	$('#btnswe').bind('click',deleteShow);

	
});

function SaveOrUpdate(){
	 var payrollid=$('#payrollId').val()
	  if (payrollid=="") {
		  Savepayroll();
	} else {
		UpdatePayroll();
	}
}
//修改弹出模态框
function btnEdit_Click() {
	var index = $('#tbPayroll').find('tr.danger').data('index'); // 获取选中行的行脚标
	var row = $('#tbPayroll').bootstrapTable('getData')[index]; // 返回选中行所有数据，通过行脚标
	$('#payrollId').val(row.payrollid);
	$('#empname').val(row.salary.employee.empname);
	$('#salary').val(row.salary.salary);
	$('#deductions').val(row.deductions);
	$('#payroll').val(row.salary.salary-row.deductions);
	$('#SaveModalLabel').hide();//隐藏添加方法标题这个标题
	$('#UpdateModalLabel').show();//显示修改标题
	$('#myModal').modal('show'); // 弹出模态框
}
//选中按钮弹出模态框并清空内容
function btnAdd_Click() {

	 $('#salaryId').val("");
	 $('#deductions').val("");
	$('#SaveModalLabel').show();//显示添加方法标题这个标题
	$('#UpdateModalLabel').hide();//隐藏修改标题
	$('#myModal').modal('show'); // 弹出模态框
}
//删除弹出模态框
function deleteShow(){
	  swal({
			title : "您确定要删除吗？",
			text : "您确定要删除这条数据？",
			type : "warning",
			showCancelButton : true,
			closeOnConfirm : false,
			confirmButtonText : "是的，我要删除",
			confirmButtonColor : "#ec6c62"
		}, function(isConfirm) {
			if (isConfirm) {
				 
				removePayroll();//删除事件
				swal({
					title : "删除成功！",
					text : "您已经永久删除了这条信息。",
					type : "success"
				}, function() {
			
				});

			}
			
		});
}

function InitTable() {
	$('#tbPayroll').bootstrapTable({
		url : '../payroll/getAll.do', // 请求后台的URL（*）
		method : 'get', // 请求方式（*）
		dataType:'json',
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

		columns : [ 
		 {
			field : 'payrollid',
			title : 'ID'
		},{
			field : 'salary.employee.empname',
			title : '员工姓名'
		},{
			field : 'salary.salary',
			title : ' 基本工资'
		},{
			field : 'deductions',
			title : '扣款信息'
		},{
			field : 'salary.salary',
			title : '实发薪资',
			formatter : function(value, row, index) {
				
				return value-row.deductions;
			
				}
		}
		 ]

	});
} 

function Savepayroll() {
	$.ajax({
		  url:'../payroll/save.do',
		  method:'post',
		  dataType:'json',
		  data:{	
			  
			  salaryid:$('#salaryId').val(),
			  deductions:$('#deductions').val()
		  },

		  success:function(data){
			  alert("添加成功");
			 $("#tbPayroll").bootstrapTable('refresh', {url: "../payroll/getAll.do" });
		  }
	});

}
//修改
function UpdatePayroll() {
	
	$.ajax({
		  url:'../payroll/update.do',
		  method:'post',
		  dataType:'json',
		  data:{	
			  salaryid:$('#salaryId').val(),
			  deductions:$('#deductions').val(),
			  payrollid:$('#payrollId').val()
			  
		  },

		  success:function(data){
			  alert("修改成功");
			  $("#tbPayroll").bootstrapTable('refresh', {url: "../payroll/getAll.do" });
		  }
	});
}
// 删除
function removePayroll(){
	var index = $('#tbPayroll').find('tr.danger').data('index'); // 获取选中行的行脚标
	var row = $('#tbPayroll').bootstrapTable('getData')[index]; // 返回选中行所有数据，通过行脚标
	$('#payrollId').val(row.payrollid);
	$.ajax({
	  url:'../payroll/delete.do',
	  method:'post',
	  dataType:'json',
	  data:{	
		  payrollid:$('#payrollId').val()
	  },

	  success:function(data){
		  alert("删除成功");
		  $("#tbPayroll").bootstrapTable('refresh', {url: "../payroll/getAll.do" });
	  }
});
}