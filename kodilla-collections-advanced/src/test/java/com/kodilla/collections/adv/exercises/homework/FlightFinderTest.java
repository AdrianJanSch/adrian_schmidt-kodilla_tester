package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    @Test
    void findFlightsFrom() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> list = flightFinder.findFlightsFrom("Katowice");
        //then
        assertEquals(2,list.size() );

    }

    @Test
    void findFlightsTo() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> list = flightFinder.findFlightsTo("Kraków");
        //then
        assertEquals(2,list.size() );

    }
}