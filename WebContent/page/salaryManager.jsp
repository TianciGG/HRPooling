<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title></title>

<link rel="stylesheet" href="../css/amazeui.min.css" />
<link rel="stylesheet" href="../css/amazeui.datatables.min.css" />
<link rel="stylesheet" href="../css/app.css">


<!--CSS样式表，一般放在最前面-->
<link rel="stylesheet" type="text/css"
	href="../bootstrap/css/bootstrap.css" />
<link rel="stylesheet" type="text/css"
	href="../bootstrap/bootstrap-table/bootstrap-table.css" />
<link rel="stylesheet" href="../bootstrap/css/sweetalert.css" />
<!--JS文件，jquery文件放在最前面-->
<script type="text/javascript" src="../bootstrap/js/jquery.min.js"></script>
<script src="../bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="../bootstrap/bootstrap-table/bootstrap-table.js"></script>
<script type="text/javascript"
	src="../bootstrap/bootstrap-table/locale/bootstrap-table-zh-CN.js"></script>
<script type="text/javascript" src="../bootstrap/js/sweetalert.min.js"></script>
<!--外联js表-->
<script type="text/javascript" src="../js/salaryManager.js"></script>
</head>
<body>
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
					class="sidebar-nav-sub-title"> <i
						class="am-icon-wpforms sidebar-nav-link-logo"></i>招聘管理 <span
						class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
				</a>
					<ul class="sidebar-nav sidebar-nav-sub">
						<li class="sidebar-nav-link"><a href="recruitManager.jsp"
							> <span
								class="am-icon-angle-right sidebar-nav-link-logo"></span> 基本信息管理
						</a></li>

						<li class="sidebar-nav-link"><a href="extraMessage.jsp">
								<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
								附加信息管理
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
					class="sidebar-nav-sub-title active"> <i
						class="am-icon-bar-chart sidebar-nav-link-logo"></i> 薪资考勤管理 <span
						class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico sidebar-nav-sub-ico-rotate"></span>
				</a>
					<ul class="sidebar-nav sidebar-nav-sub" style="display: block;">
						<li class="sidebar-nav-link"><a href="salaryManager.jsp" class="sub-active"> <span
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

						<li class="sidebar-nav-link"><a href="Notice.jsp">
								<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
								公告管理
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


		<div class="tpl-content-wrapper">


	<div class="row-content am-cf">
<div class="panel panel-danger">
<div class="panel-heading">
			<h1>基本薪资管理</h1>
			</div>
			
			
				<div class="panel-body">
				<table id="tbDept" toolbar="#toolbar">
			</table>
				
				</div>
			</div>
			</div>
			

		</div>
	</div>


	<!--添加toolbar-->
	<div class="btn-toolbar" role="toolbar" id="toolbar">
		<div class="btn-group">
			<button type="button" id="btnAdd"
				class=" btn btn-success glyphicon glyphicon-plus">添加</button>
			<button type="button" id="btnEdit"
				class=" btn btn-primary glyphicon glyphicon-pencil">修改</button>
			<button type="button" id="btnswe"
				class="btn btn-danger glyphicon glyphicon-trash">删除</button>
		</div>
	</div>
	<!-- Modal 模态框 -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<!--模态框头部-->
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="SaveModalLabel">添加基本薪资信息</h4>
					<h4 class="modal-title" id="UpdateModalLabel">修改基本薪资信息</h4>
				</div>
				<!--模态框主题内容-->
				<div class="modal-body">
					<!--添加from表单-->
					<form class="form-horizontal">
						<!--第一个文本框-->
						<div class="form-group">
							<div class="col-sm-10">
								<input type="hidden" class="form-control" id="salaryId">
							</div>
						</div>

						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">员工ID</label>
							<div class="col-sm-10">

								<select id="empId" class="form-control"></select>
							</div>
						</div>

						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">基本薪资</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="salary"
									placeholder="基本薪资">
							</div>
						</div>

					</form>
				</div>
				<!--模态框底部-->
				<div class="modal-footer">
					<button type="button" class="btn btn-danger" data-dismiss="modal">关闭</button>
					<button type="button"
						class="btn btn-primary glyphicon glyphicon-download-alt"
						id="btnSubmit">确定</button>
				</div>
			</div>
		</div>
	</div>
	
	
	<script src="../js/amazeui.min.js"></script>
		<script src="../js/amazeui.datatables.min.js"></script>
		<script src="../js/dataTables.responsive.min.js"></script>
		<script src="../js/app.js"></script>
</body>
</html>
