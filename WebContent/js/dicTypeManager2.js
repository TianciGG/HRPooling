$(document).ready(function() {

	// 1.初始化Table
	InitTable();

	$('#tbDicType').on('click-row.bs.table', function(e, row, element) {
		$('.success').removeClass('success');// 去除之前选中的行的样式
		$(element).addClass('success');// 添加当前选中的success样式用于区别
	});


	$('#btnAdd').bind('click', btnAdd_click);
	$('#btnEdit').bind('click', btnEdit_Click);// 为修改按钮绑定时间
	$('#btnSubmit').bind('click', SaveOrUpdate);
	$('#btnRemove').bind('click', removeDicType);

});


//初始化表格，查询表格中的数据	
function InitTable() {
	$('#tbDicType').bootstrapTable({
		url : '../QueryDicType', // 请求后台的URL（*）
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

		columns : [ {
			field : 'id',
			title : '序号',
			formatter : function(value, row, index) {
				return index + 1;
			}
		}, {
			field : 'name',
			title : '类型名称'
		}, {
			field : 'des',
			title : '类型描述'
		} ]
	});
}



function SaveOrUpdate(){
	 var dicId = $('#dicid').val();
	 if(dicId==""){
		 savaDicType();
	 }else{
		 updateDicType();
	 }
}




//当点击添加按钮时弹出模态框
function btnAdd_click() {
	$('#name').val("");// 点完确定添加时下次再点添加清空文本框内的数据val("")
	$('#des').val("");
	$('#save').show();
	$('#edit').hide();
	$('#your-modal').modal('toggle');// 点击添加按钮时弹出模态框
}

//当点击修改按钮时弹出模态框
function btnEdit_Click() {
	var index = $('#tbDicType').find('tr.success').data('index');// 获取选中的行脚标
	var row = $('#tbDicType').bootstrapTable('getData')[index];// 返回选中行所有数据
															// 通过脚标index找到选中的数据

	$('#dicid').val(row.id);// 修改时为隐藏的文本框赋值
	$('#name').val(row.name);// 给点击修改弹出的模态框里的编号赋值
	$('#des').val(row.des);// 给点击修改弹出的模态框里的电话赋值
	$('#save').hide();
	$('#edit').show();
	$('#your-modal').modal('toggle');// 点击编辑弹出模态框
}


//保存模态框中添加的数据
function savaDicType() {
	$.ajax({
		type : "post",
		url : "../AddDicType",
		datatype : 'json',
		data : {
			name : $('#name').val(),
			des : $('#des').val()
		},
		success : function(data) {
			alert("添加成功");
			 $("#tbDicType").bootstrapTable('refresh', {url: "../QueryDicType" });
		}
	});
}

//当点击修改按钮时弹出模态框
function updateDicType() {
	
	$.ajax({
		type : "post",
		url : "../UpdateDicType",
		datatype : 'json',
		data : {
			id : $('#dicid').val(),
			name : $('#name').val(),
			des : $('#des').val()
		},
		success : function(data) {
			alert("修改成功");
			 $("#tbDicType").bootstrapTable('refresh', {url: "../QueryDicType" });
		}
	});
}


//删除按钮
function removeDicType() {
	var index = $('#tbDicType').find('tr.success').data('index');// 获取选中的行脚标
	var row = $('#tbDicType').bootstrapTable('getData')[index];// 返回选中行所有数据
															// 通过脚标index找到选中的数据
	$('#dicid').val(row.id);
	

	if (!confirm("确认要删除？")) {
		window.event.returnValue = false;          //取消
	} else {
		$.ajax({                         //确定删除时执行改方法
			type : "post",
			url : "../RemoveDicType",
			datatype : 'json',
			data : {
				id : $('#dicid').val()
			},
			success : function(data) {
				 $("#tbDicType").bootstrapTable('refresh', {url: "../QueryDicType" });
				
			}
		});
	}
}





