package com.gmail.kolesnyk.zakhar.airportService;


import com.gmail.kolesnyk.zakhar.AbstractService;
import com.gmail.kolesnyk.zakhar.dao.airport.Airport;
import com.gmail.kolesnyk.zakhar.dao.airport.AirportDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportServiceImpl extends AbstractService implements AirportService{

    @Autowired
    private AirportDao airportDao;

    public AirportServiceImpl(@Autowired Environment environment) {
        super(environment);
    }

    @Override
    public List<Airport> listAirports() {
        return airportDao.list();
    }
}
