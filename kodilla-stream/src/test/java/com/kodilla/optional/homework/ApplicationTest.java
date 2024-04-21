package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    void Teacher_toString_Positive(){
        //given
        Teacher techer = new Teacher("Jan");
        String expName = "Jan";
        String procesingName = null;
        //when
        procesingName = techer.toString();
        //then
        assertEquals(expName,procesingName);
    }

    @Test
    void Teacher_toString_Negative(){
        //given
        Teacher techer = new Teacher("Jan");
        String expName = "Tomek";
        String procesingName = null;
        //when
        procesingName = techer.toString();
        //then
        assertNotEquals(expName,procesingName);
    }

    @Test
    void Student_getName_Positive(){
        //given
        Student student = new Student("Jacek", null);
        String expName = "Jacek";
        String procesingName = null;
        //when
        procesingName = student.getName();
        //then
        assertEquals(expName,procesingName);
    }

    @Test
    void Student_getName_Negative(){
        //given
        Student student = new Student("Jacek", null);
        String expName = "Placek";
        String procesingName = null;
        //when
        procesingName = student.getName();
        //then
        assertNotEquals(expName,procesingName);

    }
    @Test
    void Student_getTeacher_PositiveNull(){
        //given
        Student student = new Student("Jacek", null);
        Teacher expTeacher = null;
        Teacher procesingTeacher = null;
        //when
        procesingTeacher = student.getTeacher();
        //then
        assertEquals(expTeacher,procesingTeacher);
    }
    @Test
    void Student_getTeacher_PositiveNotNull(){
        //given
        Teacher teacher = new Teacher("Paweł");
        Student student = new Student("Jacek", teacher);
        Teacher expTeacher = teacher;
        Teacher procesingTeacher = null;
        //when
        procesingTeacher = student.getTeacher();
        //then
        assertEquals(expTeacher,procesingTeacher);
        assertEquals(expTeacher.getName(), procesingTeacher.getName());
        assertEquals(expTeacher.toString(), procesingTeacher.toString());
    }

    @Test
    void Student_getTeacher_NegativeNull(){
        //given
        Teacher teacher = new Teacher("Paweł");
        Student student = new Student("Jacek", teacher);
        Teacher expTeacher = null;
        Teacher procesingTeacher = null;
        //when
        procesingTeacher = student.getTeacher();
        //then
        assertNotEquals(expTeacher,procesingTeacher);
    }

    @Test
    void Student_getTeacher_NegativeNotNull(){
        //given
        Teacher teacher1 = new Teacher("Paweł");
        Teacher teacher2 = new Teacher("Gaweł");
        Student student = new Student("Jacek", teacher1);
        Teacher expTeacher = teacher2;
        Teacher procesingTeacher = null;
        //when
        procesingTeacher = student.getTeacher();
        //then
        assertNotEquals(expTeacher,procesingTeacher);
    }




}