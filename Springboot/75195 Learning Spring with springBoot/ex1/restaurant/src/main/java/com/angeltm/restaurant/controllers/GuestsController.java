package com.angeltm.restaurant.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.angeltm.restaurant.models.Guest;
import com.angeltm.restaurant.services.GuestsService;

@RestController
@RequestMapping("/api")
public class GuestsController {

    private final GuestsService guestsService;

    GuestsController(GuestsService guestsService){
        this.guestsService = guestsService;
    }

    @GetMapping("/guests")
    public List<Guest> getAllGuests(){
        return guestsService.getAllGuests();
    }

    @PostMapping("/addGuest")
    public Guest insertGuest(@RequestParam Guest guest){
        return guestsService.insertGuest(guest);
    }
}
