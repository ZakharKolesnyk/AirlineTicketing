package com.gmail.kolesnyk.zakhar.passengerService;

import com.gmail.kolesnyk.zakhar.dao.passenger.Passenger;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * The {@code PassengerService} class used for operations associated with Passenger
 *
 * @author Kolesnyk Zakhar
 * @see com.gmail.kolesnyk.zakhar.AbstractService
 * @since JDK1.8
 */
public interface PassengerService {

    @Transactional(readOnly = true)
    List<Passenger> listUsers();

    @Transactional(readOnly = true)
    Passenger getUserById(int i);
}
