package com.usertask.backend.controller;


import com.usertask.backend.model.User;
import com.usertask.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    //get all users
    @GetMapping("users")
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }


    //post user  create user
    @PostMapping("user")
    User addUser(@RequestBody User user) { return  userService.createUser(user); }

    // Delete user
    @DeleteMapping("user")
    public String remUser(@PathVariable Long userId){
        userService.removeUser(userId);
        return  "user deleted";
    }

}


