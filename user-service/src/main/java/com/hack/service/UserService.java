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
	
	public User createOrUpdateUser (User u){
		return userRepo.save(u);
	}
	
	public User getUserById(int id){
		return userRepo.findById(id);
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
