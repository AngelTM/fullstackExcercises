package com.angeltm.restaurant.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RoomsController {
    

    @GetMapping("/rooms")
    public String getRooms(){
        return "lista de cuartos";
    }
}
