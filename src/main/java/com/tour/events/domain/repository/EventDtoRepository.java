package com.tour.events.domain.repository;

import com.tour.events.domain.dto.EventDto;
import com.tour.events.domain.dto.TicketDto;

import java.util.List;
import java.util.Optional;

public interface EventDtoRepository {
    List<EventDto> getAll();
    Optional<EventDto> getById(long idEventDto);

    void deleteByID(long idEventDto);
    EventDto save(EventDto ticketDto);
}
