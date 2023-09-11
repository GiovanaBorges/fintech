package com.example.fintech.services;

import com.example.fintech.domain.User;
import com.example.fintech.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    @Autowired
    UserRepository repository;

    public ResponseEntity<Optional<User>> createUser(User user){
        Optional<User> newUser = Optional.of(repository.save(user));

        if(newUser.isPresent()){
            return ResponseEntity.status(200).body(newUser);
        }else{
            return ResponseEntity.badRequest().body(newUser);
        }
    }

    public ResponseEntity deletedUser(Long id) throws Exception {
        Optional<User> userFounded = Optional.of(repository.getById(id));

        if(userFounded.isPresent()){
            repository.deleteById(id);
        }else{
            throw new Exception("User not founded");
        }

        return ResponseEntity.status(404).build();
    }

    public List<User> getAllUsers(){
        return this.repository.findAll();
    }
}
