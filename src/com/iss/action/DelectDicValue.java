package com.iss.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iss.modal.DicValueInfo;
import com.iss.service.DicValueService;

/**
 * Servlet implementation class DelectDicValue
 */
@WebServlet("/DelectDicValue")
public class DelectDicValue extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DelectDicValue() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获取表单数据
		Integer id = Integer.parseInt(request.getParameter("id"));
		// request.getParameter()方法返回String类型的数据。
		// 2.利用表单数据创建实体对象
		DicValueInfo dicValueInfo = new DicValueInfo();// 实例化对象
		dicValueInfo.setId(id);
		// 3.实例化Service对象，使用相关方法处理实体对象
		DicValueService dicValueService = new DicValueService();
		Boolean flag = dicValueService.delete(id);
		// 4.返回提示信息
		PrintWriter out = response.getWriter();
		out.println(flag);
	}

}
