package com.javacode.userapp.controller;

import com.javacode.userapp.dao.UserRepository;
import com.javacode.userapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class UserController {

@Autowired
UserRepository userRepo;

    @GetMapping("/userslist")
    public List<User> listOfUsers(){
        return userRepo.findAll();
    }
}
