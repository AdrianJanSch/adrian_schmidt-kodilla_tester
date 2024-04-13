package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRespository {
    private static List<Flight> flights = new ArrayList<>(){
        {
            add(new Flight("Katowice", "Warszawa"));
            add(new Flight("Katowice", "Kraków"));
            add(new Flight("Warszawa", "Kraków"));

        }

    };

    public static List<Flight> getFlightsTable(){
        return flights;
    }




}


