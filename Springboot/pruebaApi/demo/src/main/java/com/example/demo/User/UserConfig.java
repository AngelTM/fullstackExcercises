package com.example.demo.User;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner productCommandLineRunner(UserRepository repository){
        return args ->{
                    User usuario = new User("Itzel","vive en sus casa en oaxaca no se");
                    User usuario2 = new User("angel","vive en sus casa en oaxaca no se");
                    repository.saveAll(
                        List.of(usuario,usuario2)
                    );
                };
            } 
}

