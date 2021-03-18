package com.lti.service;

import java.util.List;

import com.lti.entity.Customer;
import com.lti.entity.Ticket;

public interface TicketService {
	public Ticket addATicket(Ticket ticket);
	public List <Ticket> viewAllTickets();
	public List <Ticket> viewTicketByCustomer(Customer customer);
	public void deleteTicket(long ticketId); 
}
