package com.kulishd.springData.service.impl;

import java.util.List;

import com.kulishd.springData.entity.Ticket;
import com.kulishd.springData.exception.BusinessException;
import com.kulishd.springData.repository.TicketRepository;
import com.kulishd.springData.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService {

    private static final String TICKET_NOT_FOUND_BY_CODE = "Ticket not found by code";

    private final TicketRepository ticketRepository;

    @Override
    public List<Ticket> findAllTickets() {
        return ticketRepository.findAll();
    }

    @Override
    public Ticket findTicketByCode(String code) {
        return ticketRepository.findByCode(code).orElseThrow(() -> new BusinessException("code", code,
            TICKET_NOT_FOUND_BY_CODE, BusinessException.Status.NOT_FOUND));
    }

    @Override
    public List<Ticket> findAvailableTickets(String event) {
        return ticketRepository.findByEventNameAndIsAvailableTrue(event);
    }
}
