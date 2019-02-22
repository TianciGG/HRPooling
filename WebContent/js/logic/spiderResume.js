$(function() {
	$('#myTab a:first').tab("show");// 初始化显示哪个tab
	searchTable1();
	$("#btnSetSpider1").click(function() {
		$("#urlName").val("金湖人才网");
		$('#prompt-modal').modal("toggle");
	});
	$("#btnSetSpider2").click(function() {
		$("#urlName").val("天津赶集网");
		$('#prompt-modal').modal("toggle");
	});
	$("#btnCleanSpider1").click(function() {
		$('#confirm-modal').modal("toggle");
	});
	$("#btnCleanSpider2").click(function() {
		$('#confirm-modal').modal("toggle");
	});
	$("#GanJi").click(function(){
		searchTable2();
	});
	$("#btn_add1").on("click",dataAddModalShow1);
	$("#btn_edit1").on("click",dataEditModalShow1);
	$("#btn_add2").on("click",dataAddModalShow2);
	$("#btn_edit2").on("click",dataEditModalShow2);
	$("#btn_delete1").on("click",dataDelModalShow1);
	$("#btn_delete2").on("click",dataDelModalShow2);
	
	$("#spiderSubmit").on("click",insertSpiderPage);
	
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
	var nameHtml = header
			+ "姓名：</lable><input type='text' id='addName' class='am-u-sm-6 am-u-end'></div>";
	var sexHtml = header
			+ "性别：</lable><div class='am-u-sm-6 am-u-end' style='text-align:left;'><input name='addSex' type='radio' value='男' style='margin-left:-10px;' checked/>男"
			+ "<input name='addSex' type='radio' value='女'  style='margin-left:10px;'/>女</div></div>";
	var ageHtml = header
			+ "年龄：</lable><input type='text' id='addAge' class='am-u-sm-6 am-u-end' ></div>";
	var eduHtml = header
			+ "教育：</lable><input type='text' id='addEdu' class='am-u-sm-6 am-u-end'></div>";
	var natureHtml = header
			+ "工作性质：</lable><input type='text' id='addNature' class='am-u-sm-6 am-u-end'></div>";
	var moneyHtml = header
			+ "期望工资：</lable><input type='text' id='addMoney' class='am-u-sm-6 am-u-end'></div>";
	var willjobHtml = header
			+ "意愿工作：</lable><input type='text' id='addWilljob' class='am-u-sm-6 am-u-end'></div>";
	var dateHtml = header
			+ "发布时间：</lable><input type='date' id='addDate' class='am-u-sm-6 am-u-end'></div>";
	$("#editModalBody").append(nameHtml);
	$("#editModalBody").append(sexHtml);
	$("#editModalBody").append(ageHtml);
	$("#editModalBody").append(eduHtml);
	$("#editModalBody").append(natureHtml);
	$("#editModalBody").append(moneyHtml);
	$("#editModalBody").append(willjobHtml);
	$("#editModalBody").append(dateHtml);
	$("#biaoZhi").text("");
	$("#biaoZhi").text("添加");
	$("#biaoZhi").attr("onclick", "insertByData1()");
	$("#data-edit-modal").modal("toggle");
}
function insertByData1() {
	$.ajax({
		type : "post",
		url : contextPath + "/spiderResume/insertData.do",
		data : {
			name : $("#addName").val().trim(),
			sex : $("input[name='addSex']:checked").val(),
			age : $("#addAge").val().trim(),
			edu : $("#addEdu").val().trim(),
			nature : $("#addNature").val().trim(),
			money : $("#addMoney").val().trim(),
			willjob : $("#addWilljob").val().trim(),
			date : $("#addDate").val(),
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
function dataAddModalShow2() {
	$("#editModalHead").text("添加数据");
	$("#editModalBody").text("");
	var header = "<div class='am-input-group am-g' style='margin-bottom:10px;'><lable class='am-u-sm-4' style='text-align:right;font-weight:bold;'>";
	var nameHtml = header
			+ "姓名：</lable><input type='text' id='addName' class='am-u-sm-6 am-u-end'></div>";
	var sexHtml = header
			+ "性别：</lable><div class='am-u-sm-6 am-u-end' style='text-align:left;'><input name='addSex' type='radio' value='男' style='margin-left:-10px;' checked/>男"
			+ "<input name='addSex' type='radio' value='女' />女</div></div>";
	var ageHtml = header
			+ "年龄：</lable><input type='text' id='addAge' class='am-u-sm-6 am-u-end' ></div>";
	var areaHtml = header
			+ "地区：</lable><input type='text' id='addArea' class='am-u-sm-6 am-u-end'></div>";
	var eduHtml = header
			+ "教育：</lable><input type='text' id='addEdu' class='am-u-sm-6 am-u-end'></div>";
	var experienceHtml = header
			+ "工作经验：</lable><input type='text' id='addExperience' class='am-u-sm-6 am-u-end'></div>";
	var moneyHtml = header
			+ "期望工资：</lable><input type='text' id='addMoney' class='am-u-sm-6 am-u-end'></div>";
	var dateHtml = header
			+ "发布时间：</lable><input type='date' id='addDate' class='am-u-sm-6 am-u-end'></div>";
	$("#editModalBody").append(nameHtml);
	$("#editModalBody").append(sexHtml);
	$("#editModalBody").append(ageHtml);
	$("#editModalBody").append(areaHtml);
	$("#editModalBody").append(eduHtml);
	$("#editModalBody").append(experienceHtml);
	$("#editModalBody").append(moneyHtml);
	$("#editModalBody").append(dateHtml);
	$("#biaoZhi").text("");
	$("#biaoZhi").text("添加");
	$("#biaoZhi").attr("onclick", "insertByData2()");
	$("#data-edit-modal").modal("toggle");
}
function insertByData2() {
	$.ajax({
		type : "post",
		url : contextPath + "/spiderResume/insertData.do",
		data : {
			name : $("#addName").val().trim(),
			sex : $("input[name='addSex']:checked").val(),
			age : $("#addAge").val().trim(),
			area : $("#addArea").val().trim(),
			edu : $("#addEdu").val().trim(),
			experience : $("#addExperience").val().trim(),
			money : $("#addMoney").val().trim(),
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
function dataEditModalShow1(){
	var index = $('#tblResult1').find('tr.success').data('index');// 获取选中的行脚标
	var row = $('#tblResult1').bootstrapTable('getData')[index];// 返回选中行所有数据
	$("#editDataId").val(row.id);
	$("#editModalHead").text("编辑数据");
	$("#editModalBody").text("");
	var header = "<div class='am-input-group am-g' style='margin-bottom:10px;'><lable class='am-u-sm-4' style='text-align:right;font-weight:bold;'>";
	var natureHtml = header
	+ "工作性质：</lable><input type='text' id='editNature' class='am-u-sm-6 am-u-end' value='"+ row.nature + "'></div>";
	var moneyHtml = header
	+ "期望工资：</lable><input type='text' id='editMoney' class='am-u-sm-6 am-u-end' value='"+ row.money + "'></div>";
	var willjobHtml = header
	+ "意愿工作：</lable><input type='text' id='editWilljob' class='am-u-sm-6 am-u-end' value='"+ row.willjob + "'></div>";
	$("#editModalBody").append(natureHtml);
	$("#editModalBody").append(moneyHtml);
	$("#editModalBody").append(willjobHtml);
	$("#biaoZhi").text("");
	$("#biaoZhi").text("修改");
	$("#biaoZhi").attr("onclick", "updateByData1()");
	$("#data-edit-modal").modal("toggle");
}
function updateByData1() {
	$.ajax({
		type : "post",
		url : contextPath + "/spiderResume/updateById1.do",
		data : {
			id : $("#editDataId").val(),
			nature : $("#editNature").val(),
			money : $("#editMoney").val(),
			willjob : $("#editWilljob").val()
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
function dataEditModalShow2(){
	var index = $('#tblResult2').find('tr.success').data('index');// 获取选中的行脚标
	var row = $('#tblResult2').bootstrapTable('getData')[index];// 返回选中行所有数据
	$("#editDataId").val(row.id);
	$("#editModalHead").text("编辑数据");
	$("#editModalBody").text("");
	var header = "<div class='am-input-group am-g' style='margin-bottom:10px;'><lable class='am-u-sm-4' style='text-align:right;font-weight:bold;'>";
	var areaHtml = header
	+ "地区：</lable><input type='text' id='editArea' class='am-u-sm-6 am-u-end' value='"+ row.area + "'></div>";
	var experienceHtml = header
	+ "工作经验：</lable><input type='text' id='editExperience' class='am-u-sm-6 am-u-end' value='"+ row.experience + "'></div>";
	var moneyHtml = header
	+ "期望工资：</lable><input type='text' id='editMoney' class='am-u-sm-6 am-u-end' value='"+ row.money + "'></div>";
	$("#editModalBody").append(areaHtml);
	$("#editModalBody").append(experienceHtml);
	$("#editModalBody").append(moneyHtml);
	$("#biaoZhi").text("");
	$("#biaoZhi").text("修改");
	$("#biaoZhi").attr("onclick", "updateByData2()");
	$("#data-edit-modal").modal("toggle");
}
function updateByData2() {
	$.ajax({
		type : "post",
		url : contextPath + "/spiderResume/updateById2.do",
		data : {
			id : $("#editDataId").val(),
			area : $("#editArea").val(),
			experience : $("#editExperience").val(),
			money : $("#editMoney").val()
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
	$('#dataIndex').val(row.id);
	$('#data-delete-modal').modal("toggle");
}
function dataDelModalShow2() {
	var index = $('#tblResult2').find('tr.success').data('index');// 获取选中的行脚标
	var row = $('#tblResult2').bootstrapTable('getData')[index];// 返回选中行所有数据
	$('#dataIndex').val(row.id);
	$('#data-delete-modal').modal("toggle");
}
function delById() {
	$.ajax({
		type : "post",
		url : contextPath + "/spiderResume/deleteById.do",
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
function insertSpiderPage(){
	$.ajax({
		type:"post",
		url:contextPath+"/spiderResume/insertBySpiderPage.do",
		data:{urlName:$("#urlName").val(),pageNumber:$("#pageNumber").val()},
		success:function(data){
			if(data==1){
				$('#loading-modal').modal();
				setTimeout("insertTimer();",3500);
			}else{
				alert("失败");
			}
		}
	})
}
function delData() {
	$.ajax({
		type : "post",
		url : contextPath + "/spiderResume/deleteAllData.do",
		success : function(data) {
			if (data == 1) {
				$('#alert-modal').modal("toggle");
				searchTable1();
				searchTable2();
			}
		}
	})
}
var insertTimer=function(){
	$('#loading-modal').modal("close");
	$('#alert-modal').modal("toggle");
	searchTable1();
	searchTable2();
}
function readCountFile(){
	var f=fso.createtextfile('E:\\ThreadCount.txt',1,false);
	while (!f.AtEndOfStream) 
	{ 
	  var data=f.Readline(); 
	  $("#countData").innerHTML(data);
	} 
	f.close();
}


function searchTable1() {
	$("#tblResult1").bootstrapTable('destroy');
	$("#tblResult1").bootstrapTable({
		url : contextPath + '/spiderResume/getAllResume.do',
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
		url : contextPath + '/spiderResume/getAllResume.do',
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

