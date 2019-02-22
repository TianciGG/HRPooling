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
import com.iss.modal.DicTypeInfo;
import com.iss.service.DeptService;
import com.iss.service.DicTypeService;

/**
 * Servlet implementation class GetDeptList
 */
@WebServlet("/RemoveDeptInfo")
public class RemoveDeptInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveDeptInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		
//		DeptService deptService = new DeptService();
//		
//		List<DeptInfo> deptList = deptService.queryDept();
//		
//		Gson gson = new Gson();
//		
//		String jsonStr = "{\"total\":"+deptList.size()+",\"rows\":"+gson.toJson(deptList)+"}";
//		System.out.println(jsonStr);
//		
//		response.setCharacterEncoding("utf-8");
//		request.setCharacterEncoding("utf-8");
//		PrintWriter out = response.getWriter();
//		out.println(jsonStr);
//		
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer deptId = Integer.parseInt(request.getParameter("deptId"));
		DeptInfo deptInfo = new DeptInfo();
		deptInfo.setDeptId(deptId);
		DeptService deptService = new DeptService();
		Boolean falg = deptService.removaDept(deptId);
		PrintWriter out = response.getWriter();
		out.println(falg);
		
	}

}
