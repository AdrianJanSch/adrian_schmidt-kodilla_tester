package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps =new HashSet<>();
        stamps.add(new Stamp("Queen",2, "Yes"));
        stamps.add(new Stamp("King",2,"Yes"));
        stamps.add(new Stamp("Warsaw",3,"No"));
        stamps.add(new Stamp("Mercedes",3,"Yes"));
        stamps.add(new Stamp("Mercedes",3,"Yes"));
        stamps.add(new Stamp("King",2,"Yes"));
        stamps.add(new Stamp("King",2,"Yes"));
        System.out.println(stamps.size());
        for(Stamp stamp : stamps)
            System.out.println(stamp);

    }
}
