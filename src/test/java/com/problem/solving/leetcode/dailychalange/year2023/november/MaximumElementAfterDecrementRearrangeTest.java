package com.problem.solving.leetcode.dailychalange.year2023.november;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MaximumElementAfterDecrementRearrangeTest {
    @Test
    public void shouldReturnmaximumElementAfterDecrementAndRearrangement(){
        int[] input = new int[]{2,2,1,2,1};
        int expectedResult = 2;
        int actualResult = MaximumElementAfterDecrementRearrange.maximumElementAfterDecrementingAndRearranging(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
