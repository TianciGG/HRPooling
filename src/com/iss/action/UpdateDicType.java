package com.iss.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iss.modal.DicTypeInfo;
import com.iss.service.DicTypeService;

/**
 * Servlet implementation class UpdateDicType
 */
@WebServlet("/UpdateDicType")
public class UpdateDicType extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateDicType() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取表单数据
		Integer id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String des = request.getParameter("des");
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(des);
		
		//利用表单创建实体对象
		DicTypeInfo dicTypeInfo = new DicTypeInfo();
		dicTypeInfo.setId(id);
		dicTypeInfo.setName(name);
		dicTypeInfo.setDes(des);
		//3.实例化service对象，使用相关方法处理实体对象
		DicTypeService dicTypeService = new DicTypeService();
		Boolean falg = dicTypeService.updateDicType(dicTypeInfo);
		//返回提示信息
		PrintWriter out = response.getWriter();
		out.println(falg);
		
	}

}
