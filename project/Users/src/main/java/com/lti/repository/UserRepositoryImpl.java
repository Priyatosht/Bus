package com.lti.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Admin;
import com.lti.entity.Customer;


@Component
public class UserRepositoryImpl implements UserRepository {
	
	@PersistenceContext
	EntityManager em;
	

	
	@Transactional
	public Admin addAnAdmin(Admin admin) {
		Admin admin1 = em.merge(admin);
		return admin1;
	}


	public Admin authenticateWithEmailAndPasswordAdmin(String email, String password) {
		String jpql = "Select a from Admin a where a.emailId=:emailId and a.password=:pwd";
		Admin admin;
		try {
			Query query = em.createQuery(jpql);
			query.setParameter("emailId", email);
			query.setParameter("pwd", password);
			admin = (Admin) query.getSingleResult();
		} catch (Exception NoResultException) {
			return null;
		}
		return admin;
	}


	@Transactional
	public Customer addACustomer(Customer customer) {
		Customer customer2 = em.merge(customer);
		return customer2;
	}

	@Transactional
	public Customer updateACustomer(Customer customer) {
		Customer customer2 = em.merge(customer);
		return customer2;
	}

	
	public Customer findCustomerById(long customerId) {
		return em.find(Customer.class, customerId);
	}

	
	public List<Customer> viewAllCustomers() {
		String jpql = "from Customer c";
		Query query = em.createQuery(jpql);
		List<Customer> customers = query.getResultList();
		return customers;
	}

	
	public Customer authenticateWithEmailAndPasswordCustomer(String email, String password) {
		String jpql = "Select c from Customer c where c.emailId=:emailId and c.password=:pwd";
		Customer customer;
		try {
			Query query = em.createQuery(jpql);
			query.setParameter("emailId", email);
			query.setParameter("pwd", password);
			 customer = (Customer) query.getSingleResult();
		} catch (Exception NoResultException) {
			return null;
		}
		return customer;
	}
}	