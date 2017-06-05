package com.gmail.kolesnyk.zakhar.userService;

import com.gmail.kolesnyk.zakhar.AbstractService;
import com.gmail.kolesnyk.zakhar.dao.user.User;
import com.gmail.kolesnyk.zakhar.dao.user.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl extends AbstractService implements UserService {

    @Autowired
    private UserDao userDao;

    public UserServiceImpl(@Autowired Environment environment) {
        super(environment);
    }

    @Override
    public List<User> listUsers() {
        return userDao.list();
    }

    @Override
    public User getUserById(int id) {
        return userDao.selectById(id);
    }
}
