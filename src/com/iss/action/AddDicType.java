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
import com.iss.service.DicTypeService;

/**
 * Servlet implementation class AddDicType
 */
@WebServlet("/AddDicType")
public class AddDicType extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDicType() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	*//**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取表单数据
				String name = request.getParameter("name");
				String des = request.getParameter("des");
				
			
				//利用表单创建实体对象
				DicTypeInfo dicTypeInfo = new DicTypeInfo();
				dicTypeInfo.setName(name);
				dicTypeInfo.setDes(des);
				
			    
			  
				//3.实例化service对象，使用相关方法处理实体对象
				DicTypeService dicTypeService = new DicTypeService();
				Boolean flag = dicTypeService.addDicType(dicTypeInfo);
				//4.返回提示信息
				PrintWriter out = response.getWriter();
				out.println(flag);
			
	}

}
