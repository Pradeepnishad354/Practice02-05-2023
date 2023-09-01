package com.test;

import java.sql.Connection;
import java.sql.DriverManager;

public final class ConnectionProvider {

	static Connection connection = null;

	private ConnectionProvider() {

	}

	public static Connection getConnection() {
		if (connection == null) {

			try {

				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://@localhost:3306/user","pradeep", "data@123");
				return connection;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			return connection;
		}
		
		return connection;
		
	}
}
