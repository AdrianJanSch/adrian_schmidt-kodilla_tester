package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    @Test
    void filterChemistGroupUsernames_Positive() {
        //given
        List<String> expList = new ArrayList<>();
        expList.add("Walter White");
        expList.add("Gale Boetticher");
        List<String> list;

        //when
        list = UsersManager.filterChemistGroupUsernames();

        //then
        assertEquals(expList.size(), list.size());
        for (int i = 0; i <expList.size();i++){
            assertEquals(expList.get(i),list.get(i));
        }

    }

    @Test
    void filterChemistAge_Positive() {
        //given
        List<User> expList = new ArrayList<>();
        expList.add(new User("Walter White", 50, 7, "Chemists"));
        expList.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        expList.add(new User("Gus Firing", 49, 0, "Board"));
        expList.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        expList.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        List<User> list;
        //when
        list = UsersManager.filterChemistAge(30);
        //then
        assertEquals(expList.size(), list.size());
        for (User user : list){
//            assertEquals(true,user.getAge() > 30);
            assertTrue(user.getAge() > 30);
        }

    }

    @Test
    void filterAgeAndPost_Positive() {
        //given
        List<User> expList = new ArrayList<>();
        expList.add(new User("Walter White", 50, 7, "Chemists"));
        expList.add(new User("Gus Firing", 49, 0, "Board"));
        expList.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        expList.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        List<User> list;
        //when
        list = UsersManager.filterAgeAndPost(30,10);
        //then
        assertEquals(expList.size(), list.size());
        for (User user : list){
            assertTrue(user.getAge() > 30 && user.getNumberOfPost() < 10);
        }
    }
}