//Jquery的框架区，里面名称 不写方法。
 $(document).ready(function(){
	 		InitTable();//初始化表格
	 		//选中行
	 		$('#tbDept').on('click-row.bs.table', function(e, row, element) {
	 			$('.success').removeClass('success');// 去除之前选中的行的样式
	 			$(element).addClass('success');// 添加当前选中的success样式用于区别
	 		});

		 $('#btnAdd').bind('click',addShow);//点击添加弹出模态框事件
		 $('#btnEdit').bind('click',editShow);
		 
		 $('#btnsubmit').bind('click', SavaOrUpdate);
		 $('#btnRemove').bind('click',removeUser);//弹出删除模态框
	 });
 
 
 function InitTable() {
		$('#tbDept').bootstrapTable({
			url : '../GetUserInfo', // 请求后台的URL（*）
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


			columns : [ 
			 {
				field : 'userId',
				title : 'userId'
			}, {
				field : 'userName',
				title : '用户名称'
			}, {
				field : 'uPassword',
				title : '用户密码'
			}
			 ]
		});
	}
 function SavaOrUpdate(){
		var userId = $('#userId').val();
		if(userId==""){
			saveUser();
		}else{
			updateUser();
		}
	}
 
 
	//非框架区  声明一堆function
 
	function addShow(){
		$('#Username').val("");//清空input中的数据，赋空值
		$('#Password').val("");
		$('#save').show();
		$('#edit').hide();
		$('#your-modal').modal('toggle');//手动打开模态框
	}
	function editShow(){
		var index = $('#tbDept').find('tr.danger').data('index'); // 获取选中行的行脚标
		var row = $('#tbDept').bootstrapTable('getData')[index]; // 返回选中行所有数据，通过行脚标
		
		// index找到选中的数据
		$('#Username').val(row.userName);//清空input中的数据，赋空值
		$('#Password').val(row.uPassword);
		$('#save').show();
		$('#edit').hide();
		$('#your-modal').modal('toggle');//手动打开模态框
		
	}
	//修改数据用post
function saveUser(){
	$.ajax({
		type : "post",
		url : "../SaveUserInfo",
		datatype : 'json',
		data : {
			userName: $('#Username').val(),//获取到的值添加给userName
			uPassword : $('#Password').val()
		
		},
		success : function(data) {
			alert("添加成功");
			 $("#tbDept").bootstrapTable('refresh', {url: "../GetUserInfo" });
		}
	});

}
//为修改按钮添加事件
function updateUser(){
	var index = $('#tbDept').find('tr.danger').data('index'); // 获取选中行的行脚标
	var row = $('#tbDept').bootstrapTable('getData')[index]; // 返回选中行所有数据，通过行脚标
	$('#userId').val(row.userId);
	
	
	$.ajax({
		type : "post",
		url : "../UpdateUserInfo",
		datatype : 'json',
		data : {
			userName: $('#Username').val(),
			uPassword : $('#Password').val(),
			userId : $('#userId').val()
		},
		success : function(data) {
			alert("修改成功");
			 $("#tbDept").bootstrapTable('refresh', {url: "../GetUserInfo" });//在增加，删除，修改成功之后，自动更新页面。相当重新获取表格内容。
		}
	});


}

//真正的删除
function removeUser(){
	 var index = $('#tbDept').find('tr.danger').data('index'); // 获取选中行的行脚标
	var row = $('#tbDept').bootstrapTable('getData')[index]; // 返回选中行所有数据，通过行脚标
		$('#userId').val(row.userId);
		if (!confirm("确认要删除？")) {
			window.event.returnValue = false;          //取消
		} else {
			$.ajax({                         //确定删除时执行改方法
				type : "post",
				url : "../DeleteUserInfo",
				datatype : 'json',
				data : {
					userId : $('#userId').val()
				},
				success : function(data) {
					 $("#tbDept").bootstrapTable('refresh', {url: "../QueryDicType" });
					
				}
			});
		} 

}
