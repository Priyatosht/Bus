package com.lti.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dto.Login;
import com.lti.entity.Admin;
import com.lti.entity.Customer;

import com.lti.service.UserService;

@RestController
@RequestMapping("/users")
public class UserResource {

	@Autowired
	UserService userService;


	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
	public Customer addACustomer(@RequestBody Customer customer) {
		Customer cust = userService.addACustomer(customer);
		return cust;
	}

	@GetMapping(value = "/findCustomerById")
	public Customer findCustomerById(@RequestParam("customerId") long customerId) {
		return userService.findCustomerById(customerId);
	}

	@RequestMapping("/viewAllCustomers")
	public List<Customer> viewAllCustomers() {
		return userService.viewAllCustomers();
	}
	
	@RequestMapping(value = "/loginCustomer", method = RequestMethod.POST)
	public Customer authenticateWithEmailAndPasswordCustomer(@RequestBody Login login) {
		Customer customer=userService.authenticateWithEmailAndPasswordCustomer(login.getEmailId(),login.getPassword());
		
		return customer;
	}
	
	 @RequestMapping(value = "/loginAdmin", method = RequestMethod.POST)
	    public Admin authenticateWithEmailAndPasswordAdmin(@RequestBody Login login) {
	        Admin admin =userService.authenticateWithEmailAndPasswordAdmin(login.getEmailId(), login.getPassword());
	        return admin;
	    }
	   
	    @RequestMapping(value = "/addAdmin", method =RequestMethod.POST  )
	    public  Admin addAnAdmin(@RequestBody Admin admin) {
	        Admin ad = userService.addAnAdmin(admin);
	        return ad;
	    }
}	
	
