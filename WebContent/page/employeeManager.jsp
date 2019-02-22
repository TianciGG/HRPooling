<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	    <link rel="stylesheet" href="../bootstrap/css/bootstrap.min.css">
		<link rel="stylesheet" href="../bootstrap/bootstrap-table/bootstrap-table.css" />
		<script src="../js/jquery-2.2.3.min.js"></script>
		<script src="../bootstrap/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="../bootstrap/bootstrap-table/bootstrap-table.js"></script>
		<script src="../bootstrap/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>
		<script type="text/javascript" src="../js/employeeManager.js"></script>

		<title>员工档案管理</title>

</head>
<body>

<table id="tbEmployeeList" >

</table>


	<div class="btn-toolbar" role="toolbar" id="toolbar">
			<div class="btn-group">
				<button id="btnAdd" type="button" class="btn btn-default" >添加</button>
				<button id="btnEdit" type="button" class="btn btn-default" >修改</button>
				<button type="button" class="btn btn-default" >删除</button>
			</div>
		</div>

<div id="frmEmployee"  class="modal fade"  tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
<form action="/HRPooling/employee/add.do"  method="post">

 员工编号：<input type="text"  name="empno"   id="txtEmpNO"/>
员工姓名：<input type="text"  name="empname"  id=“txtEmpName”/>

<input type="submit"  value="提交"/>
<button type="button" class="btn btn-primary" id="btnSaveDept"> ajax提交</button>

</form>
</div>




</body>
</html>