package com.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.helper.Message;
import com.demo.model.Staff;
import com.demo.repository.StaffRepositoy;

@Controller
public class HomeController {

	
	
	@Autowired
	private StaffRepositoy staffRepositoy;
	
	@Autowired
	public BCryptPasswordEncoder passwordEncoder;
	
	@GetMapping("/home")
	public String home() {
		
		return "home";
	}
	
	
	
	@RequestMapping("/signup/")
	public String signup(Model m) {
		m.addAttribute("title", "Register for food delivery system");
		m.addAttribute("staff",new Staff());
		return"signup";
	}
	
	
	@RequestMapping(value="/do_register",method=RequestMethod.POST)
	public String registerUser( @ModelAttribute("staff")Staff staff, BindingResult result1,
	@RequestParam(value="agreement",defaultValue="false")boolean agreement,Model model,HttpSession session) {
		
		
		
		try {
			
			if(!agreement) {
				System.out.println("you have not agreed the term and conditions");
			throw new Exception("you have not agreed the term and conditions");
			}
			
			
			if(result1.hasErrors()) {
				System.out.println("Errors"+result1.toString());
				model.addAttribute("staff",staff);
				return "signup";
			}
			
			staff.setRole("ROLE_STAFF");
			
			
			
			staff.setPassword(passwordEncoder.encode(staff.getPassword()));
			
			System.out.println("Agreement"+agreement);
			System.out.println("USER"+staff);
		Staff result = this.staffRepositoy.save(staff);
			model.addAttribute("user",new Staff());
			session.setAttribute("message",new Message("Successfully Registred !!","alert-success"));
			return"signup";
		}
		catch(Exception e){
			e.printStackTrace();
			model.addAttribute("staff",staff);
			session.setAttribute("message",new Message("Something went to wrong!!"+e.getMessage(),"alert-danger"));
			return"signup";
		}
		

		
	}
	
	
	 // handler for signin
	  @GetMapping("/signin")
	   public String customLogin() {
						
			return"login";
			
					}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@GetMapping("/add")
	public String homeData() {
		
		return "add";
		
	}
	

	// get all the stop
	
	@GetMapping("/get")
	public String findData(Model model) {
		
		List<Staff> findAll = staffRepositoy.findAll();
		
		model.addAttribute("staff", findAll);
		
		return "list";
		
		
	}
	
	@GetMapping("/delete/{id}")
	public String deleteData(@PathVariable int id) {
		
		staffRepositoy.deleteById(id);
		
		return "redirect:/get";
	}
	
	
	@GetMapping("/update/{id}")
	public String showStaffData(@PathVariable int id,Model model) {
		
		Optional<Staff> findById = staffRepositoy.findById(id);
		Staff staff = findById.get();
		
		model.addAttribute("staff",staff);
		return "update";
	}
}
