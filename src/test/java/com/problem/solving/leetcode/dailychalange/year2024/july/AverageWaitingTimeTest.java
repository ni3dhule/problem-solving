package com.problem.solving.leetcode.dailychalange.year2024.july;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageWaitingTimeTest {
    @Test
    public void shouldReturnAverageWaitingTimeSuccess() {
        int[][] customers = new int[][]{{1,2},{2,5},{4,3}};
        assertEquals(5.00000, AverageWaitingTime.averageWaitingTime(customers));
    }
}
