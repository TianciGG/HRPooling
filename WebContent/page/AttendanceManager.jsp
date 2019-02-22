<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>考勤管理</title>

<link rel="stylesheet" href="../css/amazeui.min.css" />
<link rel="stylesheet" href="../css/amazeui.datatables.min.css" />
<link rel="stylesheet" href="../css/app.css">


<link rel="stylesheet" href="../bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="../bootstrap/bootstrap-table/bootstrap-table.css" />
<link rel="stylesheet" href="../bootstrap/css/sweetalert.css" />
<link rel="stylesheet"
	href="../bootstrap/css/bootstrap-datetimepicker.min.css" />
<script src="../js/jquery-2.2.3.min.js"></script>
<script src="../bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="../bootstrap/bootstrap-table/bootstrap-table.js"></script>
<script
	src="../bootstrap/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>
<script type="text/javascript" src="../bootstrap/js/sweetalert.min.js"></script>
<!--外联js表-->
<script type="text/javascript" src="../js/AttendanceManager.js"></script>
<script type="text/javascript"
	src="../bootstrap/js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
<script type="text/javascript"
	src="../bootstrap/js/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>
</head>
<body>
	<div class="panel panel-default">
		<div class="panel-heading">考勤管理</div>
		<div class="panel-body">
			<!--搜索区域  -->
			<div>
				<form class="form-inline">
					<div class="form-group">
						<label for="sempId">姓名</label> <input type="text"
							class="form-control" id="sempId" placeholder="姓名">
					</div>
					<div class="form-group">
						<label for="sattdate">日期</label> <input type="date"
							class="form-control" id="sattdate" placeholder="日期">
					</div>
					<div class="form-group">
						<label for="sislate">迟到</label> <select class="form-control">
							<option>是</option>
							<option>否</option>
						</select>
					</div>
					<div class="form-group">
						<label for="sistardy">早退</label> <select class="form-control">
							<option>是</option>
							<option>否</option>
						</select>
					</div>
					<div class="form-group">
						<label for="sisleave">请假</label> <select class="form-control">
							<option>是</option>
							<option>否</option>
						</select>
					</div>

					<button type="submit" class="btn btn-info" id="btnSearch">搜索</button>
				</form>
			</div>
			<table id="tbAttendance">

			</table>
			<div class="btn-toolbar" role="toolbar" id="toolbar">
				<div class="btn-group">
					<button class="btn btn-default" type="button" id="btnAdd">
						<span class="glyphicon glyphicon-plus"></span> 添加
					</button>
					<button class="btn btn-default" type="button" id="btnEdit">
						<span class="glyphicon glyphicon-pencil"></span> 修改
					</button>
					<button class="btn btn-default" type="button" id="btnRemove">
						<span class="glyphicon glyphicon-trash"></span> 删除
					</button>
				</div>
			</div>
		</div>

		<!-- 添加模态框 -->
		<div class="modal fade" id="addModal" tabindex="-1" role="dialog"
			aria-labelledby="exampleModalLabel">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h4 class="modal-title" id="save">
							<strong>添加考勤表</strong>
						</h4>
					</div>
					<div class="modal-body">
						<form class="form-horizontal" method="post">
							<div class="form-group">
								<label for="empid" class="col-sm-3 control-label">员工ID：</label>
								<div class="col-sm-8">
									<input type="text" class="form-control" id="empid" name="empid">
								</div>
							</div>

							<!-- 								<div class="form-group"> -->
							<!-- 									<label for="attdate" class="col-sm-3 control-label">出勤日期：</label> -->
							<!-- 									<div class="col-sm-8"> -->
							<!-- 										<input type="date" class="form-control" id="attdate" name="attdate"> -->
							<!-- 									</div> -->
							<!-- 								</div> -->

							<!-- 								<div class="form-group"> -->
							<!-- 									<label for="attendaceTime" class="col-sm-3 control-label">上班时间：</label> -->
							<!-- 									<div class="col-sm-8"> -->
							<!-- 										<input type="datetime-local" class="form-control" id="attendaceTime" name="attendaceTime"> -->
							<!-- 									</div> -->
							<!-- 								</div> -->

							<!-- 								<div class="form-group"> -->
							<!-- 									<label for="closeingTime" class="col-sm-3 control-label">下班时间：</label> -->
							<!-- 									<div class="col-sm-8"> -->
							<!-- 										<input type="datetime" class="form-control" id="closeingTime" name="closeingTime"> -->
							<!-- 									</div> -->
							<!-- 								</div> -->


							<!-- 								<div class="form-group"> -->
							<!-- 										<label for="attdate" class="col-sm-3 control-label">出勤日期：</label> -->
							<!-- 										<div class="input-group date form_date col-sm-8 control-label" -->
							<!-- 											data-date="" data-date-format="yyyy-mm-dd" -->
							<!-- 											data-link-field="dtp_input2" data-link-format="yyyy-mm-dd"> -->

							<!-- 											<input type="text" class="form-control date" id="attdate" name="attdate" -->
							<!-- 												readonly> -->
							<!-- 											<span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span> -->
							<!-- 											<span class="input-group-addon"><span -->
							<!-- 												class="glyphicon glyphicon-calendar"></span></span> -->

							<!-- 										</div> -->

							<!-- 									</div> -->


							<!-- 									<div class="form-group"> -->
							<!-- 										<label for="attendaceTime" class="col-sm-3 control-label">上班时间：</label> -->
							<!-- 										<div class="input-group date form_date col-sm-8 control-label" -->
							<!-- 											data-date="" data-date-format="yyyy-mm-dd" -->
							<!-- 											data-link-field="dtp_input2" data-link-format="yyyy-mm-dd"> -->

							<!-- 											<input type="text" class="form-control date" id="attendaceTime" name="attendaceTime" -->
							<!-- 												readonly> -->
							<!-- 											<span class="input-group-addon"><span -->
							<!-- 												class="glyphicon glyphicon-calendar"></span></span> -->

							<!-- 										</div> -->

							<!-- 									</div> -->



							<!-- 									<div class="form-group"> -->
							<!-- 										<label for="attendaceTime" class="col-sm-3 control-label">上班时间：</label> -->
							<!-- 										<div class="col-sm-8"> -->
							<!-- 											<input type="datetime" class="form-control" id="attendaceTime" name="attendaceTime"> -->
							<!-- 										</div> -->
							<!-- 									</div> -->


							<!-- 								<div class="form-group"> -->
							<!-- 									<label for="islate" class="col-sm-3 control-label">是否迟到：</label> -->
							<!-- 									<div class="col-sm-8"> -->
							<!-- 										<input type="text" class="form-control" id="islate" name="islate"> -->
							<!-- 									</div> -->
							<!-- 								</div> -->
							<!-- 									<div class="form-group"> -->
							<!-- 									<label for="istardy" class="col-sm-3 control-label">是否早退：</label> -->
							<!-- 									<div class="col-sm-8"> -->
							<!-- 										<input type="text" class="form-control" id="istardy" name="istardy"> -->
							<!-- 									</div> -->
							<!-- 								</div> -->
							<!-- 									<div class="form-group"> -->
							<!-- 									<label for="isleave" class="col-sm-3 control-label">是否请假：</label> -->
							<!-- 									<div class="col-sm-8"> -->
							<!-- 										<input type="text" class="form-control" id="isleave" name="isleave"> -->
							<!-- 									</div> -->
							<!-- 								</div> -->
						</form>
					</div>

					<div class="modal-footer">
						<button type="button" class="btn btn-primary" data-dismiss="modal"
							id="btnSubmit">确定</button>
						<button type="button" class="btn btn-primary" data-dismiss="modal"
							aria-label="Close">关闭</button>
					</div>
				</div>
			</div>
		</div>

		<!-- 修改模态框 -->
		<div class="modal fade" id="upModal" tabindex="-1" role="dialog"
			aria-labelledby="exampleModalLabel">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h4 class="modal-title" id="edit">
							<strong>修改考勤表</strong>
						</h4>
					</div>
					<div class="modal-body">
						<form class="form-horizontal" method="post">
							<input type="hidden" id="attendaceId" name="attendaceId">
							<div class="form-group">
								<label for="upempid" class="col-sm-3 control-label">员工ID：</label>
								<div class="col-sm-8">
									<input type="text" class="form-control" id="upempid"
										name="upempid">
								</div>
							</div>
							<div class="form-group">
								<label for="attdate" class="col-sm-3 control-label">出勤日期：</label>
								<div class="input-group date form_date col-sm-8 control-label"
									data-date="" data-date-format="yyyy-mm-dd"
									data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">

									<input type="text" class="form-control date" id="attdate"
										name="attdate" readonly>
									<!-- <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span> -->
									<span class="input-group-addon"><span
										class="glyphicon glyphicon-calendar"></span></span>

								</div>

							</div>
							<div class="form-group">
								<label for="attendaceTime" class="col-sm-3 control-label">上班时间：</label>
								<div class="input-group date form_date col-sm-8 control-label"
									data-date="" data-date-format="yyyy-mm-dd"
									data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">

									<input type="text" class="form-control date" id="attendaceTime"
										name="attendaceTime" readonly> <span
										class="input-group-addon"><span
										class="glyphicon glyphicon-calendar"></span></span>

								</div>

							</div>
							<div class="form-group">
								<label for="upcloseingTime" class="col-sm-3 control-label">下班时间：</label>
								<div class="col-sm-8">
									<input type="datetime" class="form-control" id="upcloseingTime"
										name="upcloseingTime">
								</div>
							</div>
							<div class="form-group">
								<label for="upislate" class="col-sm-3 control-label">是否迟到：</label>
								<div class="col-sm-8">
									<input type="text" class="form-control" id="upislate"
										name="upislate">
								</div>
							</div>
							<div class="form-group">
								<label for="upistardy" class="col-sm-3 control-label">是否早退：</label>
								<div class="col-sm-8">
									<input type="text" class="form-control" id="upistardy"
										name="upistardy">
								</div>
							</div>
							<div class="form-group">
								<label for="upisleave" class="col-sm-3 control-label">是否请假：</label>
								<div class="col-sm-8">
									<input type="text" class="form-control" id="upisleave"
										name="upisleave">
								</div>
							</div>
						</form>
					</div>

					<div class="modal-footer">
						<button type="button" class="btn btn-primary" data-dismiss="modal"
							id="btnSure">确定</button>
						<button type="button" class="btn btn-primary" data-dismiss="modal"
							aria-label="Close">关闭</button>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
<!--  <script type="text/javascript">
		$('.form_date').datetimepicker({
			language : 'zh-CN',
			weekStart : 1,
			todayBtn : 1,
			autoclose : 1,
			todayHighlight : 1,
			startView : 2,
			minView : 2,
			forceParse : 0
		});
	</script>
	-->
	
		<script src="../js/amazeui.min.js"></script>
	<script src="../js/amazeui.datatables.min.js"></script>
	<script src="../js/dataTables.responsive.min.js"></script>
	<script src="../js/app.js"></script>
</html>
