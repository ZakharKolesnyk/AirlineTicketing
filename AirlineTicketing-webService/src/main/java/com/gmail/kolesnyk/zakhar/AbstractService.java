package com.gmail.kolesnyk.zakhar;

import com.gmail.kolesnyk.zakhar.passengerService.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

/**
 * The {@code AbstractService} service class contained main instruments that used in child Service classes
 *
 * @author Kolesnyk Zakhar
 * @see PassengerService
 * @since JDK1.8
 */
@Service
public abstract class AbstractService {

    public AbstractService(@Autowired Environment environment) {
    }
}
