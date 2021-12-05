package com.kulishd.springData.service;

import java.util.List;

public interface BookingService {

    List<String> bookingTickets(String eventName, String userName, int count);
}
