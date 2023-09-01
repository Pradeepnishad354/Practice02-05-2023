package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.test.ConnectionProvider;
import com.test.Register;

public class RegisterDao {

	public String save(Register register) {

		Connection con = ConnectionProvider.getConnection();
		try {
			PreparedStatement p = con.prepareStatement("insert into user values(?,?,?)");
			p.setString(1, register.getName());
			p.setString(2,register.getPassword());
			p.setString(3,register.getEmail());
			int r = p.executeUpdate();
			
			if (r > 0) {

				return "success";

			} else {
				return "fail";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "fail";
	}

}
