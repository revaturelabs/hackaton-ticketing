package com.hack.user.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {
	
	@RequestMapping(value="/test")
	public String testThings(){
		return "Eureka!";
	}

}
