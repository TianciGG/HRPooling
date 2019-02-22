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
import com.iss.modal.DicValueInfo;
import com.iss.service.DicValueService;

/**
 * Servlet implementation class GetDicValue
 */
@WebServlet("/GetDicValue")
public class GetDicValue extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetDicValue() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DicValueService dicValueService = new DicValueService();

		List<DicValueInfo> dicValueList = dicValueService.queryDicValue();

		Gson gson = new Gson();

		String jsonStr = "{\"total\":" + dicValueList.size() + ",\"rows\":" + gson.toJson(dicValueList) + "}";
		System.out.println(jsonStr);

		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.println(jsonStr);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

}
