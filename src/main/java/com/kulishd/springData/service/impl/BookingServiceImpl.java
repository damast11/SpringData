package com.kulishd.springData.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.kulishd.springData.entity.User;
import com.kulishd.springData.exception.BusinessException;
import com.kulishd.springData.service.BookingService;
import com.kulishd.springData.service.TicketService;
import com.kulishd.springData.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {

    private static final String TICKETS_ARE_OVER = "Tickets are over";
    private final TicketService ticketService;
    private final UserService userService;

    @Override
    public List<String> bookingTickets(String eventName, String userName, int count) {
        var user = userService.findUserByName(userName);
        if (user == null) {
            user = new User().setName(userName);
        }
        List<String> ticketCodes = new ArrayList<>();
        var availableTickets = ticketService.findAvailableTickets(eventName);
        if (availableTickets.isEmpty()) {
            throw new BusinessException("event", eventName, TICKETS_ARE_OVER, BusinessException.Status.NOT_FOUND);
        }
        availableTickets.stream()
            .limit(count)
            .forEach(ticket -> {
                ticket.setAvailable(false);
                ticketCodes.add(ticket.getCode());
            });
        user.setTickets(availableTickets);
        userService.saveUser(user);
        return ticketCodes;
    }
}
