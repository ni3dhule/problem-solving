package com.problem.solving.leetcode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class GoodPairOfNumbersTest {
    @Test
    public void getGoodPairCountPositiveTestCase() {
        int[] input = new int[] {1,2,3,1,1,3};
        int expectedResult = 4;
        int actualResult = GoodPairOfNumbers.numIdenticalPairs(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getGoodPairCountNegativeTestCase() {
        int[] input = new int[] {1,2,3,1,1,3};
        int expectedResult = 2;
        int actualResult = GoodPairOfNumbers.numIdenticalPairs(input);
        Assertions.assertNotSame(expectedResult, actualResult);
    }
}
