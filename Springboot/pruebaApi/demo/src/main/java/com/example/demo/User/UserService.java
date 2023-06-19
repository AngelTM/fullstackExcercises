package com.example.demo.User;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    
    private final UserRepository userRepository;
    
    UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> getUserById(long id){
        return  userRepository.findById(id);
       
    }
  
}


//obtener todos los usuarios
//buscar usuario por id 
//insertar un usuario
//eliminar un usuario
