package com.gmail.kolesnyk.zakhar.flightService;

import com.gmail.kolesnyk.zakhar.AbstractService;
import com.gmail.kolesnyk.zakhar.dao.flight.Flight;
import com.gmail.kolesnyk.zakhar.dao.flight.FlightDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImpl extends AbstractService implements FlightService {

    @Autowired
    private FlightDao flightDao;

    public FlightServiceImpl(@Autowired Environment environment) {
        super(environment);
    }

    @Override
    public List<Flight> listFlights() {
        return flightDao.list();
    }
}
