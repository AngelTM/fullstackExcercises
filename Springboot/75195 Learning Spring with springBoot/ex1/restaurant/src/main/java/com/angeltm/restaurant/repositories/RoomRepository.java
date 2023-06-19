package com.angeltm.restaurant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.angeltm.restaurant.models.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {

}
