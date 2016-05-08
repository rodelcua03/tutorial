package com.achilles.web.impl;

import com.achilles.model.User;
import com.achilles.service.UserService;
import com.achilles.web.UserController;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rodel on 5/8/16.
 */
@RestController
public class UserControllerImpl implements UserController {

    @Autowired
    public UserService userService;

    @Override
    public User getUser() {
        return userService.getUser();
    }
}
