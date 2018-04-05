package com.hack.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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

	public Ticket(int id, Date dateCreated, int creator, int resolver, Status status, List<Comment> comments) {
		super();
		this.id = id;
		this.dateCreated = dateCreated;
		this.creator = creator;
		this.resolver = resolver;
		this.status = status;
		this.comments = comments;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="TICKET_ID")
	private int id;
	
	@Column(name="DATE_CREATED")
	private Date dateCreated;
	
	@Column(name="CREATOR_ID")
	private Integer creator;
	
	@Column(name="RESOLVER_ID")
	private Integer resolver;
	
	@Autowired
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="STATUS_ID")
	private Status status;
	
	@Autowired
	@OneToMany(fetch=FetchType.LAZY)
	private List<Comment> comments;

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

	public Integer getCreator() {
		return creator;
	}

	public void setCreator(Integer creator) {
		this.creator = creator;
	}

	public Integer getResolver() {
		return resolver;
	}

	public void setResolver(Integer resolver) {
		this.resolver = resolver;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<Comment> getComments() {
		return comments;
	}


	@Override
	public String toString() {
		return "Ticket [id=" + id + ", dateCreated=" + dateCreated + ", creator=" + creator + ", resolver=" + resolver
				+ ", status=" + status + ", comments=" + comments + "]";
	}

}
