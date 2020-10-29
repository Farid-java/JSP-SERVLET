package com.daoImplement;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/crud_jsp_servlet";
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	
	
	 
	public static Connection getCon()
	{   Connection con=null;
		
		try {
			Class.forName(DRIVER);
			   con= (Connection) DriverManager.getConnection(URL,USER,PASSWORD);
			
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
		return con;
		
	}

}
