package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.model.Order;
import com.demo.repository.OrderRepository;

@Controller
public class OrderController {

	@Autowired
	private OrderRepository orderRepository;
	
	
	
	@GetMapping("/order")
	public String takeOrder() {
		
		return "order";
	}
	
	@PostMapping("/processOrder")
	public String saveOrder(@ModelAttribute Order order) {
		
		orderRepository.save(order);
		
		return "redirect:/order";
	}
	
	@GetMapping("/getOrder")
	public String showAllOrder(Model model) {
		List<Order> findAll = orderRepository.findAll();
		model.addAttribute("orders", findAll);
		return "showOrder";
	}

}
