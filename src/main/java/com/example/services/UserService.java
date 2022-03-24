package com.example.services;

import com.example.models.User;
import com.example.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    public User getUserById(Integer id){
        return userRepo.getById(id);
    }

    public void postUser(User user){
        userRepo.save(user);

    }
}
