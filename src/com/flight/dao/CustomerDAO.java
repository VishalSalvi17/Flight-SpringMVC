package com.flight.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.flight.model.Customer;

@Repository
public class CustomerDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void addNewCustomer(Customer customer){
		try{
			jdbcTemplate.update("insert into customer values(?,?,?,?,?,?)",new Object[]{
					customer.getCustomerId(),
					customer.getCustomerName(),
					customer.getCustomerUsername(),
					customer.getCustomerPassword(),
					customer.getCustomerEmail(),
					customer.getCustomerPhone()
			});
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
	public List<Customer> getAllCustomers(){
		return jdbcTemplate.query("select * from customer", new BeanPropertyRowMapper(Customer.class));
	}

}
