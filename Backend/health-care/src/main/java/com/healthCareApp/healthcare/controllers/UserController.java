package com.healthCareApp.healthcare.controllers;

import com.healthCareApp.healthcare.models.User;
import com.healthCareApp.healthcare.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
/*
 * <h1>UserController</h1>
 * @author Santiago Cárdenas
 * @version 1.0
 * @since 2020
 * */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public User getUser(@RequestParam("id") UUID id){
        User user = new User();
        user = (User) userService.findById(id);
        return user;
    }

}
