$(function() {
	$('#myTab a:first').tab("show");// 初始化显示哪个tab
	searchTable1();
	$("#btnSetSpider1").click(function() {
		$("#urlName").val("智联招聘网");
		$('#prompt-modal').modal("toggle");
	});
	$("#btnSetSpider2").click(function() {
		$("#urlName").val("前程无忧网");
		$('#prompt-modal').modal("toggle");
	});
	$("#btnCleanSpider1").click(function() {
		$('#confirm-modal').modal("toggle");
	});
	$("#btnCleanSpider2").click(function() {
		$('#confirm-modal').modal("toggle");
	});
	$("#QianCheng").click(function() {
		searchTable2();
	});
	$("#btn_add1").on("click", dataAddModalShow1);
	$("#btn_edit1").on("click", dataEditModalShow1);
	$("#btn_add2").on("click", dataAddModalShow2);
	$("#btn_edit2").on("click", dataEditModalShow2);
	$("#btn_delete1").on("click", dataDelModalShow1);
	$("#btn_delete2").on("click", dataDelModalShow2);

	$("#spiderSubmit").on("click", insertSpiderPage);

	$("#tblResult1").on('click-row.bs.table', function(e, row, element) {
		$('.success').removeClass('success');// 去除之前选中的行的，选中样式
		$(element).addClass('success');// 添加当前选中的 success样式用于区别
	});
	$("#tblResult2").on('click-row.bs.table', function(e, row, element) {
		$('.success').removeClass('success');// 去除之前选中的行的，选中样式
		$(element).addClass('success');// 添加当前选中的 success样式用于区别
	});
});
function dataAddModalShow1() {
	$("#editModalHead").text("添加数据");
	$("#editModalBody").text("");
	var header = "<div class='am-input-group am-g' style='margin-bottom:10px;'><lable class='am-u-sm-4' style='text-align:right;font-weight:bold;'>";
	var positionHtml = header
			+ "职位名称：</lable><input type='text' id='addPosition' class='am-u-sm-6 am-u-end'></div>";
	var companyHtml = header
			+ "公司名称：</lable><input type='text' id='addCompany' class='am-u-sm-6 am-u-end'></div>";
	var workplaceHtml = header
			+ "工作地点：</lable><input type='text' id='addWorkplace' class='am-u-sm-6 am-u-end' ></div>";
	var salaryHtml = header
			+ "职位月薪：</lable><input type='text' id='addSalary' class='am-u-sm-6 am-u-end'></div>";
	var dateHtml = header
			+ "发布日期：</lable><input type='date' id='addDate' class='am-u-sm-6 am-u-end'></div>";
	var companynatureHtml = header
			+ "公司性质：</lable><input type='text' id='addCompanynature' class='am-u-sm-6 am-u-end'></div>";
	var companyscaleHtml = header
			+ "公司规模：</lable><input type='text' id='addCompanyscale' class='am-u-sm-6 am-u-end'></div>";
	var experienceHtml = header
			+ "经验要求：</lable><input type='text' id='addExperience' class='am-u-sm-6 am-u-end'></div>";
	var educationHtml = header
			+ "学历要求：</lable><div class='am-u-sm-6 am-u-end' style='text-align:left;'><input name='addEducation' type='radio' value='无要求' style='margin-left:-10px;' checked/>无要求"
			+ "<input name='addEducation' type='radio' value='大专及以上' />大专及以上<input name='addEducation' type='radio' value='本科及以上' />本科及以上</div></div>";
	var jobdescriptionHtm = "<div class='am-form-group am-g'><label class='am-u-sm-4' style='text-align:right;font-weight:bold;'>工作描述：</label><textarea id='addJobdescription' class='am-u-sm-6 am-u-end' style='height:120px;'></textarea></div>";
	$("#editModalBody").append(positionHtml);
	$("#editModalBody").append(companyHtml);
	$("#editModalBody").append(workplaceHtml);
	$("#editModalBody").append(salaryHtml);
	$("#editModalBody").append(companynatureHtml);
	$("#editModalBody").append(companyscaleHtml);
	$("#editModalBody").append(experienceHtml);
	$("#editModalBody").append(educationHtml);
	$("#editModalBody").append(dateHtml);
	$("#editModalBody").append(jobdescriptionHtm);
	$("#biaoZhi").text("");
	$("#biaoZhi").text("添加");
	$("#biaoZhi").attr("onclick", "insertByData1()");
	$("#data-edit-modal").modal("toggle");
}
function dataAddModalShow2() {
	$("#editModalHead").text("添加数据");
	$("#editModalBody").text("");
	var header = "<div class='am-input-group am-g' style='margin-bottom:10px;'><lable class='am-u-sm-4' style='text-align:right;font-weight:bold;'>";
	var positionHtml = header
			+ "职位名称：</lable><input type='text' id='addPosition' class='am-u-sm-6 am-u-end'></div>";
	var companyHtml = header
			+ "公司名称：</lable><input type='text' id='addCompany' class='am-u-sm-6 am-u-end'></div>";
	var workplaceHtml = header
			+ "工作地点：</lable><input type='text' id='addWorkplace' class='am-u-sm-6 am-u-end' ></div>";
	var salaryHtml = header
			+ "职位月薪：</lable><input type='text' id='addSalary' class='am-u-sm-6 am-u-end'></div>";
	var dateHtml = header
			+ "发布日期：</lable><input type='date' id='addDate' class='am-u-sm-6 am-u-end'></div>";
	$("#editModalBody").append(positionHtml);
	$("#editModalBody").append(companyHtml);
	$("#editModalBody").append(workplaceHtml);
	$("#editModalBody").append(salaryHtml);
	$("#editModalBody").append(dateHtml);
	$("#biaoZhi").text("");
	$("#biaoZhi").text("添加");
	$("#biaoZhi").attr("onclick", "insertByData2()");
	$("#data-edit-modal").modal("toggle");
}
function insertByData1() {
		$.ajax({
			type : "post",
			url : contextPath + "/spiderRecruit/insertData.do",
			data : {
				position : $("#addPosition").val().trim(),
				company : $("#addCompany").val().trim(),
				workplace : $("#addWorkplace").val().trim(),
				salary : $("#addSalary").val().trim(),
				date : $("#addDate").val(),
				companynature : $("#addCompanynature").val().trim(),
				companyscale : $("#addCompanyscale").val().trim(),
				experience : $("#addExperience").val().trim(),
				education : $("input[name='addEducation']:checked").val(),
				jobdescription : $("#addJobdescription").val().trim(),
				urlid : '1'
			},
			success : function(data) {
				if (data == 1) {
					$('#alert-modal').modal("toggle");
					searchTable1();
					searchTable2();
				} else {
					alert("失败！");
				}
			}
		})
}
function insertByData2() {
	$.ajax({
		type : "post",
		url : contextPath + "/spiderRecruit/insertData.do",
		data : {
			position : $("#addPosition").val().trim(),
			company : $("#addCompany").val().trim(),
			workplace : $("#addWorkplace").val().trim(),
			salary : $("#addSalary").val().trim(),
			date : $("#addDate").val(),
			urlid : '2'
		},
		success : function(data) {
			if (data == 1) {
				$('#alert-modal').modal("toggle");
				searchTable1();
				searchTable2();
			} else {
				alert("失败！");
			}
		}
	})
}
function dataEditModalShow1() {
	var index = $('#tblResult1').find('tr.success').data('index');// 获取选中的行脚标
	var row = $('#tblResult1').bootstrapTable('getData')[index];// 返回选中行所有数据
	$("#editDataId").val(row.recruitOtherInfo.id);
	$("#editModalHead").text("编辑数据");
	$("#editModalBody").text("");
	var header = "<div class='am-input-group am-g' style='margin-bottom:10px;'><lable class='am-u-sm-4' style='text-align:right;font-weight:bold;'>";
	var positionHtml = header
			+ "职位名称：</lable><input type='text' id='editPosition' class='am-u-sm-6 am-u-end' value='"
			+ row.position + "'></div>";
	var workplaceHtml = header
			+ "工作地点：</lable><input type='text' id='editWorkplace' class='am-u-sm-6 am-u-end' value='"
			+ row.workplace + "'></div>";
	var salaryHtml = header
			+ "职位月薪：</lable><input type='text' id='editSalary' class='am-u-sm-6 am-u-end' value='"
			+ row.salary + "'></div>";
	$("#editModalBody").append(positionHtml);
	$("#editModalBody").append(workplaceHtml);
	$("#editModalBody").append(salaryHtml);
	$("#biaoZhi").text("");
	$("#biaoZhi").text("修改");
	$("#biaoZhi").attr("onclick", "updateByData()");
	$("#data-edit-modal").modal("toggle");
}
function dataEditModalShow2() {
	var index = $('#tblResult2').find('tr.success').data('index');// 获取选中的行脚标
	var row = $('#tblResult2').bootstrapTable('getData')[index];// 返回选中行所有数据
	$("#editDataId").val(row.id);
	$("#editModalHead").text("编辑数据");
	$("#editModalBody").text("");
	var header = "<div class='am-input-group am-g' style='margin-bottom:10px;'><lable class='am-u-sm-4' style='text-align:right;font-weight:bold;'>";
	var positionHtml = header
			+ "职位名称：</lable><input type='text' id='editPosition' class='am-u-sm-6 am-u-end' value='"
			+ row.position + "'></div>";
	var workplaceHtml = header
			+ "工作地点：</lable><input type='text' id='editWorkplace' class='am-u-sm-6 am-u-end' value='"
			+ row.workplace + "'></div>";
	var salaryHtml = header
			+ "职位月薪：</lable><input type='text' id='editSalary' class='am-u-sm-6 am-u-end' value='"
			+ row.salary + "'></div>";
	$("#editModalBody").append(positionHtml);
	$("#editModalBody").append(workplaceHtml);
	$("#editModalBody").append(salaryHtml);
	$("#biaoZhi").text("");
	$("#biaoZhi").text("修改");
	$("#biaoZhi").attr("onclick", "updateByData()");
	$("#data-edit-modal").modal("toggle");
}
function updateByData() {
	$.ajax({
		type : "post",
		url : contextPath + "/spiderRecruit/updateById.do",
		data : {
			id : $("#editDataId").val(),
			position : $("#editPosition").val(),
			workplace : $("#editWorkplace").val(),
			salary : $("#editSalary").val()
		},
		success : function(data) {
			if (data == 1) {
				$('#alert-modal').modal("toggle");
				searchTable1();
				searchTable2();
			} else {
				alert("失败！");
			}
		}
	})
}
function dataDelModalShow1() {
	var index = $('#tblResult1').find('tr.success').data('index');// 获取选中的行脚标
	var row = $('#tblResult1').bootstrapTable('getData')[index];// 返回选中行所有数据
	$('#dataIndex').val(row.recruitOtherInfo.id);
	$('#data-delete-modal').modal("toggle");
}
function dataDelModalShow2() {
	var index = $('#tblResult2').find('tr.success').data('index');// 获取选中的行脚标
	var row = $('#tblResult2').bootstrapTable('getData')[index];// 返回选中行所有数据
	$('#dataIndex').val(row.id);
	$('#data-delete-modal').modal("toggle");
}
function delByIndex() {
	$.ajax({
		type : "post",
		url : contextPath + "/spiderRecruit/delectByIndex.do",
		data : {
			id : $('#dataIndex').val()
		},
		success : function(data) {
			if (data == 1) {
				$('#alert-modal').modal("toggle");
				searchTable1();
				searchTable2();
			} else {
				alert("失败！");
			}
		}
	})
}
function insertSpiderPage() {
	$.ajax({
		type : "post",
		url : contextPath + "/spiderRecruit/insertBySpiderPage.do",
		data : {
			urlName : $("#urlName").val(),
			pageNumber : $("#pageNumber").val()
		},
		success : function(data) {
			if (data == 1) {
				$('#loading-modal').modal();
				setTimeout("insertTimer();", 3000);
			} else {
				alert("失败！");
			}
		}
	})
}
function delData() {
	$.ajax({
		type : "post",
		url : contextPath + "/spiderRecruit/deleteAllData.do",
		success : function(data) {
			if (data == 1) {
				$('#alert-modal').modal("toggle");
				searchTable1();
				searchTable2();
			}
		}
	})
}
var insertTimer = function() {
	$('#loading-modal').modal("close");
	$('#alert-modal').modal("toggle");
	searchTable1();
	searchTable2();
}
function readCountFile() {
	var f = fso.createtextfile('E:\\ThreadCount.txt', 1, false);
	while (!f.AtEndOfStream) {
		var data = f.Readline();
		$("#countData").innerHTML(data);
	}
	f.close();
}
function searchTable1() {
	$("#tblResult1").bootstrapTable('destroy');
	$("#tblResult1").bootstrapTable({
		url : contextPath + '/spiderRecruit/getAllRecruit.do',
		method : 'post',
		toolbar : '#toolbar1',
		striped : true, // 是否显示行间隔色
		cache : false, // 是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性
		pagination : true, // 开启分页
		sortable : false,// 是否启用排序
		sortOrder : "asc",// 排序方式
		iconsPrefix : 'glyphicon',// 定义字体库
//		clickToSelect : true,// 设置true 将在点击行时，自动选择rediobox 和 checkbox
//		singleSelect : true,// 设置True 将禁止多选
//		checkboxHeader : false,// 设置false 将在列头隐藏check-all checkbox .
		search : true,// 是否启用搜索框
		searchOnEnterKey : true,// 设置为 true时，按回车触发搜索方法，否则自动触发搜索方法
		trimOnSearch : true,// 设置为 true 将允许空字符搜索
		showColumns : true,// 是否显示 内容列下拉框
		showRefresh : true,// 是否显示 刷新按钮
		showToggle : true, // 是否显示 切换试图（table/card）按钮
		uniqueId : "xuhao", // 每一行的唯一标识，一般为主键列
		queryParams : function(params) {
			return {
				urlid : '1'
			}
		},
		contentType : "application/x-www-form-urlencoded; charset=UTF-8",
		pageNumber : 1,// 默认加载页
		pageSize : 6,// 每页数据
		pageList : [ 3, 6, 9 ],// 可选的每页数据
	// 是否启用点击选中行

	});
}
function searchTable2() {
	$("#tblResult2").bootstrapTable('destroy');
	$("#tblResult2").bootstrapTable({
		url : contextPath + '/spiderRecruit/getAllRecruit2.do',
		method : 'post',
		toolbar : '#toolbar2',
		striped : true, // 是否显示行间隔色
		cache : false, // 是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性
		pagination : true, // 开启分页
		sortable : false,// 是否启用排序
		sortOrder : "asc",// 排序方式
		iconsPrefix : 'glyphicon',// 定义字体库
//		clickToSelect : true,// 设置true 将在点击行时，自动选择rediobox 和 checkbox
//		singleSelect : true,// 设置True 将禁止多选
//		checkboxHeader : false,// 设置false 将在列头隐藏check-all checkbox .
		search : true,// 是否启用搜索框
		searchOnEnterKey : true,// 设置为 true时，按回车触发搜索方法，否则自动触发搜索方法
		trimOnSearch : true,// 设置为 true 将允许空字符搜索
		showColumns : true,// 是否显示 内容列下拉框
		showRefresh : true,// 是否显示 刷新按钮
		showToggle : true, // 是否显示 切换试图（table/card）按钮
		uniqueId : "xuhao", // 每一行的唯一标识，一般为主键列
		queryParams : function(params) {
			return {
				urlid : '2'
			}
		},
		contentType : "application/x-www-form-urlencoded; charset=UTF-8",
		pageNumber : 1,// 默认加载页
		pageSize : 6,// 每页数据
		pageList : [ 3, 6, 9 ],// 可选的每页数据
	});
}

var xuhao = function(value, row, index) {
	return index + 1;
}

var xiangqing = function(value, row, index) {
	return "<div class='visible-md visible-lg hidden-sm hidden-xs action-buttons'>"
			+ "<button class='btn btn-xs btn-info' onclick='openDetailModal(\""
			+ index + "\");'>详细信息</button></div>";
}

function openDetailModal(index) {
	var row = $('#tblResult1').bootstrapTable('getData')[index];// 返回选中行所有数据
	$("#editModalHead").text("详细信息");
	$("#editModalBody").text("");
	var experience;
	if (row.recruitOtherInfo.experience == null) {
		experience = '无要求';
	} else {
		experience = row.recruitOtherInfo.experience;
	}
	var header = "<div class='am-input-group am-g' style='margin-bottom:10px;'><lable class='am-u-sm-4' style='text-align:right;font-weight:bold;'>";
	var companynatureHtml = header
			+ "公司性质：</lable><input type='text' id='editPosition' class='am-u-sm-6 am-u-end' value='"
			+ row.recruitOtherInfo.companynature
			+ "' readonly='readonly' disabled='disabled'></div>";
	var companyscaleHtml = header
			+ "公司规模：</lable><input type='text' id='editWorkplace' class='am-u-sm-6 am-u-end' value='"
			+ row.recruitOtherInfo.companyscale
			+ "'  readonly='readonly' disabled='disabled'></div>";
	var experienceHtml = header
			+ "经验要求：</lable><input type='text' id='editSalary' class='am-u-sm-6 am-u-end' value='"
			+ experience + "'  readonly='readonly' disabled='disabled'></div>";
	var educationHtml = header
			+ "学历要求：</lable><input type='text' id='editSalary' class='am-u-sm-6 am-u-end' value='"
			+ row.recruitOtherInfo.education
			+ "'  readonly='readonly' disabled='disabled'></div>";
	var jobdescriptionHtml = "<div class='am-form-group am-g'><label class='am-u-sm-4' style='text-align:right;font-weight:bold;'>工作描述：</label><textarea class='am-u-sm-6 am-u-end' style='height:150px;' readonly='readonly' disabled='disabled'>"
			+ row.recruitOtherInfo.jobdescription + "</textarea></div>";
	$("#editModalBody").append(companynatureHtml);
	$("#editModalBody").append(companyscaleHtml);
	$("#editModalBody").append(experienceHtml);
	$("#editModalBody").append(educationHtml);
	$("#editModalBody").append(jobdescriptionHtml);
	$("#biaoZhi").text("");
	$("#biaoZhi").text("确定");
	$("#biaoZhi").attr("onclick", "");
	$("#data-edit-modal").modal("toggle");
}