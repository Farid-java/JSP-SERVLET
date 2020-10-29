package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Dao;
import com.daoImplement.DaoImplement;
import com.daoImplement.DbConnection;
import com.model.Register;

 
@WebServlet("/registered")
// this method use for inserting as well as fetch data from databse.
public class Registered extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//getting data from HTML
		String  email= request.getParameter("email");
		String  password= request.getParameter("password");
		String  address1= request.getParameter("address1");
		String  address2= request.getParameter("address2");
		String  city= request.getParameter("city");
		String  state= request.getParameter("state");
		String  zip= request.getParameter("zip");
		String  ch= request.getParameter("check");
	   String id = request.getParameter("id");
		String  submit= request.getParameter("button");
		
		
		
		
		//Set Data to Model Class 
		Register register=new Register();
		
		//this is only applicable in update time but if u insert new record then id not to be set because id is...
		//auto-increment in database, if u set id at the time of insert new record then it show number format exception.
		if(submit.equals("update")) { register.setId(Integer.parseInt(id)); }
		
		register.setEmail(email);
		register.setPassword(password);
		register.setAddress1(address1);
		register.setAddress2(address2);
		register.setCity(city);
		register.setState(state);
		register.setZip(zip);
		register.setCheck(ch);
		
		// use to update data into database
	 if(submit.equals("update")) {
		 Dao daoImplement = new DaoImplement();
		 daoImplement.update(register);
	 }
	 
	 
	 else {
        		//inserting Data to Database
		Dao daoImplement = new DaoImplement();
		int insert = daoImplement.insert(register);
		List<Register> fetchList = daoImplement.fetch();
	 }
		
		
		//RequestDispatcher requestDispatcher = request.getRequestDispatcher("/");
		
		//this will take list of Object to jsp page but we should use RequestDispatcher only because...
				//RequestDispatcher forward same request and response object to next page like index.jsp below.
		//request.setAttribute("list", fetchList);
		
		
				//requestDispatcher.forward(request, response);	
	 response.sendRedirect(request.getContextPath()+"/");
		
	}

	//this method is use for delete data from database
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Dao daoImplement = new DaoImplement();
		daoImplement.delete(req.getParameter("id"));
		
		resp.sendRedirect("index.jsp");
	}
	
	

}
