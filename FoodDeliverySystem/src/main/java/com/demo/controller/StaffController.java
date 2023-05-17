package com.demo.controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.Order;
import com.demo.model.Staff;
import com.demo.repository.OrderRepository;
import com.demo.repository.StaffRepositoy;

@Controller
@RequestMapping("/staff")
public class StaffController {

	

	@Autowired
	private StaffRepositoy staffRepository;

	@Autowired
	private OrderRepository orderRepository;;

	// method for adding common data to response

	@ModelAttribute
	public void addCommonData(Model model, Principal principal) {
		String userName = principal.getName();
		System.out.println("staffName " + userName);
		// get the user using username(email)

		Staff staffName = staffRepository.getStaffByStaffName(userName);
		System.out.println("USER" + staffName);

		model.addAttribute("user", staffName);
	}

	@RequestMapping("/index")
	public String dashboard(Model model, Principal principal) {
		model.addAttribute("title", "User Dashboard");
		return "normal/staff_dashboard";
	}

	@GetMapping("/add-order")
		public String openAddContactForm(Model model) {
			model.addAttribute("title", "add staff");
			model.addAttribute("contact",new Order());
			return "normal/add_order_form";
		}
	
	//processing add contact form
		@PostMapping("/process-order")
		public String processcontact(@ModelAttribute Order order,
				
				
				Principal principal,HttpSession session) {
			
			try {
			String name=principal.getName();
			
			Staff staff=this.staffRepository.getStaffByStaffName(name);
	
			order.setStaff(staff);
			
			staff.getO().add(order);
			this.staffRepository.save(staff);
			session.setAttribute("message", new com.demo.helper.Message("your Order is added !!Add more..","success "));
			
}catch(Exception e) {
	
	System.out.println("Error"+e.getMessage());
	e.printStackTrace();
	//message error
	
	session.setAttribute("message",new com.demo.helper.Message("something went to wrong"));
}
			return "normal/add_order_form";
	
		}
		
		
		//show contacts
		
		@GetMapping("/show-orders")
		public String showContacts(Model m, Principal principal) {
			m.addAttribute("title","Show user Contacts");
			
			String staffName=principal.getName();
		Staff staff = this.staffRepository.getStaffByStaffName(staffName);
	List<Order> orders=	this.orderRepository.findOrdersByStaff(staff.getId());
	m.addAttribute("orders",orders);
			
		
			
			return "normal/show_orders";
		}
		
		
		
		
		
}
