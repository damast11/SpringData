package com.kulishd.springData.service;

import java.util.List;

import com.kulishd.springData.entity.Ticket;

public interface TicketService {

    List<Ticket> findAllTickets();

    Ticket findTicketByCode(String code);

    List<Ticket> findAvailableTickets(String event);
}
