package com.hack.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROLES")
public class Role {
	
	@Id
	@Column(name="ROLE_ID")
	int id;
	
	@Column(nullable=false)
	String name;

}
