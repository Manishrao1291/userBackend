package com.usertask.backend.service;


import com.usertask.backend.model.User;
import com.usertask.backend.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    @Autowired
    UserRepo userRepo;


    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public User createUser(User user) {
        return userRepo.save(user);
    }

    public void removeUser(Long userId) {
        userRepo.deleteById(userId);
    }
}
