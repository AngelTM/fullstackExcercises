package com.angeltm.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void ex() {
         // List of buildings
         List<Building> buildings = new ArrayList<Building>();
         buildings.add(new Building());
         buildings.add(new Building());
         printBuildings(buildings);
         
         // List of offices
         List<Office> offices = new ArrayList<Office>();
         offices.add(new Office());
         offices.add(new Office());
         printBuildings(offices);
 
         // List of houses
         List<House> houses = new ArrayList<House>();
         houses.add(new House());
         houses.add(new House());
         printBuildings(houses);
         
         addHouseToList(houses);
         addHouseToList(buildings);
    }

    static void printBuildings(List<? extends Building> buildings) {
        for(int i = 0; i < buildings.size(); i++) {
            System.out.println(buildings.get(i).toString() + " " + (i + 1));
        }
        System.out.println();
    }
    
    
    static void addHouseToList(List<? super House> buildings) {
        buildings.add(new House());
        System.out.println();
    }
}
