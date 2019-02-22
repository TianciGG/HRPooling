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
 * Servlet implementation class AddDicValue
 */
@WebServlet("/AddDicValue")
public class AddDicValue extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddDicValue() {
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
		// ��ȡ������
		// Integer typeid = Integer.parseInt(request.getParameter("typeid"));
		// String value = request.getParameter("value");
		String name = request.getParameter("typeid");
		String display = request.getParameter("display");
		String des = request.getParameter("des");

		// ���ñ����ݴ���ʵ�����
		DicValueInfo dicValueInfo = new DicValueInfo();
		// dicValueInfo.setTypeid(typeid);
		// dicValueInfo.setValue(value);
		dicValueInfo.setName(name);
		dicValueInfo.setDisplay(display);
		dicValueInfo.setDes(des);

		// ʵ����service����ʹ����ط�������ʵ�����
		DicValueService dicValueService = new DicValueService();
		Boolean flag = dicValueService.add(dicValueInfo);
		// ������ʾ��Ϣ
		PrintWriter out = response.getWriter();
		out.println(flag);
	}

}
