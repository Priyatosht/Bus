package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lti.entity.Customer;
import com.lti.entity.Ticket;
import com.lti.repository.TicketRepository;
@Component
public class TicketServiceImpl implements TicketService {

	@Autowired
	TicketRepository ticketRepository;
	
	@Override
	public Ticket addATicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketRepository.addATicket(ticket);
	}

	@Override
	public List<Ticket> viewAllTickets() {
		// TODO Auto-generated method stub
		return ticketRepository.viewAllTickets();
	}
	@Override
	public List <Ticket> viewTicketByCustomer(Customer customer){
		return ticketRepository.viewTicketByCustomer(customer);
	}
	@Override
	public void deleteTicket(long ticketId) {
		ticketRepository.deleteTicket(ticketId);
	}

}
