package com.lti.service;

import java.util.List;

import com.lti.entity.Admin;
import com.lti.entity.Customer;

public interface UserService {
	
	public Admin addAnAdmin(Admin admin);

	public Admin authenticateWithEmailAndPasswordAdmin(String email, String password);


	public Customer addACustomer(Customer customer);

	public Customer updateACustomer(Customer customer);

	public Customer findCustomerById(long customerId);

	public List<Customer> viewAllCustomers();

	public Customer authenticateWithEmailAndPasswordCustomer(String email, String password);

}
