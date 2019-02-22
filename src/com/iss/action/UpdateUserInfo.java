package com.iss.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iss.modal.UserInfo;
import com.iss.service.UserService;

/**
 * Servlet implementation class UpdateUserInfo
 */
@WebServlet("/UpdateUserInfo")
public class UpdateUserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateUserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// 获取表单数据
		String userName = request.getParameter("userName");
		String uPassword = request.getParameter("uPassword");
		Integer userId = Integer.parseInt(request.getParameter("userId"));
		// 利用表单数据创建实体对象
		UserInfo userInfo = new UserInfo();
		userInfo.setUserName(userName);
		userInfo.setuPassword(uPassword);
		userInfo.setUserId(userId);
		// 实例化Service对象，使用相关方法处理实体对象。
		UserService userService = new UserService();
		Boolean flag = userService.update(userInfo);
		// 返回提示信息
		PrintWriter out = response.getWriter();
		out.println(flag);

	}
}