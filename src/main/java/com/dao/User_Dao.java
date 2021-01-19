package com.dao;

import java.sql.PreparedStatement;

import com.entities.User;
import com.mysql.jdbc.Connection;

public class User_Dao {

	
	private Connection con;

	//when u create object of User_Dao we get connection of mysql because u have to pass connection in constructor.
	public User_Dao(Connection con) {
		this.con = con;
	}
	
	//method to insert user to data base
	public Boolean saveUser(User user)
	{
		boolean f=false;
		try {
			
			String query="insert into user(name,email,password,gender,about) values(?,?,?,?,?)";
			PreparedStatement pstmt= con.prepareStatement(query);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getPassword());
			pstmt.setString(4, user.getGender());
			pstmt.setString(5, user.getAbout());
			
			int executeUpdate = pstmt.executeUpdate();
			
			f=true;
			
		} catch (Exception e) {
            
		}
		return f;
	}
	
	
	
	
}
