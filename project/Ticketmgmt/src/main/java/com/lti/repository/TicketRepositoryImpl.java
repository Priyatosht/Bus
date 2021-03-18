package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Customer;
import com.lti.entity.Ticket;
@Component
public class TicketRepositoryImpl implements TicketRepository {
    
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	@Override
	public Ticket addATicket(Ticket ticket) {
		// TODO Auto-generated method stub
		Ticket ticket1=em.merge(ticket);
		return ticket1;
	}

	@Override
	public List<Ticket> viewAllTickets() {
		// TODO Auto-generated method stub
		String jpql="from Ticket t";
		Query query = em.createQuery(jpql);
		List<Ticket> tickets = query.getResultList();
		return tickets;
	}
	@Override
	public List <Ticket> viewTicketByCustomer(Customer customer){
		String jpql="from Ticket t where t.customer.customerId=:custId";
		Query query = em.createQuery(jpql);
		query.setParameter("custId", customer.getCustomerId());
		List<Ticket> tickets = query.getResultList();
		return tickets;
	}
	@Override
	@Transactional
	public void deleteTicket(long ticketId) {
		String jpql="delete from Ticket t where t.ticketId=:tid";
		Query query = em.createQuery(jpql);
		query.setParameter("tid", ticketId);
		int k=query.executeUpdate();
//		Ticket t=em.getReference(Ticket.class,ticketId);
//		em.remove(t);
		System.out.println("delete");
	} 

}
