package com.hack.ticket.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hack.beans.Ticket;

@Repository
public interface TicketDao extends CrudRepository<Ticket, Long>{

}
