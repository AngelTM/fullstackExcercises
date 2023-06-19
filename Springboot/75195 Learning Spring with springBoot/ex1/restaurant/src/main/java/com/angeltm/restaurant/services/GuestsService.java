package com.angeltm.restaurant.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.angeltm.restaurant.models.Guest;
import com.angeltm.restaurant.repositories.GuestRepository;

@Service
public class GuestsService {
    private final GuestRepository guestRepository;

    public GuestsService(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }
    
    public List<Guest> getAllGuests(){
        return guestRepository.findAll();
    }

    public Guest insertGuest(Guest guest){
        if (guest == null) {
            throw new RuntimeException("null guest");
        }
        return guestRepository.save(guest);
    }
}
