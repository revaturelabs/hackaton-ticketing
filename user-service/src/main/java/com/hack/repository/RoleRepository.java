package com.hack.repository;


import org.springframework.data.repository.CrudRepository;

import com.hack.beans.Role;

public interface RoleRepository extends CrudRepository<Role, Integer>{
	
	public Role getRoleByName(String name);
	public Role save(Role role);

}
