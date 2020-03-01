package com.fixaslab.test.controller;

import com.fixaslab.test.entity.User;
import com.fixaslab.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/create")
    public User createUser(User user){
        return this.userService.createUser(user);
    }



}
