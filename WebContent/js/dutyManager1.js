$(document).ready(function() {

	
	InitTable();//1.初始化Table
	
	
	$('#tbDuty').on('click-row.bs.table',function(e,row,element){
		$('.success').removeClass('success');//去除之前选中的行的样式
		$(element).addClass('success');//添加当前选中的success样式用于区别
	});
	
	InitDept();//弹出部门名称下拉列表
	InitsuperName();//3.弹出上级部门名称框下拉列表
	$('#btnAdd').bind('click',btnAdd_click);
	$('#btnEdit').bind('click',btnEdit_Click);
	$('#btnsubmit').bind('click', saveORupdate);// 为确定按钮绑定事件
	$('#btnRemove').bind('click', del);
	

});

//1.初始化Table
function InitTable() {
	$('#tbDuty').bootstrapTable({
		url:  "../GetDutyList", //请求后台的URL（*）
		method: 'get', //请求方式（*）
		toolbar: '#toolbar', //工具按钮用哪个容器
		striped: true, //是否显示行间隔色
		cache: false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
		pagination: true, //是否显示分页（*）
		sortable: false, //是否启用排序
		sortOrder: "asc", //排序方式
		checkbox:true,

		sidePagination: "server", //分页方式：client客户端分页，server服务端分页（*）
		pageNumber: 1, //初始化加载第一页，默认第一页
		pageSize: 50, //每页的记录行数（*）
		pageList: [10, 25, 50, 100], //可供选择的每页的行数（*）
		strictSearch: true,
		clickToSelect: true, //是否启用点击选中行
		height: 460, //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
		uniqueId: "dutyId", //每一行的唯一标识，一般为主键列
		cardView: false, //是否显示详细视图
		detailView: false,

		columns: [{
			field: 'dutyId',
			title: '序号'
		}, {
			field: 'dutyName',
			title: '职务名称'
		},  {
			field: 'deptName',
			title: '部门名称'
		}, {
			field: 'deptName',
			title: '上级'
		},{
			field: 'dutydes',
			title: '职务描述'
		}]
	});
}

//部门名称下拉
function InitDept() {

	
	$.ajax({
		type: "get",
		url:  "../GetDeptList",
		dataType:'json',
		async: true,
		success: function(data) {
			var innerHtml = "";
			$.each(data.rows, function(i, val) {
				innerHtml += "<option value=\"" + val.deptId + "\">" + val.deptName + "</option>";
			});
		
			$('#deptId').html(innerHtml);
		}
	
	});
}


//3.弹出上级名称框下拉列表
function InitsuperName() {
	$.ajax({
		type: "get",
		url:  "../GetDutyList",
		async: true,
		dataType:'json',
		success: function(data) {

			var innerHtml = "";
			$.each(data.rows, function(i, val) {
				innerHtml += "<option value=\"" + val.dutyId + "\">" + val.dutyName + "</option>";
			});
//			alert(innerHtml);
			$('#superId').html(innerHtml);
		}
	});
}

function btnAdd_click(){
	$('#dutyName').val("");//点完确定添加时下次再点添加清空文本框内的数据val("")
	$('#dutydes').val("");
	$('#deptId').val("");
	$('#superId').val("");
	$('#save').show();
	$('#edit').hide();
	
	$('#your-modal').modal('toggle');// 点击添加按钮时弹出模态框
}

//添加
function saveDuty() {
	
//	alert($('#dutyId').val());
	
	$.ajax({
		type : "post",
		url :  "../SaveDutyInfo",
		datatype : 'json',
		data : {
			dutyId:$('#dutyId').val(),
			dutyName : $('#dutyName').val(),
			dutydes : $('#dutydes').val(),
			deptId : $('#deptId').val(),
			superId : $('#superId').val()
		},
		success : function(data) {
			alert("添加成功");
			$("#tbDuty").bootstrapTable('refresh', {url: "../GetDutyList" });
		}
	});
}


function btnEdit_Click(){
	var index = $('#tbDuty').find('tr.success').data('index');//获取选中的行脚标
	var row = $('#tbDuty').bootstrapTable('getData')[index];//返回选中行所有数据 通过脚标index找到选中的数据
	$('#dutyId').val(row.dutyId);// 修改时为隐藏的文本框赋值
	$('#dutyName').val(row.dutyName);//给点击修改弹出的模态框里的编号赋值
	$('#dutydes').val(row.dutydes);//给点击修改弹出的模态框里的电话赋值
	$('#deptId').val(row.deptId);
	$('#superId').val(row.superId);
	$('#save').hide();
	$('#edit').show();
	$('#your-modal').modal('toggle');//点击编辑弹出模态框
}

//修改
function updateDuty() {
	$.ajax({
		type : "post",
		url :  "../UpdateDutyInfo",
		datatype : 'json',
		data : {
			dutyId : $('#dutyId').val(),
			dutyName : $('#dutyName').val(),
			dutydes : $('#dutydes').val(),
			deptId : $('#deptId').val(),
			superId : $('#superId').val()
		},
		success : function(data) {
			alert("修改成功");
			$("#tbDuty").bootstrapTable('refresh', {url:  "../GetDutyList" });
		}
	});
}

//确定按钮
function saveORupdate(){
	var dutyId=$("#dutyId").val();
	
	if(dutyId==""){
		saveDuty();
	}else{
		updateDuty();
	}
}


//删除按钮
function del() {
	var index = $('#tbDuty').find('tr.success').data('index');// 获取选中的行脚标
	var row = $('#tbDuty').bootstrapTable('getData')[index];// 返回选中行所有数据
															// 通过脚标index找到选中的数据
	$('#dutyId').val(row.dutyId);

	if (!confirm("确认要删除？")) {
		window.event.returnValue = false;
	} else {
		$.ajax({
			type : "post",
			url : "../RemoveDutyInfo",
			datatype : 'json',
			data : {
				dutyId : $('#dutyId').val()
			},
			success : function(data) {
				 $("#tbDuty").bootstrapTable('refresh', {url:  "../GetDutyList" });
				
			}
		});
	}
}
