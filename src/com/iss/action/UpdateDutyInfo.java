package com.iss.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iss.modal.DutyInfo;
import com.iss.service.DutyService;

/**
 * Servlet implementation class UpdateDutyInfo
 */
@WebServlet("/UpdateDutyInfo")
public class UpdateDutyInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateDutyInfo() {
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
		Integer dutyId = Integer.parseInt(request.getParameter("dutyId"));
		String dutyName = request.getParameter("dutyName");
		String dutydes = request.getParameter("dutydes");
		Integer deptId = Integer.parseInt(request.getParameter("deptId"));

		Integer superId = Integer.parseInt(request.getParameter("superId"));
		// ���ñ�����ʵ�����
		DutyInfo dutyInfo = new DutyInfo();
		dutyInfo.setDutyId(dutyId);
		dutyInfo.setDutyName(dutyName);
		dutyInfo.setDutydes(dutydes);
		dutyInfo.setDeptId(deptId);

		dutyInfo.setSuperId(superId);

		// 3.ʵ����service����ʹ����ط�������ʵ�����
		DutyService dutyService = new DutyService();
		Boolean flag = dutyService.updateDuty(dutyInfo);
		// 4.������ʾ��Ϣ
		PrintWriter out = response.getWriter();
		out.println(flag);
	}

}
