package com.achilles.service.impl;

import com.achilles.model.User;
import com.achilles.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by rodel on 5/8/16.
 */
@Service
public class UserServiceImpl implements UserService {
    public User getUser() {
        User user = new User();

        user.setName("Sample");
        user.setPassword("Password");
        user.setUsername("Username");

        return user;
    }
}
