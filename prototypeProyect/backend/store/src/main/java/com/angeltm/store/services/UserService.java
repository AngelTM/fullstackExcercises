package com.angeltm.store.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.angeltm.store.Models.User;
import com.angeltm.store.Utilities.Status;
import com.angeltm.store.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public Optional<User> getUserByid(long id){
        return userRepository.findById(id);
    }

    public User insertUser(User user){
        if (validUser(user)) {
            return userRepository.save(user);
        }
        return null;
    }

    @Transactional
    public User update(User user) {
        User updateResponse = userRepository.save(user);
        return updateResponse;
    }


    
    private boolean validUser(User user){
        if (user.getUserName()!=null && !user.getUserName().equals("") && user.getPassword()!=null && !user.getPassword().equals("") && user.getRol()!=null && !user.getRol().equals("")) {
            return true;
        }else{
            return false;
        }
    }
}
