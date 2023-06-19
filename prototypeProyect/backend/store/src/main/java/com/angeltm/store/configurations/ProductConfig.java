package com.angeltm.store.configurations;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.angeltm.store.Models.Product;
import com.angeltm.store.repositories.ProductRepository;

@Configuration
public class ProductConfig {
    @Bean
    CommandLineRunner productCommandLineRunner(ProductRepository repository){
        return args ->{
                    Product lap = new Product("laptop",200,5);
                    Product phone = new Product("smartphone",65,6);
                    repository.saveAll(
                        List.of(lap,phone)
                    );
                };
            } 
}
