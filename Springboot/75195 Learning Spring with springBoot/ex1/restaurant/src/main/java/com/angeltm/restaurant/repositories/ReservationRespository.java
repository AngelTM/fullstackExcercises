package com.angeltm.restaurant.repositories;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.angeltm.restaurant.models.Reservation;

@Repository
public interface ReservationRespository extends JpaRepository<Reservation,Long>{
    Iterable<Reservation> findReservationByResDate(Date date);
}
