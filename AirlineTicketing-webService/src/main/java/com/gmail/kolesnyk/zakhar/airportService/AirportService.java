package com.gmail.kolesnyk.zakhar.airportService;


import com.gmail.kolesnyk.zakhar.AbstractService;
import com.gmail.kolesnyk.zakhar.dao.airport.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AirportService{

    @Transactional
    List<Airport> listAirports();
}
