package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
	
	

    //get user by useremail and userpassword:
    public User getUserByEmailAndPassword(String email, String password) {
        User user = null;

        try {

            String query = "select * from user where email =? and password=?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, email);
            pstmt.setString(2, password);

            ResultSet set = pstmt.executeQuery();

            if (set.next()) {
                user = new User();

//             data from db
                String name = set.getString("name");
//             set to user object
                user.setName(name);

                user.setId(set.getInt("id"));
                user.setEmail(set.getString("email"));
                user.setPassword(set.getString("password"));
                user.setGender(set.getString("gender"));
                user.setAbout(set.getString("about"));
                user.setDateTime(set.getTimestamp("r_date"));
                user.setProfile(set.getString("profile"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }

	
}
