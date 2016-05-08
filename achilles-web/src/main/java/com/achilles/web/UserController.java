package com.achilles.web;

import com.achilles.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rodel on 5/8/16.
 */
@RestController
public interface UserController {

    String URL_USER_GET = "/user/get";

    @RequestMapping(path = URL_USER_GET, method = RequestMethod.GET)
    public User getUser();
}
