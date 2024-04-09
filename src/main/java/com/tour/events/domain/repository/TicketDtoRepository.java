package com.tour.events.domain.repository;

import com.tour.events.domain.dto.TicketDto;

import java.util.List;
import java.util.Optional;

public interface TicketDtoRepository {
    List<TicketDto> getAll();
    Optional<TicketDto> getById(long idTicketDto);

    void deleteByID(long idTicketDto);
    TicketDto save(TicketDto ticketDto);
}
