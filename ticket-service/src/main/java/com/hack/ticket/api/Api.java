package com.hack.ticket.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hack.ticket.dao.TicketDao;
import com.hack.ticket.model.Ticket;

@RestController
public class Api {
	
	@Autowired
	TicketDao ticketDao;
	
	@RequestMapping(value="/ticket/test")
	public String testThings(){
		return "Eureka!";
	}
	
	@RequestMapping(value="/all")
	public Iterable<Ticket> getAllTickets(){
		return ticketDao.findAll();
	}

}
