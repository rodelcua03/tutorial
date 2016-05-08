package com.achilles.service.service;

import com.achilles.model.User;
import com.achilles.service.UserService;
import com.achilles.service.config.TestAppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.Assert.*;

/**
 * Created by rodel on 5/8/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = TestAppConfig.class, loader = AnnotationConfigContextLoader.class)
@ContextConfiguration(locations = "classpath:test-config.xml")
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testGetUser() {
        User user = userService.getUser();

        assertEquals("Sample", user.getName());
    }
}
