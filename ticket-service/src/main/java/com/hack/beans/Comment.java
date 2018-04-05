package com.hack.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="comment")
@Scope(value="prototype")
@Entity
@Table(name="COMMENT")
public class Comment implements Serializable {
	
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comment(int id, String text, int user, int ticket) {
		super();
		this.id = id;
		this.text = text;
		this.user = user;
		this.ticket = ticket;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="COMMENT_ID")
	private int id;
	
	@Column(name="TEXT")
	private String text;
	
	@Column(name="USER_ID")
	private int user;
	
	@JoinColumn(name="TICKET_ID")
	@ManyToOne(fetch=FetchType.EAGER)
	private Ticket ticket;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser() {
		return user;
	}

	public void setUser(int user) {
		this.user = user;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", text=" + text + ", user=" + user + "]";
	}

}
