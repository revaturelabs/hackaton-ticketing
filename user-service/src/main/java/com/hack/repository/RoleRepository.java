package com.hack.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hack.beans.Role;

public interface RoleRepository extends CrudRepository<Role, Integer>{
	
	public Role findRoleByName(String name);
	public Role save(Role role);
	public List<Role> findAll();

}
