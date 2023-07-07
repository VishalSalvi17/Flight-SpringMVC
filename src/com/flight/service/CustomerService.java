package com.flight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.dao.CustomerDAO;
import com.flight.model.Customer;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerDAO customerDAO;
	
	public void addNewCustomer(Customer customer){
		customerDAO.addNewCustomer(customer);
	}
	
	public List<Customer> getAllCustomers(){
		return customerDAO.getAllCustomers();
	}
	
	

}
