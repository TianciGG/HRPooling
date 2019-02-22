package com.iss.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iss.modal.DeptInfo;
import com.iss.service.DeptService;

/**
 * Servlet implementation class SaveDeptInfo
 */
@WebServlet("/SaveDeptInfo")
public class SaveDeptInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveDeptInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ȡ������
		String deptNO = request.getParameter("deptNO");
		String deptName = request.getParameter("deptName");
		String dpPhone = request.getParameter("dpPhone");
		String dpProfile = request.getParameter("dpProfile");
		Integer superId =Integer.parseInt(request.getParameter("superId"));
		//���ñ�����ʵ�����
		DeptInfo deptInfo = new DeptInfo();
		deptInfo.setDeptNO(deptNO);
		deptInfo.setDeptName(deptName);
		deptInfo.setDpPhone(dpPhone);
		deptInfo.setDpProfile(dpProfile);
	    deptInfo.setSuperId(superId);
	    
	  
		//3.ʵ����service����ʹ����ط�������ʵ�����
		DeptService deptService = new DeptService();
		Boolean flag = deptService.addDept(deptInfo);
		//4.������ʾ��Ϣ
		PrintWriter out = response.getWriter();
		out.println(flag);
	}

}
