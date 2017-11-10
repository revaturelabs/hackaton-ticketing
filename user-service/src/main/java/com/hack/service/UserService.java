package com.hack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hack.beans.Role;
import com.hack.beans.User;
import com.hack.repository.UserRepository;

@Service
public class UserService {

 
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private RoleService roleService;
	
	public User create (User u){
		User user = userRepo.findByEmail(u.getEmail());
		if(user.equals(null)){
			return userRepo.save(u);
		}
		else{
			return null;
		}
	}
	
	public User update(User u){
		return userRepo.save(u);
	}
	
	public User getUserById(int id){
		return userRepo.findById(id);
	}
	
	public List<User> findByFirstName(String fn){
		return userRepo.findByfirstname(fn);
	}
	
	public List<User> findByLastName(String ln){
		return userRepo.findBylastname(ln);
	}
	
	public List<User> findByRole(String role){
		
		Role r = roleService.getRole(role);
		return userRepo.findByRole(r);
	}
	/*
	 * public User findById(int id);
	public User findByEmail(String email);
	public List<User> findByfirstname(String firstname);
	public List<User> findBylastname(String lastname);
	public List<User> findByRole(Role role);
	public List<User> findAll();
	 */
	
	
}
