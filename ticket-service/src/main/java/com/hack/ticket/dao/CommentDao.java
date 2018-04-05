package com.hack.ticket.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hack.beans.Comment;

@Repository
public interface CommentDao extends CrudRepository<Comment,Long> {

}
