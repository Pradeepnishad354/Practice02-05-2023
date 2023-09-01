package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.test.ConnectionProvider;

public class Update  extends ActionSupport implements ServletRequestAware,ApplicationAware{

	
	HttpServletRequest  request;
	
	Map m;

	@Override
	public void setApplication(Map m) {
		
		this.m=m;
		
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		
		this.request=request;
		
	}
	
	
	public String execute() throws SQLException{
		
		Connection con = ConnectionProvider.getConnection();
		
		PreparedStatement ps = con.prepareStatement("select *from student1 where id=?");
		
			String p = request.getParameter("id");
			
			int parse = Integer.parseInt(p);
		
		ps.setInt(1,parse);	
		
		ResultSet rs = ps.executeQuery();
		
		List l=new ArrayList<>();
		
		
		while(rs.next()) {
			
			m.put("a",rs.getInt("id"));
			m.put("b",rs.getString("name"));
			m.put("c",rs.getInt("age"));
			m.put("d",rs.getString("email"));
			m.put("e", rs.getString("city"));
		}
		return "success";
	}
	
	

	

}
