$(document).ready(function() {

	// 1.初始化Table
	InitTable1();
	
	
	$('#t_education').on('click-row.bs.table', function(e, row, element) {
		$('.success').removeClass('success');// 去除之前选中的行的样式
		$(element).addClass('success');// 添加当前选中的success样式用于区别
	});
	
	$('#btnAdd1').bind('click', btnAddEdu);
	$('#saveEdu').bind('click', saveEdu);
	
	
	$('#btnEdit1').bind('click', btnEditEdu);
	$('#editEdu').bind('click', editEdu);
	
	$('#btnRemove1').bind('click', delEdu);
	
	//	搜索按钮 模糊查询
	$('#btnSearch1').bind('click',InitTable1);
	

	
	
	InitTable2();
	
	InitType();

	$('#t_workexperience').on('click-row.bs.table', function(e, row, element) {
		$('.success').removeClass('success');// 去除之前选中的行的样式
		$(element).addClass('success');// 添加当前选中的success样式用于区别
	});
	
	$('#btnAdd2').bind('click', btnAddWork);
	$('#saveWork').bind('click', saveWork);
	
	
	$('#btnEdit2').bind('click', btnEditWork);
	$('#editWork').bind('click', editWork);
	
	$('#btnRemove2').bind('click', delWork);

//	搜索按钮 模糊查询
	$('#btnSearch2').bind('click',InitTable2);

});

function InitTable1() {
	
	$('#t_education').bootstrapTable('destroy');
	$('#t_education').bootstrapTable({
		url : '../education/getAll.do', // 请求后台的URL（*）
		method : 'get', // 请求方式（*）
		dataType:'json',
		toolbar : '#toolbar1', // 工具按钮用哪个容器
		
		striped : true, // 是否显示行间隔色
		cache : false, // 是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
		pagination : true, // 是否显\/8j示分页（*）
		sortable : false, // 是否启用排序
		sortOrder : "asc", // 排序方式
		checkbox : true,
        queryParams:queryParams,//分页模糊查询
		sidePagination : "server", // 分页方式：client客户端分页，server服务端分页（*）
		pageNumber : 1, // 初始化加载第一页，默认第一页
		pageSize : 8, // 每页的记录行数（*）
		pageList : [ 5, 10, 20], // 可供选择的每页的行数（*）
		strictSearch : true,
		clickToSelect : true, // 是否启用点击选中行
		height : 460, // 行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
		uniqueId : "eduId", // 每一行的唯一标识，一般为主键列
		cardView : false, // 是否显示详细视图
		detailView : false,

		columns : [ {
			field : 'eduid',//对应实体类的字段名
			align : "center",
			title : '序号'
		}, {
			field : 'starttime',
			align : "center",
			title : '开始时间'
		}, {
			field : 'endtime',
			align : "center",
			title : '结束时间'
		}, {
			field : 'school',
			align : "center",
			title : '就读学校'
		}, {
			field : 'major',
			align : "center",
			title : '专业'
		}, {
			field : 'degree.display',
			align : "center",
			title : '学历'
		}
		/*,{
			field : 'caozuo',
			align : "center",
			title : '操作',
			formatter : function(value, row, index) {
				return "<a href='javascript:btnEditEdu()'><span class='glyphicon glyphicon-pencil'> </a> "
						+ "<a href='javascript:delEdu()'><span class='glyphicon glyphicon-trash'> </a> ";
			}
		
		} */
		]
	});
}
//分页模糊查询
function queryParams(params){
	var temp={//这里的关键的名字和控制器的变量名必须一致，这边改动，控制器也需要改成一样的
			limit:params.limit,
			offset:params.offset,
//			后台请求查询参数
			schoolName:$('#schoolName').val(),
			
			
			companyName:$('#companyName').val()
			
			
	};
	return temp;
};


/*function InitTable() {
$('#t_education').datagrid({
	
	url:'data/t_education.json',
	columns:[[
		{field:'eduId',title:'序号',width:100,align:'center'},
		{field:'startTime',title:'开始时间',width:200,align:'center'},
		{field:'endTime',title:'结束时间',width:200,align:'center'},
		{field:'school',title:'就读学校',width:300,align:'center'},
		{field:'major',title:'专业',width:300,align:'center'},
		{field:'degreeId',title:'学历',width:300,align:'center'}
	]]
});
}*/



//添加按钮清空文本
function btnAddEdu() {
	$('#startTime1').val("");// 点完确定添加时下次再点添加清空文本框内的数据val("")
	$('#endTime1').val("");
	$('#school').val("");
	$('#major').val("");
	$('#degreeId').val("");
	$('#editEdu').hide();
	
	InitType();
	
	
	
	$('#myModal1').modal('toggle');// 点击添加按钮时弹出模态框
	
	
}

function saveEdu(){
	
	
//	alert($('#endTime').val());
	$.ajax({
		url:'../education/save.do',
		method : 'post',
		dataType : 'json',
		data:{
			starttime:new Date($('#startTime1').val()),//对应实体类段名
			endtime:new Date($('#endTime1').val()),
			school:$('#school').val(),
			major:$('#major').val(),
			degreeid:$('#degreeId').val()
		},
		success:function(data){
			alert("添加成功");
			$("#t_education").bootstrapTable('refresh', {url: "../education/getAll.do" });
		}
		
	});

}

function btnEditEdu(){
	var index = $('#t_education').find('tr.success').data('index');//获取选中的行脚标
	var row = $('#t_education').bootstrapTable('getData')[index];//返回选中行所有数据 通过脚标index找到选中的数据
	$('#eduId').val(row.eduid);// 修改时为隐藏的文本框赋值
	$('#startTime1').val(row.starttime);//给点击修改弹出的模态框里的编号赋值
	$('#endTime1').val(row.endtime);//给点击修改弹出的模态框里的电话赋值
	$('#school').val(row.school);
	$('#major').val(row.major);
	$('#degreeId').val(row.degreeid);//row.对应实体类字段
	$('#myModal2').modal('toggle');//点击编辑弹出模态框
	
	
}

function editEdu(){
	$.ajax({
		type : "post",
		url : "../education/update.do",
		datatype : 'json',
		data : {
			eduid:$('#eduId').val(),
			starttime:new Date($('#startTime1').val()),
			endtime:new Date($('#endTime1').val()),
			school:$('#school').val(),
			major:$('#major').val(),
			degreeid:$('#degreeId').val()
		},
		success : function(data) {
			alert("修改成功");
			$("#t_education").bootstrapTable('refresh', {url: "../education/getAll.do" });
		}
	});
}

//删除按钮
function delEdu() {
	var index = $('#t_education').find('tr.success').data('index');// 获取选中的行脚标
	var row = $('#t_education').bootstrapTable('getData')[index];// 返回选中行所有数据
//															 通过脚标index找到选中的数据
	$('#eduId').val(row.eduid);
//	alert($('#eduId').val());
	if (!confirm("确认要删除？")) {
		window.event.returnValue = false;
	} else {
		$.ajax({
			type : "post",
			url : "../education/delete.do",
			datatype : 'json',
			data : {
				eduId : $('#eduId').val()
			},
			success : function(data) {
				$("#t_education").bootstrapTable('refresh', {url: "../education/getAll.do" });
				
			}
		});
	}
}

//弹出框下拉列表
function InitType() {
	$.ajax({
		type : "get",
		url : "../dictValue/getDegreeList.do",
		dataType : 'json',
		async : true,
		success : function(data) {

			var innerHtml = "";

			$.each(data, function(i, val) {

				innerHtml += "<option value=\"" + val.typeid + "\">"
						+ val.display + "</option>";

			});
			$('#degreeId').html(innerHtml);
		}
	});
}



function InitTable2() {
	$('#t_workexperience').bootstrapTable('destroy');
	$('#t_workexperience').bootstrapTable({
		url : '../workExperience/getAll.do', // 请求后台的URL（*）
		method : 'get', // 请求方式（*）
		dataType:'json',
		toolbar : '#toolbar2', // 工具按钮用哪个容器
		striped : true, // 是否显示行间隔色
		cache : false, // 是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
		pagination : true, // 是否显示分页（*）
		sortable : false, // 是否启用排序
		sortOrder : "asc", // 排序方式
		checkbox : true,
		
		sidePagination : "server", // 分页方式：client客户端分页，server服务端分页（*）
		pageNumber : 1, // 初始化加载第一页，默认第一页
		pageSize : 8, // 每页的记录行数（*）
		pageList : [ 5, 10, 20, 100 ], // 可供选择的每页的行数（*）
		strictSearch : true,
		queryParams:queryParams,
		clickToSelect : true, // 是否启用点击选中行
		height : 460, // 行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
		uniqueId : "workexperienceId", // 每一行的唯一标识，一般为主键列
		cardView : false, // 是否显示详细视图
		detailView : false,

		columns : [ {
			field : 'workexperienceid',
			align : "center",
			title : '序号'
		}, {
			field : 'starttime',
			align : "center",
			title : '开始时间'
		}, {
			field : 'endtime',
			align : "center",
			title : '结束时间'
		}, {
			field : 'company',
			align : "center",
			title : '所在公司'
		}, {
			field : 'position',
			align : "center",
			title : '职位'
		}, {
			field : 'basicinfoid',
			align : "center",
			title : '个人信息ID'
		}
		/*,{
			field : 'caozuo',
			align : "center",
			title : '操作',
			formatter : function(value, row, index) {
				return "<a href='javascript:btnAddWork()'><span class='glyphicon glyphicon-plus'> </a> "
						+ "<a><span class='glyphicon glyphicon-pencil'> </a> "
						+ "<a><span class='glyphicon glyphicon-trash'> </a> ";
			}
		
		}*/
		
		]
	});
}





//添加按钮清空文本
function btnAddWork() {
	
	
	$('#startTime2').val("");// 点完确定添加时下次再点添加清空文本框内的数据val("")
	$('#endTime2').val("");
	$('#company').val("");
	$('#position').val("");
	$('#basicInfoId').val("");
	$('#editWork').hide();
	
	$('#your-modal2').modal('toggle');// 点击添加按钮时弹出模态框
}



function saveWork(){
	$.ajax({
		url:'../workExperience/save.do',
		method : 'post',
		dataType : 'json',
		data:{
			starttime:new Date($('#startTime2').val()),//对应实体类段名
			endtime:new Date($('#endTime2').val()),
			company:$('#company').val(),
			position:$('#position').val(),
			basicinfoid:$('#basicInfoId').val()
		},
		success:function(data){
			alert("添加成功");
			$("#t_workexperience").bootstrapTable('refresh', {url: "../workExperience/getAll.do" });
		}
		
	});

}

function btnEditWork(){
	var index = $('#t_workexperience').find('tr.success').data('index');//获取选中的行脚标
	var row = $('#t_workexperience').bootstrapTable('getData')[index];//返回选中行所有数据 通过脚标index找到选中的数据
	$('#workexperienceId').val(row.workexperienceid);// 修改时为隐藏的文本框赋值
	$('#startTime2').val(row.starttime);//给点击修改弹出的模态框里的编号赋值
	$('#endTime2').val(row.endtime);//给点击修改弹出的模态框里的电话赋值
	$('#company').val(row.company);
	$('#position').val(row.position);
	$('#basicInfoId').val(row.basicInfoid);//row.对应实体类字段
	$('#saveWork').hide();
	$('#your-modal2').modal('toggle');//点击编辑弹出模态框
	
	
}

function editWork(){
	$.ajax({
		type : "post",
		url : "../workExperience/update.do",
		datatype : 'json',
		data : {
			workexperienceid:$('#workexperienceId').val(),
			starttime:new Date($('#startTime2').val()),
			endtime:new Date($('#endTime2').val()),
			company:$('#company').val(),
			position:$('#position').val(),
			basicInfoid:$('#basicInfoId').val()
		},
		success : function(data) {
			alert("修改成功");
			$("#t_workexperience").bootstrapTable('refresh', {url: "../workExperience/getAll.do" });
		}
	});
}

//删除按钮
function delWork() {
	var index = $('#t_workexperience').find('tr.success').data('index');// 获取选中的行脚标
	var row = $('#t_workexperience').bootstrapTable('getData')[index];// 返回选中行所有数据
//															 通过脚标index找到选中的数据
	$('#workexperienceId').val(row.workexperienceid);
//	alert($('#eduId').val());
	if (!confirm("确认要删除？")) {
		window.event.returnValue = false;
	} else {
		$.ajax({
			type : "post",
			url : "../workExperience/delete.do",
			datatype : 'json',
			data : {
				workexperienceid : $('#workexperienceId').val()
			},
			success : function(data) {
				$("#t_workexperience").bootstrapTable('refresh', {url: "../workExperience/getAll.do" });
				
			}
		});
	}
}


