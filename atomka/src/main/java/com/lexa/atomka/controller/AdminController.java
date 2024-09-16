package com.lexa.atomka.controller;

import com.lexa.atomka.model.User;
import com.lexa.atomka.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/user")
    public String createUser(@RequestBody User user) {
        userService.saveUser(user);
        return "User created";
    }
}
