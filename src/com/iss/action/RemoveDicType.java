package com.iss.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iss.modal.DeptInfo;
import com.iss.modal.DicTypeInfo;
import com.iss.service.DeptService;
import com.iss.service.DicTypeService;

/**
 * Servlet implementation class RemoveDicType
 */
@WebServlet("/RemoveDicType")
public class RemoveDicType extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveDicType() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
/*	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}*/

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id"));
		DicTypeInfo dicTypeInfo = new DicTypeInfo();
		dicTypeInfo.setId(id);
		DicTypeService dicTypeService = new DicTypeService();
		Boolean falg = dicTypeService.removaDept(id);
		PrintWriter out = response.getWriter();
		out.println(falg);
	}

}
