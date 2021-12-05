package com.kulishd.springData.controller;

import java.util.List;

import com.kulishd.springData.entity.Ticket;
import com.kulishd.springData.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tickets")
public class TicketController {

    private final TicketService ticketService;

    @GetMapping
    public List<Ticket> getAllTickets() {
        return ticketService.findAllTickets();
    }

    @GetMapping("/{code}")
    public Ticket findTicketByCode(String code) {
        return ticketService.findTicketByCode(code);
    }
}
