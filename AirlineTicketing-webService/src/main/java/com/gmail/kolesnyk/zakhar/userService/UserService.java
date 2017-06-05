package com.gmail.kolesnyk.zakhar.userService;

import com.gmail.kolesnyk.zakhar.dao.user.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * The {@code UserService} class used for operations associated with User
 *
 * @author Kolesnyk Zakhar
 * @see com.gmail.kolesnyk.zakhar.AbstractService
 * @since JDK1.8
 */
public interface UserService {

    @Transactional(readOnly = true)
    List<User> listUsers();

    @Transactional(readOnly = true)
    User getUserById(int i);
}
