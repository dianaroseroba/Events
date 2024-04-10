package com.tour.events.infraestructure;

import com.tour.events.domain.repository.TicketDtoRepository;
import com.tour.events.infraestructure.repositories.TicketCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//@Repository
//public class TicketRepository implements TicketDtoRepository {

    //@Autowired
    //public TicketCrudRepository ticketRepo;

    //@Autowired
    //public TicketMapper ticketMapper;

    //@Override
    //public List<TicketDto> getAll() {
    //    List<Ticket> tickets = (List<Ticket>) ticketRepo.findAll();
    //    return ticketMapper.toTickets(tickets);
    //}

    //@Override
    //public Optional<TicketDto> getById(long idTicketDto) {
    //    Optional<Ticket> ticket = ticketRepo.findById(idTicketDto);
    //    return ticketMapper.toTicketsOptional(ticket);
    //}

    //@Override
    //public void deleteByID(long idTicketDto) {
    //    ticketRepo.deleteById(idTicketDto);
    //}

    //@Override
    //public TicketDto save(TicketDto ticketDto) {
    //    Ticket ticket = ticketMapper.toTicket(ticketDto);
    //    return ticketMapper.toTicketDto(ticketRepo.save(ticket));
    //}
//}
