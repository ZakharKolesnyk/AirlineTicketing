package com.gmail.kolesnyk.zakhar.ticketService;


import com.gmail.kolesnyk.zakhar.AbstractService;
import com.gmail.kolesnyk.zakhar.dao.ticket.Ticket;
import com.gmail.kolesnyk.zakhar.dao.ticket.TicketDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl extends AbstractService implements TicketService {

    @Autowired
    private TicketDao ticketDao;

    public TicketServiceImpl(@Autowired Environment environment) {
        super(environment);
    }

    @Override
    public List<Ticket> listTickets() {
        return ticketDao.list();
    }
}
