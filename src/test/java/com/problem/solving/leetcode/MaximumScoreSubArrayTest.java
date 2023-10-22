package com.problem.solving.leetcode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MaximumScoreSubArrayTest {
    @Test
    public void maximumScore(){
        int[] input = new int[]{1,4,3,7,4,5};
        int k = 3;
        int expectedResult = 15;
        int actualResult = MaximumScoreSubArray.maximumScore(input, k);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
