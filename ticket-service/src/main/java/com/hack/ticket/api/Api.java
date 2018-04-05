package com.hack.ticket.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hack.beans.Ticket;
import com.hack.ticket.dao.TicketDao;

@RestController
public class Api {
	
	@Autowired
	TicketDao ticketDao;
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String testThings(){
		return "Eureka!";
	}
	
	@RequestMapping(value="/all")
	public Iterable<Ticket> getAllTickets(){
		return ticketDao.findAll();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public boolean createTicket(@RequestBody Ticket ticket){
		if (ticketDao.save(ticket) != null){
			return true;
		} else {
			return false;
		}
	}
	
	

}
