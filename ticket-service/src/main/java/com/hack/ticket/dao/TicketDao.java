package com.hack.ticket.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hack.ticket.model.Ticket;

@Repository
public interface TicketDao extends CrudRepository<Ticket, Long>{

}
