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
 * Servlet implementation class RemoveDutyInfo
 */
@WebServlet("/RemoveDutyInfo")
public class RemoveDutyInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RemoveDutyInfo() {
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
		Integer dutyId = Integer.parseInt(request.getParameter("dutyId"));
		DutyInfo dutyInfo = new DutyInfo();
		dutyInfo.setDutyId(dutyId);
		DutyService dutyService = new DutyService();
		Boolean falg = dutyService.removaDuty(dutyId);
		PrintWriter out = response.getWriter();
		out.println(falg);
	}

}
