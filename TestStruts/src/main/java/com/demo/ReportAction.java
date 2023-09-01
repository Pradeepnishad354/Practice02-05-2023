package com.demo;

import java.sql.SQLException;
import java.util.List;

import com.demo.dao.StudentDao;
import com.opensymphony.xwork2.ActionSupport;

public class ReportAction extends ActionSupport {

	private List<AddStudent> student;
	
	public List<AddStudent> getStudent() {
		return student;
	}

	public void setStudent(List<AddStudent> student) {
		this.student = student;
	}

	public String execute() throws SQLException {
		StudentDao d=new StudentDao();
		
		
		student=d.getAllStudent();
		return "success";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
