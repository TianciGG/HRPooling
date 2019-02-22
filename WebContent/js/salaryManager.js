  $(document).ready(function() {

//	  alert(InitTable());
	InitTable(); // 1.初始化Table
	// 选择行
	$('#tbDept').on('click-row.bs.table', function(e, row, element) {
		$('.danger').removeClass('danger'); // 去除之前选中行的样式，选中样式
		$(element).addClass('danger'); // 添加当前选中的danger样式用于区别
	});

	$('#btnAdd').bind('click', btnAdd_Click); // 为添加按钮绑定事件
	$('#btnEdit').bind('click', btnEdit_Click); // 为修改选中按钮绑定事件

	$('#btnSubmit').bind('click',SaveOrUpdate);
	
	$('#btnswe').bind('click',deleteShow);
	// 删除弹出框
	SelectEmpName() ;
});
  function SaveOrUpdate(){
	  var salaryid=$('#salaryId').val()
	  if (salaryid=="") {
		  SaveSalary();
	} else {
		UpdateSalary();
	}
  }
  //弹出删除模态框
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
				 
				removeSalary();//删除事件
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
	$('#tbDept').bootstrapTable({
		url : '../salary/getAll.do', // 请求后台的URL（*）
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
			field : 'salaryid',
			title : 'ID'
		}, {
			field : 'employee.empname',
			title : '员工姓名'
		},{
			field : 'employee.empno',
			title : '员工编号'
		},{
			field : 'employee.dept.deptname',
			title : '部门'
		} ,{
			field : 'employee.duty.dutyname',
			title : '职位'
		} ,{
			field : 'salary',
			title : '基本工资'
		}
		 ]

	});
}
// 清空内容事件
function btnAdd_Click() {
     $('#employee.empname').val("");
	 $('#salary').val("");
	
	$('#SaveModalLabel').show();//显示添加方法标题这个标题
	$('#UpdateModalLabel').hide();//隐藏修改标题
	$('#myModal').modal('show'); // 弹出模态框
}
// 选中修改事件
function btnEdit_Click() {
	var index = $('#tbDept').find('tr.danger').data('index'); // 获取选中行的行脚标
	var row = $('#tbDept').bootstrapTable('getData')[index]; // 返回选中行所有数据，通过行脚标
	$('#salaryId').val(row.salaryid);
	// index找到选中的数据
	$('#empId').val(row.employee.empname);
	$('#salary').val(row.salary);
	$('#SaveModalLabel').hide();//隐藏添加方法标题这个标题
	$('#UpdateModalLabel').show();//显示修改标题
	$('#myModal').modal('show'); // 弹出模态框
}
//修改
function UpdateSalary() {
	
	$.ajax({
		  url:'../salary/update.do',
		  method:'post',
		  dataType:'json',
		  data:{	
			  //employee.empname: $('#empId').val(),
	          salary: $('#salary').val(),
	          salaryid: $('#salaryId').val()
			     
		  },

		  success:function(data){
			  alert("修改成功");
			  $("#tbDept").bootstrapTable('refresh', {url: "..//salary/getAll.do" });
		  }
	});

}
// 为保存按钮添加事件
function SaveSalary() {
	
	$.ajax({
		  url:'../salary/save.do',
		  method:'post',
		  dataType:'json',
		  data:{	
			  empid: $('#empId').val(),
	          salary: $('#salary').val()
				   
		  },

		  success:function(data){
			  alert("添加成功");
			  $("#tbDept").bootstrapTable('refresh', {url: "../salary/getAll.do" });
		  }
	});

}
function removeSalary(){
	var index = $('#tbDept').find('tr.danger').data('index'); // 获取选中行的行脚标
	var row = $('#tbDept').bootstrapTable('getData')[index]; // 返回选中行所有数据，通过行脚标
	$('#salaryId').val(row.salaryid);
	$.ajax({
	  url:'../salary/delete.do',
	  method:'post',
	  dataType:'json',
	  data:{	
		  salaryid: $('#salaryId').val()
	  },

	  success:function(data){
		  alert("删除成功");
		  $("#tbDept").bootstrapTable('refresh', {url: "../salary/getAll.do" });
	  }
});
}
//获取员工姓名的下拉列表
function SelectEmpName() {
	$.ajax({
		type : "get", // HTTP 提交方式，
		url : '../employee/getAll.do',
		dataType:'json',
		async : true,
		success : function(data) {

			var innerHtml = "";
			$.each(data.rows, function(i, val) {
				innerHtml += "<option value=\"" + val.empid + "\">"
						+ val.empname + "</option>";
			});

			$('#empId').html(innerHtml);
		}
	});
}

