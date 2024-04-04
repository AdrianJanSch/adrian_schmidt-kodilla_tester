package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private String stemper;
    private int dimensions;

    public Stamp(String name, int dimensions, String stemper){
        this.name = name;
        this.dimensions = dimensions;
        this.stemper = stemper;
    }

    public String getName(){
        return name;
    }
    public String getSemper(){
        return stemper;
    }
    public int getDimensions(){
        return dimensions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return dimensions == stamp.dimensions && Objects.equals(name, stamp.name) && Objects.equals(stemper, stamp.stemper);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stemper, dimensions);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", stemper='" + stemper + '\'' +
                ", dimensions=" + dimensions +
                '}';
    }
}
