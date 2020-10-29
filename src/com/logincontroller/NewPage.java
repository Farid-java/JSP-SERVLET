package com.logincontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

 
@WebServlet("/newpage")
public class NewPage extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  // for Maintaing Session here u can use both response.sendRedirect and ...
		// RequestDispatcher requestDispatcher
		
		  HttpSession session = request.getSession(false); System.out.println(session);
		  if(session.isNew()) { 
			  RequestDispatcher requestDispatcher =request.getRequestDispatcher("Home.jsp"); 
		  requestDispatcher.forward(request, response);
		//  response.sendRedirect("Home.jsp"); 	
		  }
		  
		  
		  else { //response.sendRedirect("NewPage.jsp"); 
		RequestDispatcher  requestDispatcher = request.getRequestDispatcher("NewPage.jsp"); 
		  requestDispatcher.forward(request, response); }
		 
	}

}
