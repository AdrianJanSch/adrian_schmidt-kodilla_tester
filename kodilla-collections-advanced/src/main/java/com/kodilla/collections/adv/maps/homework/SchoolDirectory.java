package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();

        Principal jan = new Principal("Jan", "Kowalski");
        Principal pawel = new Principal("Paweł", "Wlazło");
        Principal jacek = new Principal("Jacek", "Tomaszewski");
        Principal monika = new Principal("Monika", "Nowok");

        School mickieiwcz = new School("Mickieiwcz", 27 ,22);
        School batory = new School("Batory",24,31);
        School slowacki = new School("Słowacki",19,14);
        School sniadecki = new School("Śniadecki",32,26);

        school.put(jan, mickieiwcz);
        school.put(pawel,batory);
        school.put(jacek,slowacki);
        school.put(monika,sniadecki);

        System.out.println(school.get(jan));

        for (Map.Entry<Principal, School> pricipalSchoolInfo: school.entrySet()){
            System.out.println();
            System.out.println("|-> " + pricipalSchoolInfo.getKey().getFirstName() + " "+ pricipalSchoolInfo.getKey().getLastName() + " w sowim liceum, którego patronem jest - " + pricipalSchoolInfo.getValue().getNameSchool() + ", posiada dwie klasy. Klasa A posiada: " + pricipalSchoolInfo.getValue().getNumberOfAClassStudents() + " uczniów, zaś klasa B: " + pricipalSchoolInfo.getValue().getNumberOfBClassStudents()+ " uczniów" + " <-|");
            System.out.println();

    }


    }
}
