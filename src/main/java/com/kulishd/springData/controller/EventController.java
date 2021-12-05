package com.kulishd.springData.controller;

import java.util.List;

import com.kulishd.springData.controller.api.EventControllerApi;
import com.kulishd.springData.entity.Event;
import com.kulishd.springData.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/events")
public class EventController implements EventControllerApi {

    private final EventService eventService;

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.findAllEvents();
    }

    @GetMapping("/{name}")
    public Event findEventByName(String name) {
        return eventService.findEventByName(name);
    }
}
