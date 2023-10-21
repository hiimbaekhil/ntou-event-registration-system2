package ntou.cse.ntoueventregistration.service;

import ntou.cse.ntoueventregistration.entity.Event;
import ntou.cse.ntoueventregistration.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    private final EventRepository repository;

    @Autowired
    public EventService(EventRepository repository) {
        this.repository = repository;
    }

    public List<Event> getAllEvents() {
        return repository.findAll();
    }

    public void createEvent(Event event) {
        repository.insert(event);
    }
}
