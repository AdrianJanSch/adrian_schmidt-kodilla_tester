package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;

import java.util.*;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> newList = new ArrayList<>();
        for (Flight flight : FlightRespository.getFlightsTable()) {
            if (flight.getDeparture().equals(departure))
                newList.add(flight);
        }
        return newList;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> results = new ArrayList<>();
        for (Flight flight : FlightRespository.getFlightsTable()) {
            if (flight.getArrival().equals(arrival))
                results.add(flight);
        }
        return results;

    }
}

