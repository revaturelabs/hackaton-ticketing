package com.hack.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class User {

	@Id
	@Column(name = "USER_ID")
	@SequenceGenerator(name="USER_ID_SEQ", sequenceName = "USER_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USER_ID_SEQ")
	private int id;
	
	@Column(nullable=false)
	private String firstname;
	
	@Column(nullable=false)
	private String lastname;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ROLE_ID")
	private Role role;
	
	@Column(nullable=false)
	private String email;
	
	@Column(nullable=false)
	private String password;
	
	
	
}
