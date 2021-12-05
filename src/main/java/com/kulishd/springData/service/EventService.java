package com.kulishd.springData.service;

import java.util.List;

import com.kulishd.springData.entity.Event;

public interface EventService {

    List<Event> findAllEvents();

    Event findEventByName(String name);
}
