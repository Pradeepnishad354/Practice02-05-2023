package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.AddStudent;
import com.test.ConnectionProvider;

public class StudentDao {
static // add student 
	
	Connection connection = ConnectionProvider.getConnection();
	
	public String addStudent(AddStudent student) throws SQLException {

		Connection connection = ConnectionProvider.getConnection();
	
			PreparedStatement ps = connection.prepareStatement("insert into student1  values(?,?,?,?,?)");
			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.setInt(3, student.getAge());
			ps.setString(4, student.getEmail());
			ps.setString(5, student.getCity());

			int r = ps.executeUpdate();
		
			//connection.close();
			if (r > 0) {
				
				return "success";
			} else {
				
				return "fail";
			}
		

		

	}
	
	// fetch the record of student
	public static List<AddStudent> getAllStudent() throws SQLException  {
        List<AddStudent> student = new ArrayList<>();
        String sql = "SELECT * FROM student1";

      
      
        	//Connection connection = ConnectionProvider.getConnection();
        	  PreparedStatement ps=connection.prepareStatement(sql);
             ResultSet resultSet = ps.executeQuery() ;

            while (resultSet.next()) {
                AddStudent s = new AddStudent();
                s.setId(resultSet.getInt(1));
               s.setName(resultSet.getString(2));
               s.setAge(resultSet.getInt(3));
               s.setEmail(resultSet.getString(4));
               s.setCity(resultSet.getString(5));
                student.add(s);
            }
               
                
            
            //connection.close();
             
       
      

        
        return student;
    }

	
	
	// delete the student 
	
	public void  deleteStudent(int id) throws SQLException {
		
		String sql="delete from student1 where id="+id;
		//Connection c= ConnectionProvider.getConnection();
		
		   		
		PreparedStatement ps = connection.prepareStatement(sql);
		   
		    ps.executeUpdate(sql);
		    
		   
		  
	
            //connection.close();
            
		
	}
}
