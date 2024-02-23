package com.problem.solving.leetcode.dailychalange.year2024.february;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FindCheapestFlightTest {
    @Test
    public void shouldReturnCheapestFlightRate_Success(){
        int[][] input = new int[][]{{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int n = 4;
        int source = 0;
        int destination = 3;
        int k = 1;
        int expectedCheapestRate = 700;
        int actualCheapestRate = FindCheapestFlight.findCheapestPrice(n, input, source,destination,k);
        Assertions.assertEquals(expectedCheapestRate, actualCheapestRate);
    }
}
