package com.angeltm.restaurant.util;

import java.util.List;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.angeltm.restaurant.models.Guest;
import com.angeltm.restaurant.models.Reservation;
import com.angeltm.restaurant.models.Room;
import com.angeltm.restaurant.repositories.GuestRepository;
import com.angeltm.restaurant.repositories.ReservationRespository;
import com.angeltm.restaurant.repositories.RoomRepository;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent>{

    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;
    private final ReservationRespository reservationRespository;


    AppStartupEvent(RoomRepository roomRepository,GuestRepository guestRepository,ReservationRespository reservationRespository){
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRespository = reservationRespository;
    }
    
    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        List<Room> rooms = this.roomRepository.findAll();
        rooms.forEach(System.out::println);

        List<Guest> guests = this.guestRepository.findAll();
        guests.forEach(System.out::println);

        List<Reservation> reservations = this.reservationRespository.findAll();
        reservations.forEach(System.out::println);

 

    }
    
    
}
