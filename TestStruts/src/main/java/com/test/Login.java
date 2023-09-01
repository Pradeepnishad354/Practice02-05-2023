package com.test;

import com.test.dao.LoginDao;

public class Login {
	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute() {
		
		
		LoginDao d = new LoginDao();
		
		String login = d.login(this);
		
		return login;
		
	
	}

}
