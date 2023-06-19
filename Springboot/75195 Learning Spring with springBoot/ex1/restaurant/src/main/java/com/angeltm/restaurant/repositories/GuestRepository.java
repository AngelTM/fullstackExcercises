package com.angeltm.restaurant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.angeltm.restaurant.models.Guest;

@Repository
public interface GuestRepository extends JpaRepository<Guest,Long>{
    
}
