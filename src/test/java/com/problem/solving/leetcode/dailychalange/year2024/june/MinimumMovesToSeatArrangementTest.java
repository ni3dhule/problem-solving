package com.problem.solving.leetcode.dailychalange.year2024.june;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MinimumMovesToSeatArrangementTest {
    @Test
    public void shouldReturnMinimumMovesToMakeSeatingArrangementSuccess(){
        int[] seats = new int[]{3,1,5};
        int[] student = new int[] {2,7,4};
        Assertions.assertEquals(4, MinimumMovesToSeatArrangement.minMovesToSeat(seats, student));
    }
}
