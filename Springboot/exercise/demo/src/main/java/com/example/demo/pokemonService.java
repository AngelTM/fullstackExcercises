package com.example.demo;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path = "/pok")
public class pokemonService {
    @GetMapping()
    private String getpokemons(){
        String uri = "https://pokeapi.co/api/v2/pokemon/?limit=50";
        RestTemplate restTemplate= new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }
}
