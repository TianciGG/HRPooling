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
		//��ȡ������
				String name = request.getParameter("name");
				String des = request.getParameter("des");
				
			
				//���ñ�����ʵ�����
				DicTypeInfo dicTypeInfo = new DicTypeInfo();
				dicTypeInfo.setName(name);
				dicTypeInfo.setDes(des);
				
			    
			  
				//3.ʵ����service����ʹ����ط�������ʵ�����
				DicTypeService dicTypeService = new DicTypeService();
				Boolean flag = dicTypeService.addDicType(dicTypeInfo);
				//4.������ʾ��Ϣ
				PrintWriter out = response.getWriter();
				out.println(flag);
			
	}

}
