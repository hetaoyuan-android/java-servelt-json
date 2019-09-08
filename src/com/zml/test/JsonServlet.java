package com.zml.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zml.utils.DataUtil;
import com.zml.utils.JsonTools;

/**
 * @author 王耀
 * 
 * @version 1.0
 */
public class JsonServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public JsonServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html；charset=utf-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		this.doPost(request, response);

	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html；charset=utf-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();

		String jsonString="";
		String 	actionString = request.getParameter("action");
		
		if (actionString.equals("person")) {
			
			jsonString = JsonTools.createJsonString("person",DataUtil.getPerson());
			System.out.print("访问到");

		} else if (actionString.equals("persons")) {
			
			jsonString = JsonTools.createJsonString("persons",DataUtil.getPersons());

		} else if (actionString.equals("strings")) {
			
			jsonString = JsonTools.createJsonString("strings",DataUtil.getStrings());

		} else if (actionString.equals("maps")) {
			
			jsonString = JsonTools.createJsonString("maps",DataUtil.getMaps());
			
		}
		System.out.print("访问到11");
		out.write(jsonString);

	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
