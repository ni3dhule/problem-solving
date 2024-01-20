package com.problem.solving.leetcode.dailychalange.year2024.january;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SumSubArrayMinimumsTest {
    @Test
    public void shouldReturnSumOfArrayOfMin_Success(){
        int[] input = new int[]{3,1,2,4};
        int expectedMinValue = 17;
        int actualMinValue = SumSubArrayMinimums.sumSubArrayMins(input);
        Assertions.assertEquals(expectedMinValue, actualMinValue);
    }
}
