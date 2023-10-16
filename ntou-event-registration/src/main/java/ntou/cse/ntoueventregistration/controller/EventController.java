package ntou.cse.ntoueventregistration.controller;

import ntou.cse.ntoueventregistration.entity.Event;
import ntou.cse.ntoueventregistration.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {
    private final EventService service;

    @Autowired
    public EventController(EventService service) {
        this.service = service;
    }

    @GetMapping
    public List<Event> getAllEvents() {
        return service.getAllEvents();
    }
}
