package com.hack.ticket.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hack.beans.Status;

@Repository
public interface StatusDao extends CrudRepository<Status, Long>{

}
