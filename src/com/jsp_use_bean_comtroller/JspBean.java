package com.jsp_use_bean_comtroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp_use_bean_model.JspUseBean;

/**
 * Servlet implementation class JspBean
 */
@WebServlet("/jsp_use_bean")
public class JspBean extends HttpServlet {
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		JspUseBean bean=new JspUseBean();
		System.out.println(bean);
		// response.sendRedirect("jspUseBean.jsp");
		 
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.sendRedirect("jspUseBeanIndex.jsp");
	}

}
