package com.flight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.flight.model.Customer;
import com.flight.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping
	public ModelAndView initializeCustomer(){
		ModelAndView modelAndView = new ModelAndView();
		Customer customer = new Customer();
		modelAndView.addObject("customer",customer);
		modelAndView.setViewName("Customer");
		return modelAndView;
	}
	
	@PostMapping
	public ModelAndView addNewCustomer(@ModelAttribute Customer customer){
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(customer);
		
		Customer defcustomer = new Customer();
		modelAndView.addObject("customer",defcustomer);
		
		customerService.addNewCustomer(customer);
		
		modelAndView.setViewName("Customer");
		
		return modelAndView;
	}
	
	//http://localhost:8080/FlightCompanyMVC/customer/getAllCusts
	@RequestMapping("/getAllCusts")
	public ModelAndView getAllCustomers(){
		ModelAndView modelAndView = new ModelAndView();
		List<Customer> custlist = customerService.getAllCustomers();
		Customer defCustomer= new Customer();
		modelAndView.addObject("customer",defCustomer);
		modelAndView.addObject("custlist",custlist);
		modelAndView.setViewName("Customer");
		
		return modelAndView;
	}

}
