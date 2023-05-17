package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.model.Admin;
import com.demo.repository.AdminRepository;


@Controller
public class AdminController {

@Autowired
private AdminRepository adminRepository;
	
	@GetMapping("/adminlogin")
	public String admin() {
		
		
		return "adminLogin";
	}
	
	@PostMapping("/fetchData")	
 public  String fetchUser(@ModelAttribute Admin adminData ,Model model) {
		
		Admin a = adminRepository.findByUsername(adminData.getUsername());
		
		if(a !=null && adminData.getPassword().equals(a.getPassword())) {
			
			return "showAdmin";
		}else {
			
			return "null";
		}
	}
}