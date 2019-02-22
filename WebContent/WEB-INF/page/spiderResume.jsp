<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<c:set var="basePath" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html lang="en">
<head>
<jsp:include page="base.jsp" />
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<meta name="description" content="这是一个简历信息爬取页面">
<meta name="keywords" content="spiderResume">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="renderer" content="webkit">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<title>简历信息爬取</title>
<%@include file="header.jsp"%>
<script>
	var contextPath = '${basePath}';
</script>
<script type="text/javascript" src="js/logic/spiderResume.js"></script>
<link rel="icon" type="image/png" href="i/favicon.png">
<link rel="apple-touch-icon-precomposed" href="i/app-icon72x72@2x.png">
<link rel="stylesheet" href="css/amazeui.min.css" />
<link rel="stylesheet" href="css/need/amazeui.min.css" />
<link rel="stylesheet" href="css/amazeui.datatables.min.css" />
<link rel="stylesheet" href="css/app.css">
<link rel="stylesheet" href="css/admin.css">
</head>
<body>
<body data-type="widgets" style="overflow-y: auto;">
	<script src="js/theme.js"></script>
	<div class="am-g tpl-g">
		<!-- 头部 -->
		<header>
			<!-- logo -->
			<div class="am-fl tpl-header-logo">
				<a href="javascript:void(0);"><img src="images/iss-logo.png"
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
											<img src="images/user06.png" alt="">
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
											<img src="images/user03.png" alt="">
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
						<img src="images/user04.png" alt="">
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
				<li class="sidebar-nav-link"><a href="page/index.jsp"> <i
						class="am-icon-home sidebar-nav-link-logo"></i> 首页
				</a></li>



				<li class="sidebar-nav-link"><a href="javascript:;"
					class="sidebar-nav-sub-title active"> <i
						class="am-icon-wpforms sidebar-nav-link-logo"></i> 招聘管理 <span
						class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico sidebar-nav-sub-ico-rotate"></span>
				</a>
					<ul class="sidebar-nav sidebar-nav-sub" style="display: block;">
						<li class="sidebar-nav-link"><a
							href="page/recruitManager.jsp"> <span
								class="am-icon-angle-right sidebar-nav-link-logo"></span> 基本信息管理
						</a></li>

						<li class="sidebar-nav-link"><a href="page/extraMessage.jsp">
								<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
								附加信息管理
						</a></li>
						<li class="sidebar-nav-link"><a
							href="goToSpiderRecruitPage.do"> <span
								class="am-icon-angle-right sidebar-nav-link-logo"></span>
								招聘信息搜索引擎
						</a></li>
						<li class="sidebar-nav-link"><a
							href="goToSpiderResumePage.do" class="sub-active"> <span
								class="am-icon-angle-right sidebar-nav-link-logo"></span>
								简历信息搜索引擎
						</a></li>


					</ul></li>

				<!-- 	<li class="sidebar-nav-link"><a href="javascript:;"
					class="sidebar-nav-sub-title"> <i
						class="am-icon-calendar sidebar-nav-link-logo"></i> 人事档案管理 <span
						class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
				</a>
					<ul class="sidebar-nav sidebar-nav-sub">
						<li class="sidebar-nav-link"><a href="page/table-list.jsp"> <span
								class="am-icon-angle-right sidebar-nav-link-logo"></span> 数据字典
						</a></li>

						<li class="sidebar-nav-link"><a href="page/table-list-img.jsp">
								<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
								部门管理
						</a></li>

						<li class="sidebar-nav-link"><a href="page/table-list-img.jsp">
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
						

						<li class="sidebar-nav-link"><a href="page/salaryManager.jsp">
								<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
								基本薪资管理
						</a></li>

						<li class="sidebar-nav-link"><a href="page/payrollManager.jsp">
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
						<li class="sidebar-nav-link"><a href="page/dicValue.jsp">
								<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
								数据字典
						</a></li>
						<li class="sidebar-nav-link"><a
							href="page/dicTypeManager2.jsp"> <span
								class="am-icon-angle-right sidebar-nav-link-logo"></span> 数据类型
						</a></li>
						<li class="sidebar-nav-link"><a href="page/deptManager.jsp">
								<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
								部门管理
						</a></li>
						<li class="sidebar-nav-link"><a href="page/dutyManager1.jsp">
								<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
								职务管理
						</a></li>
						<li class="sidebar-nav-link"><a href="page/UserManager.jsp">
								<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
								用户管理
						</a></li>
					</ul></li>

			</ul>

		</div>

		<!-- content start -->
		<div class="tpl-content-wrapper">
			<div class="row-content am-cf">
				<div class="panel panel-danger">
					<div class="panel-heading">
						<strong class="am-text-primary am-text-lg">简历信息搜索引擎</strong> / <small>爬取简历信息</small>
					</div>
					<div class="panel-body">
						<!-- 选项卡 -->
						<ul id="myTab" class="nav nav-tabs">
							<li id="TJPeople" class="active"><a href="#tblResultDiv1"
								data-toggle="tab">金湖人才网数据</a></li>
							<li id="GanJi"><a href="#tblResultDiv2" data-toggle="tab">赶集网数据</a></li>
						</ul>
						<div id="result" class="tab-content ">
							<div class="tab-pane fade in active" id="tblResultDiv1">
								<button type="button" id="btnSetSpider1"
									class="am-btn am-btn-success am-round js-modal-open"
									style="margin-left: 0px; margin-top: 0px;">爬虫设置</button>
								<button type="button" id="btnCleanSpider1"
									class="am-btn am-btn-danger am-round js-modal-open"
									style="margin-left: 10px; margin-top: 0px;">清空数据</button>
								<div id="toolbar1" class="btn-group">
									<button id="btn_add1" type="button" class="btn btn-default">
										<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
									</button>
									<button id="btn_edit1" type="button" class="btn btn-default">
										<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
									</button>
									<button id="btn_delete1" type="button" class="btn btn-default">
										<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
									</button>
								</div>
								<table id="tblResult1"
									class="am-table am-table-bordered am-table-radius am-table-hover">
									<thead>
										<tr>
											<!-- <th class="center" data-field="checked" data-checkbox=true></th> -->
											<th class=" text-center" data-field="xuhao"
												data-formatter="xuhao">序号</th>
											<th class=" text-center" data-field="name">姓名</th>
											<th class=" text-center" data-field="sex">性别</th>
											<th class=" text-center" data-field="age">年龄</th>
											<th class=" text-center" data-field="edu">教育</th>
											<th class=" text-center" data-field="nature">工作性质</th>
											<th class=" text-center" data-field="money">期望工资</th>
											<th class=" text-center" data-field="willjob">意愿工作</th>
											<th class=" text-center" data-field="date">发布时间</th>
										</tr>
									</thead>
									<tbody id="tableResult1"></tbody>
								</table>
							</div>
							<div class="tab-pane fade" id="tblResultDiv2">
								<button type="button" id="btnSetSpider2"
									class="am-btn am-btn-success am-round js-modal-open"
									style="margin-left: 0px; margin-top: 0px;">爬虫设置</button>
								<button type="button" id="btnCleanSpider2"
									class="am-btn am-btn-danger am-round js-modal-open"
									style="margin-left: 10px; margin-top: 0px;">清空数据</button>
								<div id="toolbar2" class="btn-group">
									<button id="btn_add2" type="button" class="btn btn-default">
										<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
									</button>
									<button id="btn_edit2" type="button" class="btn btn-default">
										<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
									</button>
									<button id="btn_delete2" type="button" class="btn btn-default">
										<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
									</button>
								</div>
								<table id="tblResult2"
									class="am-table am-table-bordered am-table-radius am-table-hover">
									<thead>
										<tr>
											<!-- <th class="center" data-field="checked" data-checkbox=true></th> -->
											<th class=" text-center" data-field="xuhao"
												data-formatter="xuhao">序号</th>
											<th class=" text-center" data-field="name">姓名</th>
											<th class=" text-center" data-field="sex">性别</th>
											<th class=" text-center" data-field="age">年龄</th>
											<th class=" text-center" data-field="area">地区</th>
											<th class=" text-center" data-field="edu">教育</th>
											<th class=" text-center" data-field="experience">工作经验</th>
											<th class=" text-center" data-field="money">期望工资</th>
											<th class=" text-center" data-field="date">发布时间</th>
										</tr>
									</thead>
									<tbody id="tableResult2"></tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- 模态框 -->
	<div class="am-modal am-modal-prompt" tabindex="-1" id="prompt-modal">
		<div class="am-modal-dialog">
			<input type="hidden" id="urlName">
			<div class="am-modal-hd">爬虫设置</div>
			<div class="am-modal-bd">
				请输入爬取页数 <input id="pageNumber" type="number"
					class="am-modal-prompt-input">
			</div>
			<div class="am-modal-footer">
				<span class="am-modal-btn" data-am-modal-cancel>取消</span> <span
					class="am-modal-btn" data-am-modal-confirm id="spiderSubmit">提交</span>
			</div>
		</div>
	</div>
	<div class="am-modal am-modal-confirm" tabindex="-1" id="confirm-modal">
		<div class="am-modal-dialog">
			<div class="am-modal-hd">清空数据</div>
			<div class="am-modal-bd">你确定要清空数据么？</div>
			<div class="am-modal-footer">
				<span class="am-modal-btn" data-am-modal-cancel>取消</span> <span
					class="am-modal-btn" data-am-modal-confirm onclick="delData()">确定</span>
			</div>
		</div>
	</div>
	<div class="am-modal am-modal-no-btn" tabindex="-1" id="count-modal">
		<div class="am-modal-dialog">
			<div class="am-modal-hd">
				统计数据 <a href="javascript: void(0)" class="am-close am-close-spin"
					data-am-modal-close>&times;</a>
				<hr>
			</div>
			<div class="am-modal-bd"></div>
		</div>
	</div>
	<div class="am-modal am-modal-prompt" tabindex="-1"
		id="data-edit-modal">
		<input type="hidden" id="editDataId" />
		<div class="am-modal-dialog">
			<div class="am-modal-hd">
				<font size="4px" id="editModalHead"></font> <a
					href="javascript: void(0)" class="am-close am-close-spin"
					data-am-modal-close>&times;</a>
				<hr>
			</div>
			<div class="am-modal-bd" id="editModalBody"></div>
			<div class="am-modal-footer">
				<span class="am-modal-btn" data-am-modal-cancel>取消</span> <span
					class="am-modal-btn" id="biaoZhi" onclick="updateByData()">变更</span>
			</div>
		</div>
	</div>
	<div class="am-modal am-modal-confirm" tabindex="-1"
		id="data-delete-modal">
		<div class="am-modal-dialog">
			<input type="hidden" id="dataIndex" />
			<div class="am-modal-hd">删除数据</div>
			<div class="am-modal-bd">你确定要删除该条数据吗？</div>
			<div class="am-modal-footer">
				<span class="am-modal-btn" data-am-modal-cancel>取消</span> <span
					class="am-modal-btn" data-am-modal-confirm onclick="delById()">确定</span>
			</div>
		</div>
	</div>
	<div class="am-modal am-modal-alert" tabindex="-1" id="alert-modal">
		<div class="am-modal-dialog">
			<div class="am-modal-hd">操作成功</div>
			<div class="am-modal-bd">请点击确定或暗区在页面中查看！</div>
			<div class="am-modal-footer">
				<span class="am-modal-btn">确定</span>
			</div>
		</div>
	</div>
	<div class="am-modal am-modal-loading am-modal-no-btn" tabindex="-1"
		id="loading-modal">
		<div class="am-modal-dialog">
			<div class="am-modal-hd">正在导入数据...</div>
			<div class="am-modal-bd">
				<span class="am-icon-spinner am-icon-spin"></span>
			</div>
		</div>
	</div>
	<!-- Amazeui标准引入 -->
	<script src="js/amazeui.min.js"></script>
	<script src="js/amazeui.datatables.min.js"></script>
	<script src="js/dataTables.responsive.min.js"></script>
	<script src="js/app.js"></script>
</body>

</html>