package com.logincontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/logout")
public class Logout extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// u can write below code in jsp page also as per your requirement.
		// use to clear session object.
		HttpSession session = request.getSession(false);
		session.invalidate();
		
		// use to clear Cookie object.
		Cookie[] cookies = request.getCookies();
		for(Cookie c:cookies) {
			if(c.getName().equals("email"))
				{
				c.setMaxAge(0);
				}
		}
		response.sendRedirect("Home.jsp");
	}

}
