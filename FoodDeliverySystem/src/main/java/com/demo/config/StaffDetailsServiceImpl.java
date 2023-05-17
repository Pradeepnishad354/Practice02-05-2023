package com.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.demo.model.Staff;
import com.demo.repository.StaffRepositoy;


public class StaffDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private StaffRepositoy  staffRepositoy;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Staff staff = staffRepositoy.getStaffByStaffName(username);
		
		if(staff==null) {
			
			throw new UsernameNotFoundException("Could not found staff!!");
		}
		CustomStaffDeatails customStaffDetails=new CustomStaffDeatails(staff);
			
			return customStaffDetails;
		
		
		
		
	}

}
