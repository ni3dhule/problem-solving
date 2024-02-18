package com.problem.solving.leetcode.dailychalange.year2024.february;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MostMeetingHoldingRoomTest {
    @Test
    public void shouldReturnMostMeetingHoldingMeetingRoom_Success(){
        int[][] inputs = new int[][]{{0,10},{1,5},{2,7},{3,4}};
        int roomNumber = 2;
        int expectedMostBusyRoom = 0;
        int actualMostBustRoom = MostMeetingHoldingRoom.mostBooked(roomNumber, inputs);
        Assertions.assertEquals(expectedMostBusyRoom, actualMostBustRoom);

    }
}
