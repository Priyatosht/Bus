package com.lti.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Customer;
import com.lti.entity.Ticket;
import com.lti.entity.TicketDto;
import com.lti.service.TicketService;

@RestController
@RequestMapping("/ticket")
public class TicketResource {
	
	@Autowired
	TicketService ticketService;
	
	@RequestMapping(value = "/addTicket", method = RequestMethod.POST)
	public Ticket addATicket(@RequestBody Ticket ticket) {
		System.out.println(ticket);
	    Ticket tick = ticketService.addATicket(ticket);
		return tick ;
	}
    
	@RequestMapping(value="/viewAllTicket")
	public List<Ticket> viewAllTickets(){
		return ticketService.viewAllTickets();
	}
	
	@RequestMapping(value="/viewTicketByCust",method = RequestMethod.POST)
	public List<Ticket> viewTicketByCustomer(@RequestBody Customer customer){
		return ticketService.viewTicketByCustomer(customer);
	}
	@DeleteMapping(path="/deleteTicket/{id}")
	public void deleteTicket(@PathVariable("id") long ticketId) {
		 ticketService.deleteTicket(ticketId);
	}
}
