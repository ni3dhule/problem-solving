package com.problem.solving.leetcode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BusRoutesTest {
    @Test
    public void shouldReturnNumberOfRoutes(){
        int[][] input = new int[][]{{1,2,7}, {3,6,7}};
        int source = 1;
        int destination = 6;
        int expectedRoutes = 2;
        int actualRoutes = BusRoutes.numBusesToDestination(input, source, destination);
        Assertions.assertEquals(expectedRoutes, actualRoutes);
    }
}
