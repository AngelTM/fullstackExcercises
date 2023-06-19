package com.angeltm.store.configurations;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.angeltm.store.Models.User;
import com.angeltm.store.repositories.UserRepository;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner userCommandLineRunner(UserRepository repository){
        return args ->{
                    User angel = new User("Angel","123","admin");
                    User omar = new User("Omar","123","admin");
                    User fernando = new User("fernando","123","admin");
                    User persona = new User("persona","123","user");
                    repository.saveAll(
                        List.of(angel,persona,omar,fernando)
                    );
                };
            } 
}
