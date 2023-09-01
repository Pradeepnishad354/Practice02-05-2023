package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.test.ConnectionProvider;
import com.test.Login;

public class LoginDao {

	public String login(Login login) {

		Connection con = ConnectionProvider.getConnection();
		try {
			PreparedStatement p = con.prepareStatement("select * from user where name=? and password=?");
			p.setString(1, login.getName());
			p.setString(2, login.getPassword());
			ResultSet rs = p.executeQuery();
           
			
			if (rs.next()) {
				return "valid";
			} else {
				return "invalid";

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "invalid";
	}

}
