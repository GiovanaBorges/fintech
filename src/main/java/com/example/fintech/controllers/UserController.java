package com.example.fintech.controllers;

import com.example.fintech.domain.User;
import com.example.fintech.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("user")
@RestController
public class UserController {
    @Autowired
    UserServices services;

    @GetMapping
    public ResponseEntity getAllusers(){
        List<User> users = services.getAllUsers();
        return ResponseEntity.accepted().body(users);
    }

    @PostMapping
    public ResponseEntity createUser(@RequestBody User user){
        return services.createUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) throws Exception {
        services.deletedUser(id);
    }
}
