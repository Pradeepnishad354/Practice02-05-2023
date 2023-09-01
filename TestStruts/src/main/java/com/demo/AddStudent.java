package com.demo;

import java.sql.SQLException;

import com.demo.dao.StudentDao;

public class AddStudent {
	
	private int id ;
	private String name;
	private int age;
	private String email;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public String add() throws SQLException {
		StudentDao d=new StudentDao();
		String addStudent = d.addStudent(this);
		
		return addStudent;
	}
	
}
