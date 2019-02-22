$(document).ready(function() {
	//1.初始化Table
	InitTable();
	$('#tbNoticeType').on('click-row.bs.table', function(e, row, element) {
		$('.success').removeClass('success');// 去除之前选中的行的样式
		$(element).addClass('success');// 添加当前选中的success样式用于区别
	});
	$('#btnAdd').bind('click', Add_click);
	$('#btnsubmit').bind('click', savaInfo);
	$('#btnEdit').bind('click', btnEdit_Click);
	$('#btnsure').bind('click', editInfo);
	$('#btnRemove').bind('click', del);
});

function InitTable() {
	$('#tbNoticeType').bootstrapTable('destroy');
	$('#tbNoticeType').bootstrapTable({
		url: '../noticeType/getAllNoticeType.do', //请求后台的URL（*）
		method: 'get', //请求方式（*）
		dateType:'json',
		toolbar: '#toolbar', //工具按钮用哪个容器
		striped: true, //是否显示行间隔色
		cache: false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
		pagination: true, //是否显示分页（*）
		sortable: false, //是否启用排序
		sortOrder: "asc", //排序方式

		sidePagination: "client", //分页方式：client客户端分页，server服务端分页（*）
		pageNumber: 1, //初始化加载第一页，默认第一页
		pageSize: 50, //每页的记录行数（*）
		pageList: [10, 25, 50, 100], //可供选择的每页的行数（*）
		strictSearch: true,
		clickToSelect: true, //是否启用点击选中行
		height: 460, //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
		uniqueId: "noticeid", //每一行的唯一标识，一般为主键列
		cardView: false, //是否显示详细视图
		detailView: false,
		//queryParams : queryParams,

		columns: [{
			field: 'noticetypeid',
			title: '序号',
			formatter : function(value, row, index) {
				return index + 1;
			}
		}, {
			field: 'noticetypename',
			title: '公告类型'
		}]
	});
}


//单击添加图标弹出模态框
function Add_click() {

	$('#noticetypename').val("");// 点完确定添加时下次再点添加清空文本框内的数据val("")                                              //?
	$('#myModal').modal('toggle');// 点击添加按钮时弹出模态框
}
//添加公告类型
function savaInfo() {
	
	
	$.ajax({
		type : "post",
		url : "../noticeType/addNoticeType.do",
		datatype : 'json',
		data : {
			noticetypename : $('#noticetypename').val()
		},
		success : function(data) {
			alert("添加成功");
			 $("#tbNoticeType").bootstrapTable('refresh', {url: "../noticeType/getAllNoticeType.do" });
		}
	});
}

//修改按钮
function btnEdit_Click() {
	var index = $('#tbNoticeType').find('tr.success').data('index');// 获取选中的行脚标
	var row = $('#tbNoticeType').bootstrapTable('getData')[index];// 返回选中行所有数据
															// 通过脚标index找到选中的数据

	$('#noticetypeid').val(row.noticetypeid);// 修改时为隐藏的文本框赋值
	$('#upnoticetypename').val(row.noticetypename);// 给点击修改弹出的模态框里的编号赋值
	$('#upModal').modal('toggle');// 点击编辑弹出模态框
}

//修改公告信息
function editInfo() {
	$.ajax({
		type : "post",
		url : "../noticeType/editNoticeType.do",
		datatype : 'json',
		data : {
			noticetypeid : $('#noticetypeid').val(),
			noticetypename : $('#upnoticetypename').val()
		},
		success : function(data) {
			alert("修改成功");
			 $("#tbNoticeType").bootstrapTable('refresh', {url: "../noticeType/getAllNoticeType.do" });
		}
	});
}

//删除公告
function del() {
	var index = $('#tbNoticeType').find('tr.success').data('index');// 获取选中的行脚标
	var row = $('#tbNoticeType').bootstrapTable('getData')[index];// 返回选中行所有数据
	// 通过脚标index找到选中的数据
	$('#noticetypeid').val(row.noticetypeid);

	if (!confirm("确认要删除？")) {
		window.event.returnValue = false; // 取消
	} else {
		$.ajax({ // 确定删除时执行改方法
			type : "post",
			url : "../noticeType/deleteNoticeType.do",
			datatype : 'json',
			data : {
				noticetypeid : $('#noticetypeid').val()
			},
			success : function(data) {
				$("#tbNoticeType").bootstrapTable('refresh', {
					url : "../noticeType/getAllNoticeType.do"
				});
			}
		});
	}
}