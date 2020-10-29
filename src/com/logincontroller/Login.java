package com.logincontroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

import com.dao.Dao;
import com.daoImplement.DaoImplement;
import com.model.Register;

 
  
@WebServlet("/login")
public class Login extends HttpServlet {
	
	// USE OF CONFIG 
	 ServletContext context;
	@Override
	public void init(ServletConfig config) throws ServletException {
		context = config.getServletContext();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String email= request.getParameter("email");
		 String password= request.getParameter("password");
			
		 Dao daoImplement = new DaoImplement();
		 Register login = daoImplement.login(email);
		 
		 if(email.equals(login.getEmail())&& password.equals(login.getPassword())) {
			  
			 //1 - USE OF COOKIES -creating cookie
			 Cookie cookie = new Cookie("email", login.getEmail());
			 response.addCookie(cookie);
			// response.sendRedirect("afterLogin.jsp");
			 
			 //2-  USE OF SESSION
			 HttpSession session = request.getSession();
			 System.out.println(session);
			 session.setAttribute("data", login);
			 
			                 
			 //3-USE OF REQUEST-But here u have to use RequestDispatcher only. 
			 request.setAttribute("Address1", login.getAddress1());
		 
			 ServletContext servletContext = request.getServletContext();
			// servletContext.setSessionTimeout(10000);
			 servletContext.setAttribute("application", login.getCity());	
			 
			 
			 //USE OF SERVLET_CONTEXT BY USING CONFIG
			 context.setAttribute("config", login.getPassword());
			 
			 
	 
			 
			RequestDispatcher dispatcher = request.getRequestDispatcher("afterLogin.jsp");
			 dispatcher.forward(request, response);
				// response.sendRedirect("afterLogin.jsp");
		 }
		 
		 else {
			 RequestDispatcher dispatcher = request.getRequestDispatcher("Home.jsp");
			 PrintWriter out=response.getWriter();
			 out.println("User Invalid");
			 dispatcher.include(request, response);
			 response.setContentType("text/html");
			 
			 //response.sendRedirect("Home.jsp");
		 }
		 
	}

}
