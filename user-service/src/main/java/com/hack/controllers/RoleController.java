package com.hack.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.MediaType;

import com.hack.beans.Role;
import com.hack.service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@RequestMapping(value="/byName/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Role getRole(@RequestBody String name){
		return roleService.getRole(name);
	}
	
	@RequestMapping(value="/byId/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Role getRole(@RequestBody int id){
		return roleService.getById(id);
	}
	
	@RequestMapping(value="{id}", method = RequestMethod.DELETE)
	public void delete(@RequestBody int id){
		Role role = roleService.getById(id);
		roleService.removeRole(role);
	}
	
	@RequestMapping(method= RequestMethod.POST)
	public Role addRole(@RequestBody Role role){
		return roleService.create(role);
	}
	
	

}
