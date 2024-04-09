package com.tour.events.infraestructure;

import com.tour.events.domain.dto.EventDto;
import com.tour.events.domain.repository.EventDtoRepository;
import com.tour.events.infraestructure.entities.Event;
import com.tour.events.infraestructure.entities.Ticket;
import com.tour.events.infraestructure.mapper.EventMapper;
import com.tour.events.infraestructure.repositories.EventCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EventRepository implements EventDtoRepository {

    @Autowired
    public EventCrudRepository eventRepo;

    @Autowired
    public EventMapper eventMapper;

    @Override
    public List<EventDto> getAll() {
        List<Event> events = (List<Event>) eventRepo.findAll();
        return eventMapper.toEvents(events);
    }

    @Override
    public Optional<EventDto> getById(long idEventDto) {
        Optional<Event> event = eventRepo.findById(idEventDto);
        return eventMapper.toEventsOptional(event);
    }

    @Override
    public void deleteByID(long idEventDto) {
        eventRepo.deleteById(idEventDto);
    }

    @Override
    public EventDto save(EventDto ticketDto) {
        Event event = eventMapper.toEvent(ticketDto);
        return eventMapper.toEventDto(eventRepo.save(event));
    }
}
