<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>index</title>
<meta name="description" content="这是一个 index 页面">
<meta name="keywords" content="index">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="stylesheet" href="../bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="../bootstrap/bootstrap-table/bootstrap-table.css" />
<link rel="stylesheet" href="../css/recruitManager.css" />
<link rel="stylesheet"
	href="../bootstrap/css/bootstrap-datetimepicker.min.css" />
<link rel="icon" type="image/png" href="../i/favicon.png">
<link rel="apple-touch-icon-precomposed"
	href="../images/app-icon72x72@2x.png">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<script src="../js/echarts.min.js"></script>
<link rel="stylesheet" href="../css/amazeui.min.css" />
<link rel="stylesheet" href="../css/amazeui.datatables.min.css" />
<link rel="stylesheet" href="../css/app.css">
<script src="../js/jquery.min.js" type="text/javascript"></script>
<script src="../js/jquery-2.2.3.min.js"></script>
<script src="../bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="../bootstrap/bootstrap-table/bootstrap-table.js"></script>
<script
	src="../bootstrap/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>
<script type="text/javascript" src="../js/extraMessage.js"></script>
<script type="text/javascript"
	src="../bootstrap/js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
<script type="text/javascript"
	src="../bootstrap/js/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>
</head>

<body data-type="widgets">
	<script src="../js/theme.js"></script>
	<div class="am-g tpl-g">
		<!-- 头部 -->
		<header>
			<!-- logo -->
			<div class="am-fl tpl-header-logo">
				<a href="javascript:void(0);"><img src="../images/iss-logo.png"
					alt=""></a> <span><strong>软通动力人力HRPooling平台</strong></span>

			</div>
			<!-- 右侧内容 -->
			<div class="tpl-header-fluid">
				<!-- 侧边切换 -->
				<div class="am-fl tpl-header-switch-button am-icon-list">
					<span> </span>
				</div>
				<!-- 搜索 -->
				<div class="am-fl tpl-header-search">
					<form class="tpl-header-search-form" action="javascript:;">
						<button class="tpl-header-search-btn am-icon-search"></button>
						<input class="tpl-header-search-box" type="text"
							placeholder="搜索内容...">
					</form>
				</div>
				<!-- 其它功能-->
				<div class="am-fr tpl-header-navbar">
					<ul>
						<!-- 欢迎语 -->
						<li class="am-text-sm tpl-header-navbar-welcome"><a
							href="javascript:;">欢迎你, <span>小白</span>
						</a></li>

						<!-- 新邮件 -->
						<li class="am-dropdown tpl-dropdown" data-am-dropdown><a
							href="javascript:;"
							class="am-dropdown-toggle tpl-dropdown-toggle"
							data-am-dropdown-toggle> <i class="am-icon-envelope"></i> <span
								class="am-badge am-badge-success am-round item-feed-badge">4</span>
						</a> <!-- 弹出列表 -->
							<ul class="am-dropdown-content tpl-dropdown-content">
								<li class="tpl-dropdown-menu-messages"><a
									href="javascript:;"
									class="tpl-dropdown-menu-messages-item am-cf">
										<div class="menu-messages-ico">
											<img src="../images/user06.png" alt="">
										</div>
										<div class="menu-messages-time">3小时前</div>
										<div class="menu-messages-content">
											<div class="menu-messages-content-title">
												<i class="am-icon-circle-o am-text-success"></i> <span>夕风色</span>
											</div>
											<div class="am-text-truncate">Amaze UI 的诞生，依托于 GitHub
												及其他技术社区上一些优秀的资源；Amaze UI 的成长，则离不开用户的支持。</div>
											<div class="menu-messages-content-time">2016-09-21 下午
												16:40</div>
										</div>
								</a></li>

								<li class="tpl-dropdown-menu-messages"><a
									href="javascript:;"
									class="tpl-dropdown-menu-messages-item am-cf">
										<div class="menu-messages-ico">
											<img src="../images/user03.png" alt="">
										</div>
										<div class="menu-messages-time">5天前</div>
										<div class="menu-messages-content">
											<div class="menu-messages-content-title">
												<i class="am-icon-circle-o am-text-warning"></i> <span>禁言小张</span>
											</div>
											<div class="am-text-truncate">为了能最准确的传达所描述的问题，
												建议你在反馈时附上演示，方便我们理解。</div>
											<div class="menu-messages-content-time">2016-09-16 上午
												09:23</div>
										</div>
								</a></li>
								<li class="tpl-dropdown-menu-messages"><a
									href="javascript:;"
									class="tpl-dropdown-menu-messages-item am-cf"> <i
										class="am-icon-circle-o"></i> 进入列表…
								</a></li>
							</ul></li>

						<!-- 新提示 -->
						<li class="am-dropdown" data-am-dropdown><a
							href="javascript:;" class="am-dropdown-toggle"
							data-am-dropdown-toggle> <i class="am-icon-bell"></i> <span
								class="am-badge am-badge-warning am-round item-feed-badge">5</span>
						</a> <!-- 弹出列表 -->
							<ul class="am-dropdown-content tpl-dropdown-content">
								<li class="tpl-dropdown-menu-notifications"><a
									href="javascript:;"
									class="tpl-dropdown-menu-notifications-item am-cf">
										<div class="tpl-dropdown-menu-notifications-title">
											<i class="am-icon-line-chart"></i> <span> 有6笔新的销售订单</span>
										</div>
										<div class="tpl-dropdown-menu-notifications-time">12分钟前
										</div>
								</a></li>
								<li class="tpl-dropdown-menu-notifications"><a
									href="javascript:;"
									class="tpl-dropdown-menu-notifications-item am-cf">
										<div class="tpl-dropdown-menu-notifications-title">
											<i class="am-icon-star"></i> <span> 有3个来自人事部的消息</span>
										</div>
										<div class="tpl-dropdown-menu-notifications-time">30分钟前
										</div>
								</a></li>
								<li class="tpl-dropdown-menu-notifications"><a
									href="javascript:;"
									class="tpl-dropdown-menu-notifications-item am-cf">
										<div class="tpl-dropdown-menu-notifications-title">
											<i class="am-icon-folder-o"></i> <span> 上午开会记录存档</span>
										</div>
										<div class="tpl-dropdown-menu-notifications-time">1天前</div>
								</a></li>


								<li class="tpl-dropdown-menu-notifications"><a
									href="javascript:;"
									class="tpl-dropdown-menu-notifications-item am-cf"> <i
										class="am-icon-bell"></i> 进入列表…
								</a></li>
							</ul></li>

						<!-- 退出 -->
						<li class="am-text-sm"><a href="javascript:;"> <span
								class="am-icon-sign-out"></span> 退出
						</a></li>
					</ul>
				</div>
			</div>

		</header>

		<!-- 侧边导航栏 -->
		<div class="left-sidebar">
			<!-- 用户信息 -->
			<div class="tpl-sidebar-user-panel">
				<div class="tpl-user-panel-slide-toggleable">
					<div class="tpl-user-panel-profile-picture">
						<img src="../images/user04.png" alt="">
					</div>
					<span class="user-panel-logged-in-text"> <i
						class="am-icon-circle-o am-text-success tpl-user-panel-status-icon"></i>
						禁言小张
					</span> <a href="javascript:;" class="tpl-user-panel-action-link"> <span
						class="am-icon-pencil"></span> 账号设置
					</a>
				</div>
			</div>

			<!-- 菜单 -->
			<ul class="sidebar-nav">
				<li class="sidebar-nav-heading">module list<span
					class="sidebar-nav-heading-info"> 模块列表</span></li>
				<li class="sidebar-nav-link"><a href="index.jsp"
					class="active"> <i class="am-icon-home sidebar-nav-link-logo"></i>
						首页
				</a></li>

			

				<li class="sidebar-nav-link"><a href="javascript:;"
					class="sidebar-nav-sub-title active"> <i
						class="am-icon-wpforms sidebar-nav-link-logo"></i> 招聘管理 <span
						class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico sidebar-nav-sub-ico-rotate"></span>
				</a>
					<ul class="sidebar-nav sidebar-nav-sub" style="display: block;">
						<li class="sidebar-nav-link"><a href="recruitManager.jsp">
								<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
								基本信息管理
						</a></li>

						<li class="sidebar-nav-link"><a href="extraMessage.jsp"
							class="sub-active"> <span
								class="am-icon-angle-right sidebar-nav-link-logo"></span> 附加信息管理
						</a></li>
						<li class="sidebar-nav-link"><a
							href="../goToSpiderRecruitPage.do"> <span
								class="am-icon-angle-right sidebar-nav-link-logo"></span>
								招聘信息搜索引擎
						</a></li>
						<li class="sidebar-nav-link"><a
							href="../goToSpiderResumePage.do"> <span
								class="am-icon-angle-right sidebar-nav-link-logo"></span>
								简历信息搜索引擎
						</a></li>

					</ul></li>

				<!-- <li class="sidebar-nav-link"><a href="javascript:;"
					class="sidebar-nav-sub-title"> <i
						class="am-icon-calendar sidebar-nav-link-logo"></i> 人事档案管理 <span
						class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
				</a>
					<ul class="sidebar-nav sidebar-nav-sub">
						<li class="sidebar-nav-link"><a href="table-list.jsp"> <span
								class="am-icon-angle-right sidebar-nav-link-logo"></span> 数据字典
						</a></li>

						<li class="sidebar-nav-link"><a href="table-list-img.jsp">
								<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
								部门管理
						</a></li>

						<li class="sidebar-nav-link"><a href="table-list-img.jsp">
								<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
								职务管理
						</a></li>
					</ul></li> -->

				<li class="sidebar-nav-link"><a href="javascript:;"
					class="sidebar-nav-sub-title"> <i
						class="am-icon-bar-chart sidebar-nav-link-logo"></i> 薪资考勤管理 <span
						class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
				</a>
					<ul class="sidebar-nav sidebar-nav-sub">
						<li class="sidebar-nav-link"><a href="salaryManager.jsp"> <span
								class="am-icon-angle-right sidebar-nav-link-logo"></span> 基本薪酬管理
						</a></li>

						<li class="sidebar-nav-link"><a href="payrollManager.jsp">
								<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
								实发薪资管理
						</a></li>
					</ul></li>

				<li class="sidebar-nav-link"><a href="javascript:;"
				class="sidebar-nav-sub-title"> <i
					class="am-icon-clone sidebar-nav-link-logo"></i> 公告管理 <span
					class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
			</a>
				<ul class="sidebar-nav sidebar-nav-sub">
					<li class="sidebar-nav-link"><a href="NoticeType.jsp"> <span
								class="am-icon-angle-right sidebar-nav-link-logo"></span> 公告类型
						</a></li>

						<li class="sidebar-nav-link"><a href="Notice.jsp"> <span
								class="am-icon-angle-right sidebar-nav-link-logo"></span> 公告管理
						</a></li>
				</ul></li>
					
					
						<li class="sidebar-nav-link"><a href="javascript:;"
					class="sidebar-nav-sub-title"> <i
						class="am-icon-table sidebar-nav-link-logo"></i>系统管理 <span
						class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
				</a>
					<ul class="sidebar-nav sidebar-nav-sub">
						<li class="sidebar-nav-link"><a href="dicValue.jsp"> <span
								class="am-icon-angle-right sidebar-nav-link-logo"></span> 数据字典
						</a></li>
						<li class="sidebar-nav-link"><a href="dicTypeManager2.jsp">
								<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
								数据类型
						</a></li>
						<li class="sidebar-nav-link"><a href="deptManager.jsp">
								<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
								部门管理
						</a></li>
						<li class="sidebar-nav-link"><a href="dutyManager1.jsp">
								<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
								职务管理
						</a></li>
						<li class="sidebar-nav-link"><a href="UserManager.jsp">
								<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
								用户管理
						</a></li>
					</ul></li>

			</ul>

		</div>


		<!-- 内容区域 -->
		<div class="tpl-content-wrapper">
			<div class="row-content am-cf">
				<div class="panel-group" id="accordion">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" data-parent="#accordion"
									href="#collapseOne" style="text-decoration: none"> 教育培训 </a>
							</h4>
						</div>
						<div id="collapseOne" class="panel-collapse collapse in">
							<div class="panel-body">


								<table id="t_education">

								</table>
								<div class="btn-toolbar" role="toolbar" id="toolbar1">
									<div class="btn-group">
										<button class="btn btn-primary" type="button" id="btnAdd1">
											<span class="glyphicon glyphicon-plus"></span> 添加
										</button>
										<button class="btn btn-success" type="button" id="btnEdit1">
											<span class="glyphicon glyphicon-pencil"></span> 修改
										</button>
										<button class="btn btn-warning" type="button" id="btnRemove1">
											<span class="glyphicon glyphicon-trash"></span> 删除
										</button>
									</div>
									<div class="col-sm-3">
										<div class="input-group">
											<input type="text" class="form-control" id="schoolName"
												placeholder="Search for school..."> <span
												class="input-group-btn">
												<button class="btn btn-default" type="button"
													id="btnSearch1">搜索</button>
											</span>
										</div>
									</div>

								</div>

							</div>



						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" data-parent="#accordion"
									href="#collapseTwo" style="text-decoration: none"> 工作经验 </a>
							</h4>
						</div>
						<div id="collapseTwo" class="panel-collapse collapse">
							<div class="panel-body">

								<table id="t_workexperience">

								</table>
								<div class="btn-toolbar" role="toolbar" id="toolbar2">
									<div class="btn-group">
										<button class="am-btn am-btn-secondary js-modal-open" type="button" id="btnAdd2">
											<span class="glyphicon glyphicon-plus"></span> 添加
										</button>
										<button class="am-btn am-btn-success js-modal-open" type="button" id="btnEdit2">
											<span class="glyphicon glyphicon-pencil"></span> 修改
										</button>
										<button class="am-btn am-btn-warning js-modal-open" type="button" id="btnRemove2">
											<span class="glyphicon glyphicon-trash"></span> 删除
										</button>
									</div>
									<div class="col-sm-3">
										<div class="input-group">
											<input type="text" class="form-control" id="companyName"
												placeholder="Search for company..."> <span
												class="input-group-btn">
												<button class="btn btn-default" type="button"
													id="btnSearch2">搜索</button>
											</span>
										</div>
									</div>

								</div>

							</div>









						</div>
					</div>

				</div>


				<script type="text/javascript">
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

			</div>






		</div><!-- 内容区域结束 -->
		
					<!-- 教育培训模态框 -->
			<div class="am-modal am-modal-no-btn" id="myModal1" tabindex="-1">
				<div class="am-modal-dialog">
					<div class="am-modal-hd">
						<h4 class="modal-title" class="active">
							<strong>教育培训</strong>
						</h4>
						<a href="javascript: void(0)" class="am-close am-close-spin"
							data-am-modal-close>&times;</a>
					</div>
					<div class="am-modal-bd">
						<form class="form-horizontal" method="post">
							<!--隐藏  -->
							<input type="hidden" id="eduId" name="eduId">
							<div class="form-group">
								<label for="deptNO" class="col-sm-3 control-label">开始时间：</label>
								<div class="input-group date form_date col-sm-8 control-label"
									data-date="" data-date-format="yyyy-mm-dd"
									data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">
									<input type="date" class="form-control" id="startTime1">
									<!-- <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span> -->
									<span class="input-group-addon"><span
										class="glyphicon glyphicon-calendar"></span></span>
								</div>

							</div>



							<div class="form-group">
								<label for="deptName" class="col-sm-3 control-label">结束时间：</label>
								<div class="input-group date form_date col-sm-8 control-label"
									data-date="" data-date-format="yyyy-mm-dd"
									data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">
									<input type="date" class="form-control date" id="endTime1">
									<!-- <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span> -->
									<span class="input-group-addon"><span
										class="glyphicon glyphicon-calendar"></span></span>
								</div>

							</div>

							<div class="form-group">
								<label for="dpPhone" class="col-sm-3 control-label">就读学校：</label>
								<div class="col-sm-8">
									<input type="text" class="form-control" id="school"
										name="school">
								</div>
							</div>
							<div class="form-group">
								<label for="superId" class="col-sm-3 control-label">专业：</label>
								<div class="col-sm-8">
									<input type="text" class="form-control" id="major" name="major">

								</div>
							</div>


							<div class="form-group">
								<label for="superId" class="col-sm-3 control-label">学历：</label>
								<div class="col-sm-8">
									<!-- <input type="text" class="form-control" id="degreeId"
												name="degreeId"> -->
									<select id="degreeId" class="form-control" name="degreeId"></select>
								</div>
							</div>

						</form>
					</div>

					<div class="am-modal-actions-group">
						<button class="am-btn am-btn-secondary am-btn-block" data-am-modal-confirm
							style="width: 90px; float: left; margin-left: 150px; margin-right: 50px;"
							id="saveEdu">保存</button>
						<button class="am-btn am-btn-secondary am-btn-block" data-am-modal-confirm
							style="width: 90px; float: left; margin-left: 150px; margin-right: 50px;"
							id="editEdu">修改</button>
						<button class="am-btn am-btn-secondary am-btn-block"
					data-am-modal-close style="width: 90px;">关闭</button>
					</div>
				</div>
			</div>

			<div class="am-modal am-modal-no-btn" id="myModal2" tabindex="-1">
				<div class="am-modal-dialog">
					<div class="am-modal-hd">
						<h4 class="modal-title" class="active">
							<strong>工作经验</strong>
						</h4>
						<a href="javascript: void(0)" class="am-close am-close-spin"
							data-am-modal-close>&times;</a>
					</div>
					<div class="am-modal-bd">
						<form class="form-horizontal" method="post">
							<!--隐藏  -->
							<input type="hidden" id="workexperienceId"
								name="workexperienceId">

							<div class="form-group">
								<label for="deptNO" class="col-sm-3 control-label">开始时间：</label>
								<div class="input-group date form_date col-sm-8 control-label"
									data-date="" data-date-format="yyyy-mm-dd"
									data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">
									<input type="text" class="form-control date" id="startTime2"
										readonly>
									<!-- <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span> -->
									<span class="input-group-addon"><span
										class="glyphicon glyphicon-calendar"></span></span>
								</div>

							</div>



							<div class="form-group">
								<label for="deptName" class="col-sm-3 control-label">结束时间：</label>
								<div class="input-group date form_date col-sm-8 control-label"
									data-date="" data-date-format="yyyy-mm-dd"
									data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">
									<input type="text" class="form-control date" id="endTime2"
										readonly>
									<!-- <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span> -->
									<span class="input-group-addon"><span
										class="glyphicon glyphicon-calendar"></span></span>
								</div>

							</div>

							<div class="form-group">
								<label for="dpPhone" class="col-sm-3 control-label">所在公司：</label>
								<div class="col-sm-8">
									<input type="text" class="form-control" id="company"
										name="company">
								</div>
							</div>
							<div class="form-group">
								<label for="superId" class="col-sm-3 control-label">职位：</label>
								<div class="col-sm-8">
									<input type="text" class="form-control" id="position"
										name="position">

								</div>
							</div>
							<div class="form-group">
								<label for="superId" class="col-sm-3 control-label">个人信息：</label>
								<div class="col-sm-8">
									<input type="text" class="form-control" id="basicInfoId"
										name="basicInfoId">

								</div>
							</div>
						</form>
					</div>

					<div class="am-modal-actions-group">
						<button class="am-btn am-btn-secondary am-btn-block" data-am-modal-confirm
							style="width: 90px; float: left; margin-left: 150px; margin-right: 50px;"
							id="saveWork">保存</button>
						<button class="am-btn am-btn-secondary am-btn-block" data-am-modal-confirm
							style="width: 90px; float: left; margin-left: 150px; margin-right: 50px;"
							id="editWork">修改</button>
						<button class="am-btn am-btn-secondary am-btn-block"
							data-am-modal-close style="width: 90px;">关闭</button>
					</div>
				</div>
			</div>

		<script src="../js/amazeui.min.js"></script>
		<script src="../js/amazeui.datatables.min.js"></script>
		<script src="../js/dataTables.responsive.min.js"></script>
		<script src="../js/app.js"></script>
</body>

</html>