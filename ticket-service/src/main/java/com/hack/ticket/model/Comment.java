package com.hack.ticket.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

	public Comment(int id, String text, int user) {
		super();
		this.id = id;
		this.text = text;
		this.user = user;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="COMMENT_ID")
	private int id;
	
	@Column(name="TEXT")
	private String text;
	
	@Column(name="USER_ID")
	private int user;

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
