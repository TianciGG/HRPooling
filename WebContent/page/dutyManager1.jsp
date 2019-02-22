<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
<meta name="description" content="这是一个 index 页面">
<meta name="keywords" content="index">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="stylesheet" href="../bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="../bootstrap/bootstrap-table/bootstrap-table.css" />
<link rel="icon" type="image/png" href="../i/favicon.png">
<link rel="apple-touch-icon-precomposed"
	href="../images/app-icon72x72@2x.png">


<link rel="stylesheet" href="../css/amazeui.min.css" />
<link rel="stylesheet" href="../css/amazeui.datatables.min.css" />
<link rel="stylesheet" href="../css/app.css">
<script src="../js/jquery.min.js" type="text/javascript"></script>
<script src="../js/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="../bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="../bootstrap/bootstrap-table/bootstrap-table.js"></script>
<script type="text/javascript"
	src="../bootstrap/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>
<script type="text/javascript" src="../js/dutyManager1.js"></script>

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
						<li class="am-text-sm"><a href="login.jsp"> <span
								class="am-icon-sign-out"></span> 退出
						</a></li>
					</ul>
				</div>
			</div>


		</header>
	</div>

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
			<li class="sidebar-nav-link"><a href="index.jsp"> <i
					class="am-icon-home sidebar-nav-link-logo"></i> 首页
			</a></li>

		

			<li class="sidebar-nav-link"><a href="javascript:;"
				class="sidebar-nav-sub-title"> <i
					class="am-icon-wpforms sidebar-nav-link-logo"></i> 招聘管理 <span
					class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
			</a>
				<ul class="sidebar-nav sidebar-nav-sub">
					<li class="sidebar-nav-link"><a href="recruitManager.jsp">
							<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
							基本信息管理
					</a></li>

					<li class="sidebar-nav-link"><a href="extraMessage.jsp"> <span
							class="am-icon-angle-right sidebar-nav-link-logo"></span> 附加信息管理
					</a></li>
					<li class="sidebar-nav-link"><a
						href="../goToSpiderRecruitPage.do"> <span
							class="am-icon-angle-right sidebar-nav-link-logo"></span>
							招聘信息搜索引擎
					</a></li>
					<li class="sidebar-nav-link"><a href="../goToSpiderResumePage.do">
							<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
							简历信息搜索引擎
					</a></li>

				</ul></li>

		<!-- 	<li class="sidebar-nav-link"><a href="javascript:;"
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
				</ul></li>
 -->
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
				class="sidebar-nav-sub-title active"> <i
					class="am-icon-table sidebar-nav-link-logo"></i>系统管理 <span
					class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico sidebar-nav-sub-ico-rotate"></span>
			</a>
				<ul class="sidebar-nav sidebar-nav-sub" style="display: block;">
					<li class="sidebar-nav-link"><a href="dicValue.jsp"> <span
							class="am-icon-angle-right sidebar-nav-link-logo"></span> 数据字典
					</a></li>
					<li class="sidebar-nav-link"><a href="dicTypeManager2.jsp">
							<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
							数据类型
					</a></li>
					<li class="sidebar-nav-link"><a href="deptManager.jsp"> <span
							class="am-icon-angle-right sidebar-nav-link-logo"></span> 部门管理
					</a></li>
					<li class="sidebar-nav-link"><a href="dutyManager1.jsp"
						class="sub-active"> <span
							class="am-icon-angle-right sidebar-nav-link-logo"></span> 职务管理
					</a></li>
					<li class="sidebar-nav-link"><a href="UserManager.jsp"> <span
							class="am-icon-angle-right sidebar-nav-link-logo"></span> 用户管理
					</a></li>
				</ul></li>
		</ul>
	</div>

	<!-- 内容区域 -->
	<div class="tpl-content-wrapper">
		<div class="row-content am-cf">
			<div class="panel panel-default">
				<div class="panel-heading">职务管理</div>
				<div class="panel-body">
					<table id="tbDuty">

					</table>
					<div class="btn-toolbar" role="toolbar" id="toolbar">
						<div class="btn-group">
							<button type="button"
								class="am-btn am-btn-secondary js-modal-open" id="btnAdd">添加</button>
							<button type="button" class="am-btn am-btn-success js-modal-open"
								id="btnEdit">修改</button>
							<button type="button" class="am-btn am-btn-warning js-modal-open"
								id="btnRemove">删除</button>

						</div>
					</div>
				</div>

			</div>
		</div>
	</div>

	<!-- 模态框 -->
	<div class="am-modal am-modal-no-btn" tabindex="-1" id="your-modal">
		<div class="am-modal-dialog">
			<div class="am-modal-hd" style="margin-bottom: 20px;">

				<h4 class="modal-title" id="save">
					<strong>添加职务列表</strong>
				</h4>
				<a href="javascript: void(0)" class="am-close am-close-spin"
					data-am-modal-close>&times;</a>

				<h4 class="modal-title" id="edit">
					<strong>修改职务列表</strong>
				</h4>
				<a href="javascript: void(0)" class="am-close am-close-spin"
					data-am-modal-close>&times;</a>
			</div>
			<div class="am-modal-bd">
				<form class="form-horizontal" method="post">
					<input type="hidden" id="dutyId" name="dutyId">
					<div class="form-group">
						<label for="dutyName" class="col-sm-3 control-label">职务名称：</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" id="dutyName"
								name="dutyName">
						</div>
					</div>
					<div class="form-group">
						<label for="deptName" class="col-sm-3 control-label">部门名称：</label>
						<div class="col-sm-8">
							<select id="deptId" class="form-control" name="deptId"></select>

						</div>
					</div>
					<div class="form-group">
						<label for="superId" class="col-sm-3 control-label">上级：</label>
						<div class="col-sm-8">
							<select id="superId" class="form-control" name="superId">
							</select>
						</div>
					</div>
					<div class="form-group">
						<label for="dutydes" class="col-sm-3 control-label">职务描述：</label>
						<div class="col-sm-8">
							<textarea class="form-control" rows="3" id="dutydes"
								name="dutydes"></textarea>
						</div>
					</div>
					<div class="am-modal-actions-group">
						<button id="btnsubmit"
							class="am-btn am-btn-secondary am-btn-block"
							data-am-modal-confirm
							style="width: 90px; float: left; margin-left: 150px; margin-right: 50px;">确定</button>
						<button class="am-btn am-btn-secondary am-btn-block"
							data-am-modal-close style="width: 90px;">取消</button>
					</div>

				</form>
			</div>
		</div>
	</div>

	<script src="../js/amazeui.min.js"></script>
	<script src="../js/amazeui.datatables.min.js"></script>
	<script src="../js/dataTables.responsive.min.js"></script>
	<script src="../js/app.js"></script>

</body>

</html>