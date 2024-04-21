package com.kodilla.stream.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {

    @Test
    void avgNumberOfPostUnder40() {
        //given
        double procesingAvg = -1.0;
        double expAvg = 2382.0;
        //when
        procesingAvg = ForumStats.avgNumberOfPostUnder40();
        //then
        assertEquals(expAvg,procesingAvg, 0.01);
    }

    @Test
    void avgNumberOfPostOver40() {
        //given
        double procesingAvg = -1.0;
        double expAvg = 2.25;
        //when
        procesingAvg = ForumStats.avgNumberOfPostOver40();
        //then
        assertEquals(expAvg,procesingAvg,0.01);
    }
}