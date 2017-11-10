package com.hack.controllers;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hack.beans.User;
import com.hack.service.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="{id}", produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.GET)
	public @ResponseBody User findById(@PathVariable("id") int id){
		
		User u =  userService.getUserById(id);
		return u;
	}

}
