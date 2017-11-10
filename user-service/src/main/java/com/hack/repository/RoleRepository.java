package com.hack.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hack.beans.Role;

public interface RoleRepository extends CrudRepository<Role, Integer>{
	
	public Role findByName(String name);
	public Role save(Role role);
	public void delete(Role role);
	public List<Role> findAll();
	public Role findById(int id);
}
