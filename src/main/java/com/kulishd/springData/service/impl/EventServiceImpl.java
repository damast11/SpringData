package com.kulishd.springData.service.impl;

import java.util.List;

import com.kulishd.springData.entity.Event;
import com.kulishd.springData.exception.BusinessException;
import com.kulishd.springData.repository.EventRepository;
import com.kulishd.springData.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {

    private static final String EVENT_NOT_FOUND_BY_NAME = "Event not found by name";

    private final EventRepository eventRepository;

    @Override
    public List<Event> findAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Event findEventByName(String name) {
        return eventRepository.findByName(name).orElseThrow(() -> new BusinessException("name", name,
            EVENT_NOT_FOUND_BY_NAME, BusinessException.Status.NOT_FOUND));
    }
}
