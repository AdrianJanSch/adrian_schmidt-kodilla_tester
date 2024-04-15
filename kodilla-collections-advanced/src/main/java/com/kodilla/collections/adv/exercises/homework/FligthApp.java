package com.kodilla.collections.adv.exercises.homework;

public class FligthApp {

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        for (Flight flight : flightFinder.findFlightsFrom("Katowice")){
            System.out.println( "Z " + flight.getDeparture() + " do " + flight.getArrival());

        }
        for (Flight flight : flightFinder.findFlightsTo("Warszawa")){
            System.out.println("Z " + flight.getDeparture() + " do " + flight.getArrival() );

        }
    }
}
