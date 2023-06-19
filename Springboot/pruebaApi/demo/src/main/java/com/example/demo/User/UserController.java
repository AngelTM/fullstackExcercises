package com.example.demo.User;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/amigosinvisibles")
public class UserController {
    
    private final UserService userService;

    UserController(UserService userService){
        this.userService = userService;
    }

    
    @GetMapping
    public List<User> findAllUsers(){
       return userService.getAllUsers();
    }

}
