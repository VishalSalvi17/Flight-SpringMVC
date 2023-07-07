package com.flight.model;


public class Customer {

//	customer_id – int – primary key
	private int customerId;
	
//	customer_name -varchar(20)
	private String customerName;
	
//	customer_username -varchar(20) - unique
	private String customerUsername;
	
//	customer_password- varchar(20)
	private String customerPassword;
	
//	customer_email- varchar(25)
	private String customerEmail;
	
//	custom_phone -varchar(15)
	private String customerPhone;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String customerName, String customerUsername, String customerPassword,
			String customerEmail, String customerPhone) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerUsername = customerUsername;
		this.customerPassword = customerPassword;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerUsername() {
		return customerUsername;
	}

	public void setCustomerUsername(String customerUsername) {
		this.customerUsername = customerUsername;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerUsername="
				+ customerUsername + ", customerPassword=" + customerPassword + ", customerEmail=" + customerEmail
				+ ", customerPhone=" + customerPhone + "]";
	}

}
