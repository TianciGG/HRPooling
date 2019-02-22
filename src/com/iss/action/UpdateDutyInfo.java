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

		// 获取表单数据
		Integer dutyId = Integer.parseInt(request.getParameter("dutyId"));
		String dutyName = request.getParameter("dutyName");
		String dutydes = request.getParameter("dutydes");
		Integer deptId = Integer.parseInt(request.getParameter("deptId"));

		Integer superId = Integer.parseInt(request.getParameter("superId"));
		// 利用表单创建实体对象
		DutyInfo dutyInfo = new DutyInfo();
		dutyInfo.setDutyId(dutyId);
		dutyInfo.setDutyName(dutyName);
		dutyInfo.setDutydes(dutydes);
		dutyInfo.setDeptId(deptId);

		dutyInfo.setSuperId(superId);

		// 3.实例化service对象，使用相关方法处理实体对象
		DutyService dutyService = new DutyService();
		Boolean flag = dutyService.updateDuty(dutyInfo);
		// 4.返回提示信息
		PrintWriter out = response.getWriter();
		out.println(flag);
	}

}
