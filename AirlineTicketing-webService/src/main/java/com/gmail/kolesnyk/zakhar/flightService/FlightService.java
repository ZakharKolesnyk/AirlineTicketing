package com.gmail.kolesnyk.zakhar.flightService;


import com.gmail.kolesnyk.zakhar.dao.flight.Flight;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface FlightService {

    @Transactional
    List<Flight> listFlights();
}
