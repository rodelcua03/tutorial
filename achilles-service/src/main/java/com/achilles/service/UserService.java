package com.achilles.service;

import com.achilles.model.User;
import org.springframework.stereotype.Service;

/**
 * Created by rodel on 5/8/16.
 */
@Service
public interface UserService {

    public User getUser();
}
