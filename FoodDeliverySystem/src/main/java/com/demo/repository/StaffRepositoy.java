package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.model.Order;
import com.demo.model.Staff;

@Repository
public interface StaffRepositoy extends JpaRepository<Staff,Integer> {

	@Query("Select s from Staff s where s.email=:email")
	public Staff getStaffByStaffName(@Param("email") String email);

	
	
}
