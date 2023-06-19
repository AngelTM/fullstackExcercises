package com.angeltm.store.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.angeltm.store.Models.User;
import com.angeltm.store.services.UserService;
import java.util.*;

@RestController
@RequestMapping("/api/v1/users")
@CrossOrigin
public class UserController {

    private final UserService userservice;

    public UserController(UserService userservice) {
        this.userservice = userservice;
    }


    @GetMapping()
    public ResponseEntity<List<User>> getUsers(){
        List<User> users = userservice.getUsers();
        ResponseEntity<List<User>> response = new ResponseEntity<>(users,HttpStatus.OK);
        return response;
    }


    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable Long id){
        return userservice.getUserByid(id);
    }

 
    @PostMapping
    public User insertUser(@RequestBody User user){
        return userservice.insertUser(user);
    }


    @PutMapping()
    public User modifyUser(@RequestBody User user){
        return userservice.update(user);
    }
    


}
