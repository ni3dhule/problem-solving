package com.problem.solving.leetcode.dailychalange.year2023.december;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MaxProductDifferenceTest {
    @Test
    public void shouldReturnMaxProductDifference_Success(){
        int[] input =new int[]{5,6,2,7,4};
        int expectedResult = 34;
        int actualResult = MaxProductDifference.maxProductDifference(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
