package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.test.ConnectionProvider;

public class Updates {
	
	
	/*
	 * MyBean s=new MyBean();
	 * 
	 * 
	 * public MyBean getS() { return s; }
	 * 
	 * public void setS(MyBean s) { this.s = s; }
	 */
	
	AddStudent s =new AddStudent();


	public AddStudent getS() {
		return s;
	}


	public void setS(AddStudent s) {
		this.s = s;
	}


	public String execute() throws SQLException{
		
		Connection con = ConnectionProvider.getConnection();
		
		String query="update student1 set name=?,age=?,email=?,city=? where id=?";
		
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(5,s.getId());
		ps.setString(1,s.getName());
		ps.setInt(2,s.getAge());
		ps.setString(3, s.getEmail());
		
		ps.setString(4, s.getCity());
		ps.executeUpdate();
		
		return "success";
	}

}
