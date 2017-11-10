package com.hack.ticket.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {
	
	@RequestMapping(value="/ticket/test")
	public String testThings(){
		return "Eureka!";
	}

}
