package com.gmail.kolesnyk.zakhar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

/**
 * The {@code AbstractService} service class contained main instruments that used in child Service classes
 *
 * @author Kolesnyk Zakhar
 * @see com.gmail.kolesnyk.zakhar.userService.UserService
 * @since JDK1.8
 */
@Service
public abstract class AbstractService {

    public AbstractService(@Autowired Environment environment) {
    }
}
