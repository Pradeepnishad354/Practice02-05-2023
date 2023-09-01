package com.demo;

import java.sql.SQLException;

import com.demo.dao.StudentDao;

public class DeleteStudent {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public String delete() throws SQLException {
		
		StudentDao d=new StudentDao();
	d.deleteStudent(id);
	
	System.out.println("Testing ===============================>>>>>>>>>>>>>");
		
		return "success";
		
	}

}
