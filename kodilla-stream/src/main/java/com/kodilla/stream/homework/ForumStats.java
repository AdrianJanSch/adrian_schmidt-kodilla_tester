package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {

    public static void main(String[] args) {
       double avg1= ForumStats.avgNumberOfPostUnder40();
       double avg2= ForumStats.avgNumberOfPostOver40();
        System.out.println("Przed 40 rokiem życia, średnia liczba postów wynosi: " + avg1);
        System.out.println("Po 40 roku życia, średnia liczba postów wynosi: " +  avg2);

    }
    public static double avgNumberOfPostUnder40() {
        double avg = UsersRepository.getUsersList()
                .stream()
                .filter(n -> n.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return avg;
    }

    public static double avgNumberOfPostOver40() {
        double avg = UsersRepository.getUsersList()
                .stream()
                .filter(n-> n.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return avg;
    }
}
