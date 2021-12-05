package com.kulishd.springData.controller;

import java.util.List;

import com.kulishd.springData.controller.api.BookingControllerApi;
import com.kulishd.springData.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/booking")
public class BookingController implements BookingControllerApi {

    private final BookingService bookingService;

    @PostMapping("/{event}/{userName}/{count}")
    public List<String> bookTickets(@PathVariable String event, @PathVariable String userName, @PathVariable int count) {

        return bookingService.bookingTickets(event, userName, count);
    }
}
