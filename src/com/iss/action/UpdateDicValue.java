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
 * Servlet implementation class UpdateDicValue
 */
@WebServlet("/UpdateDicValue")
public class UpdateDicValue extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateDicValue() {
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
		// 1.��ȡ������
		Integer id = Integer.parseInt(request.getParameter("id"));
		Integer typeid = Integer.parseInt(request.getParameter("typeid"));
		String value = request.getParameter("value");
		String display = request.getParameter("display");
		String des = request.getParameter("des");

		// 2.���ñ����ݴ���ʵ�����
		DicValueInfo dicValueInfo = new DicValueInfo();

		dicValueInfo.setId(id);
		dicValueInfo.setTypeid(typeid);
		dicValueInfo.setValue(value);
		dicValueInfo.setDisplay(display);
		dicValueInfo.setDes(des);

		// 3.ʵ����Service����ʹ����ط�������ʵ�����
		DicValueService dicValueService = new DicValueService();
		Boolean flag = dicValueService.update(dicValueInfo);
		// 4.������ʾ��Ϣ
		PrintWriter out = response.getWriter();
		out.println(flag);
	}

}
