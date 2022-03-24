package com.example.controllers;

import com.example.models.User;
import com.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable("id") Integer id) {
       return userService.getUserById(id).toString();
    }

    @PostMapping
    public void postUser(@RequestBody User user){
        // return 418 status code
        userService.postUser(user);

    }

}
