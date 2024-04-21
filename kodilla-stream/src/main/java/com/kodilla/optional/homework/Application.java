package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        Teacher teacher1 = new Teacher("Janusz");
        Teacher teacher2 = new Teacher("Paweł");
        Teacher teacher3 = new Teacher("Jola");

        Student student1 = new Student("Karol", teacher1);
        Student student2 = new Student("Jacek", teacher2);
        Student student3 = new Student("Bogdan", teacher3);
        Student student4 = new Student("Ola", null);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        for (Student student : studentList) {
            System.out.println("uczeń: " + student.getName() + ", nauczyciel:"
                    + Optional.ofNullable(student.getTeacher())
                              .map(Teacher::toString)
                              .orElse(" <undefined>"));
        }
    }
}


