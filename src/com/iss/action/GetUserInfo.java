package com.iss.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.iss.modal.UserInfo;
import com.iss.service.UserService;

/**
 * Servlet implementation class GetUserInfo
 */
@WebServlet("/GetUserInfo")
public class GetUserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetUserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		UserService userService = new UserService();

		List<UserInfo> userList = userService.getAllUser();

		Gson gson = new Gson();

		String jsonStr = "{\"total\":" + userList.size() + ",\"rows\":" + gson.toJson(userList) + "}";
		System.out.println(jsonStr);

		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.println(jsonStr);
	}

}
