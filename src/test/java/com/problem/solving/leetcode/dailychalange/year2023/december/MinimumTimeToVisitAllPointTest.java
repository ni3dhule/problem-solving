package com.problem.solving.leetcode.dailychalange.year2023.december;

import com.problem.solving.leetcode.dailychalange.december.MinimumTimeToVisitAllPoint;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MinimumTimeToVisitAllPointTest {
    @Test
    public void shouldReturnMinimumTimeInterval_Success(){
        int[][] input = new int[][ ] {{1,1},{3,4},{-1,0}};
        int expectedTime = 7;
        int actualTime = MinimumTimeToVisitAllPoint.minTimeToVisitAllPoints(input);
        Assertions.assertEquals(expectedTime, actualTime);
    }
}
