package com.angeltm.restaurant.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="ROOM")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROOM_ID")
    private long room_id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "ROOM_NUMBER")
    private String room_number;
    @Column(name = "BED_INFO")
    private String bed_info;
    public long getRoom_id() {
        return room_id;
    }
    public void setRoom_id(long room_id) {
        this.room_id = room_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRoom_number() {
        return room_number;
    }
    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }
    public String getBed_info() {
        return bed_info;
    }
    public void setBed_info(String bed_info) {
        this.bed_info = bed_info;
    }

}
