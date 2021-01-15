package com.helper;


import java.sql.DriverManager;

import org.apache.catalina.ant.FindLeaksTask;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;

public class ConnectionProvider {
	
	private final static String url="jdbc:mysql://localhost:3306/techblog";
	 private final static String userName="root"; 
	 private final static String password="root"; 

	public static Connection con;
	
	public static Connection getConnection()
	{
		try {
			if(con==null) {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(url,userName,password);
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
	
}
