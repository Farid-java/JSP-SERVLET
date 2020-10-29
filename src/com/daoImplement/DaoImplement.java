package com.daoImplement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.Dao;
import com.model.Register;

public class DaoImplement implements Dao {

	@Override
	public int insert(Register register) {
		int executeUpdate=0;
		Connection con = DbConnection.getCon();
		try {
			PreparedStatement prepareStatement = con.prepareStatement("insert into crud(email,password,address1,address2,city,state,zip,check1) values(?,?,?,?,?,?,?,?)");
			prepareStatement.setString(1,register.getEmail() );
			prepareStatement.setString(2, register.getPassword());
			prepareStatement.setString(3,register.getAddress1());
			prepareStatement.setString(4,register.getAddress2());
			prepareStatement.setString(5,register.getCity());
			prepareStatement.setString(6, register.getState());
			prepareStatement.setString(7,register.getZip());
			prepareStatement.setString(8, register.getCheck());
			
			  executeUpdate = prepareStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return executeUpdate;
	}

	
	@Override
	public int delete(String id) {
		int executeUpdate=0;
		 Connection con = DbConnection.getCon();
		 try {
			PreparedStatement prepareStatement = con.prepareStatement("delete from crud where id=?");
			prepareStatement.setString(1, id);
			  executeUpdate = prepareStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return executeUpdate;
	}

	
	@Override
	public void update(Register bean) {
		 Connection con = DbConnection.getCon();
		 try {
 PreparedStatement p  = con.prepareStatement("update crud set email=?,password=?,address1=?, address2=?,city=?,state=?,zip=?,check1=? where id=? ");
			p.setString(1, bean.getEmail());
			p.setString(2, bean.getPassword());
			p.setString(3, bean.getAddress1());
			p.setString(4, bean.getAddress2());
			p.setString(5, bean.getCity());
			p.setString(6, bean.getState());
			p.setString(7, bean.getZip());
			p.setString(8, bean.getCheck());
			p.setInt(9, bean.getId());
			p.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	
	
	
	@Override
	public List<Register> fetch() {
     Connection con = DbConnection.getCon();
     List<Register> list=new ArrayList<>();
     try {
		PreparedStatement prepareStatement = con.prepareStatement("select * from crud");
		ResultSet executeQuery = prepareStatement.executeQuery();
		
		while(executeQuery.next())
		{
			Register register=new Register();
			register.setEmail(executeQuery.getString(1));
			register.setPassword(executeQuery.getString(2));
			register.setAddress1(executeQuery.getString(3));
			register.setAddress2(executeQuery.getString(4));
			register.setCity(executeQuery.getString(5));
			register.setState(executeQuery.getString(6));
			register.setZip(executeQuery.getString(7));
			register.setCheck(executeQuery.getString(8));
			register.setId(executeQuery.getInt(9));
			list.add(register);
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     try {
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return list;
	}


	@Override
	public Register login(String email) {
		Connection con = DbConnection.getCon();
		Register register=new Register();
		try {
			PreparedStatement p = con.prepareStatement("select * from crud where email=?");
			p.setString(1, email);
			ResultSet executeQuery = p.executeQuery();
			
			while(executeQuery.next())
			{
				
				register.setEmail(executeQuery.getString(1));
				register.setPassword(executeQuery.getString(2));
				register.setAddress1(executeQuery.getString(3));
				register.setAddress2(executeQuery.getString(4));
				register.setCity(executeQuery.getString(5));
				register.setState(executeQuery.getString(6));
				register.setZip(executeQuery.getString(7));
				register.setCheck(executeQuery.getString(8));
				register.setId(executeQuery.getInt(9));
				
			}
			
			} 
		catch (SQLException e) { 	e.printStackTrace();  }
		return register;
	}
	
	
	

}
