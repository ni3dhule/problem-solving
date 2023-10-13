package com.problem.solving.leetcode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MinCostClimbingStairsTest {
    @Test
    public void getMinCostClimbingStirsTestPositiveTestCase() {
        int[] inputStairs = new int[]{10,15,20};
        int expectedResult = 15;
        int actualResult = MinCostClimbingStairs.minCostClimbingStairs(inputStairs);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
