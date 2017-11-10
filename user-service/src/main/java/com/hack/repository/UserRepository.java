package com.hack.repository;

import com.hack.beans.Role;
import com.hack.beans.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

	public User findById(int id);
	public User findByEmail(String email);
	public List<User> findByfirstname(String firstname);
	public List<User> findBylastname(String lastname);
	public List<User> findByRole(Role role);
	public List<User> findAll();
	
	
}
