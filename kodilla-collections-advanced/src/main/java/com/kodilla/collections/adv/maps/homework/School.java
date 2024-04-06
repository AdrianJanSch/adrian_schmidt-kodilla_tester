package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    private int students;
    private String nameSchool;
    private int numberOfAClassStudents;
    private int numberOfBClassStudents;

    private List<Double> school = new ArrayList<>();


    public School(List<Double> school) {
        this.school = school;

    }

    public School(String nameSchool, int numberOfAClassStudents, int numberOfBClassStudents) {
        this.nameSchool = nameSchool;
        this.numberOfAClassStudents = numberOfAClassStudents;
        this.numberOfBClassStudents = numberOfBClassStudents;

    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                ", nameSchool='" + nameSchool + '\'' +
                ", numberOfAClassStudents=" + numberOfAClassStudents +
                ", numberOfBClassStudents=" + numberOfBClassStudents +
                ", school=" + school +
                '}';
    }
  public String getNameSchool(){
        return nameSchool;
  }
  public int getNumberOfAClassStudents(){
        return numberOfAClassStudents;
  }
    public int getNumberOfBClassStudents(){
      return numberOfBClassStudents;
    }
    public void studentsNumber(){
        System.out.println("in calss A: " + getNumberOfAClassStudents() + ", in class B: " + getNumberOfBClassStudents());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school1 = (School) o;
        return students == school1.students && numberOfAClassStudents == school1.numberOfAClassStudents && numberOfBClassStudents == school1.numberOfBClassStudents && Objects.equals(nameSchool, school1.nameSchool) && Objects.equals(school, school1.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students, nameSchool, numberOfAClassStudents, numberOfBClassStudents, school);
    }
}


