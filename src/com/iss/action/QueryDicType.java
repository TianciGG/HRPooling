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
 * Servlet implementation class QueryDicType
 */
@WebServlet("/QueryDicType")
public class QueryDicType extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryDicType() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		
DicTypeService dicTypeService = new DicTypeService();
		
		List<DicTypeInfo> dicTypeList = dicTypeService.queryDicType();
		
		Gson gson = new Gson();
		
		String jsonStr = "{\"total\":"+dicTypeList.size()+",\"rows\":"+gson.toJson(dicTypeList)+"}";
		System.out.println(jsonStr);
		
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.println(jsonStr);
		
	}

//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
