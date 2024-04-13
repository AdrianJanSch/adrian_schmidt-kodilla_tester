package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    @Test
    void filterChemistGroupUsernames() {
        //given
        List<String> list;
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Walter White");
        expectedList.add("Gale Boetticher");
        //when
        list = UsersManager.filterChemistGroupUsernames();
        //then
        assertEquals(expectedList.size(),list.size());
        for(int i = 0; i<expectedList.size(); i++)
            assertEquals(expectedList.get(i),list.get(i));


    }
}