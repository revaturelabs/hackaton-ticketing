package com.hack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hack.beans.Role;
import com.hack.repository.RoleRepository;

@Service
public class RoleService {

	@Autowired
	private RoleRepository roleRepo;
	
	public Role getRole(String name){
		return roleRepo.findByName(name);
	}
	
	public Role getById(int id){
		return roleRepo.findById(id);
	}
	
	public Role create (Role role){
		return roleRepo.save(role);
	}
	
	public List<Role> getAll(){
		return roleRepo.findAll();
	}
	
	public void removeRole(Role role){
		roleRepo.delete(role);
	}
	
}
