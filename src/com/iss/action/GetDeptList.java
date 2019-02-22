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
import com.iss.modal.DeptInfo;
import com.iss.service.DeptService;

/**
 * Servlet implementation class GetDeptList
 */
@WebServlet("/GetDeptList")
public class GetDeptList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetDeptList() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		DeptService deptService = new DeptService();

		List<DeptInfo> deptList = deptService.queryDept();

		Gson gson = new Gson();

		String jsonStr = "{\"total\":" + deptList.size() + ",\"rows\":" + gson.toJson(deptList) + "}";
		System.out.println(jsonStr);

		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.println(jsonStr);

	}

	// /**
	// * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	// response)
	// */
	// protected void doPost(HttpServletRequest request, HttpServletResponse
	// response) throws ServletException, IOException {
	// // TODO Auto-generated method stub
	// String deptNO = request.getParameter("deptNO");
	// String deptName = request.getParameter("deptName");
	// String dpPhone = request.getParameter("dpPhone");
	// String dpProfile = request.getParameter("dpProfile");
	// String superDeptName =request.getParameter("superDeptName");
	//
	// DeptInfo deptInfo = new DeptInfo();
	// deptInfo.setDeptNO(deptNO);
	// deptInfo.setDeptName(deptName);
	// deptInfo.setDpPhone(dpPhone);
	// deptInfo.setDpProfile(dpProfile);
	// deptInfo.setSuperDeptName(superDeptName);
	//
	// DeptService deptService = new DeptService();
	// Boolean flag = deptService.addDept(deptInfo);
	// PrintWriter out = response.getWriter();
	// out.println(flag);
	//
	// }

}
