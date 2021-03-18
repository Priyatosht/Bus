  package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lti.entity.Admin;
import com.lti.entity.Customer;

import com.lti.repository.UserRepository;

@Component
public class UserServiceImpl implements UserService {
	

	@Autowired
	UserRepository userRepository;


	@Override
	public Admin addAnAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return userRepository.addAnAdmin(admin);
	}

	@Override
	public Admin authenticateWithEmailAndPasswordAdmin(String email, String password) {
		// TODO Auto-generated method stub
		return userRepository.authenticateWithEmailAndPasswordAdmin(email, password);
	}

	@Override
	public Customer addACustomer(Customer customer) {
		// TODO Auto-generated method stub
		return userRepository.addACustomer(customer);
	}

	@Override
	public Customer updateACustomer(Customer customer) {
		// TODO Auto-generated method stub
		return userRepository.updateACustomer(customer);
	}

	@Override
	public Customer findCustomerById(long customerId) {
		// TODO Auto-generated method stub
		return userRepository.findCustomerById(customerId);
	}

	@Override
	public List<Customer> viewAllCustomers() {
		// TODO Auto-generated method stub
		return userRepository.viewAllCustomers();
	}

	@Override
	public Customer authenticateWithEmailAndPasswordCustomer(String email, String password) {
		// TODO Auto-generated method stub
		return userRepository.authenticateWithEmailAndPasswordCustomer(email, password);
	}
}	