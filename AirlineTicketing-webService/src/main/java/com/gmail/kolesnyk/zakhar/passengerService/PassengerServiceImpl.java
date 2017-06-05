package com.gmail.kolesnyk.zakhar.passengerService;

import com.gmail.kolesnyk.zakhar.AbstractService;
import com.gmail.kolesnyk.zakhar.dao.passenger.Passenger;
import com.gmail.kolesnyk.zakhar.dao.passenger.PassengerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerServiceImpl extends AbstractService implements PassengerService {

    @Autowired
    private PassengerDao passengerDao;

    public PassengerServiceImpl(@Autowired Environment environment) {
        super(environment);
    }

    @Override
    public List<Passenger> listUsers() {
        return passengerDao.list();
    }

    @Override
    public Passenger getUserById(int id) {
        return passengerDao.selectById(id);
    }
}
