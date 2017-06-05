package com.gmail.kolesnyk.zakhar.ticketService;


import com.gmail.kolesnyk.zakhar.dao.ticket.Ticket;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface TicketService {

    @Transactional
    List<Ticket> listTickets();
}
