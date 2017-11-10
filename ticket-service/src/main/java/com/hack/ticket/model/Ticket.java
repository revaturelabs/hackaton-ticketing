package com.hack.ticket.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="ticket")
@Scope(value="prototype")
@Entity
@Table(name="TICKET")
public class Ticket implements Serializable {
	
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(int id, Date dateCreated, int creator, int resolver, Status status, Comment comment) {
		super();
		this.id = id;
		this.dateCreated = dateCreated;
		this.creator = creator;
		this.resolver = resolver;
		this.status = status;
		this.comment = comment;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="TICKET_ID")
	private int id;
	
	@Column(name="DATE_CREATED")
	private Date dateCreated;
	
	@Column(name="CREATOR")
	private int creator;
	
	@Column(name="RESOLVER")
	private int resolver;
	
	@Autowired
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="STATUS_ID")
	private Status status;
	
	@Autowired
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="COMMENT_ID")
	private Comment comment;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public int getCreator() {
		return creator;
	}

	public void setCreator(int creator) {
		this.creator = creator;
	}

	public int getResolver() {
		return resolver;
	}

	public void setResolver(int resolver) {
		this.resolver = resolver;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", dateCreated=" + dateCreated + ", creator=" + creator + ", resolver=" + resolver
				+ ", status=" + status + ", comment=" + comment + "]";
	}

}
