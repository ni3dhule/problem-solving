package com.problem.solving.leetcode.dailychalange.year2024.march;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BinarySubArraySumTest {
    @Test
    public void shouldReturnNonEmptyArrays_Success(){
        int[] input = new int[]{1,0,1,0,1};
        int goal = 2;
        int expectedSubArrayCount = 4;
        int actualSubArrayCount = BinarySubArraySum.numSubArraysWithSum(input, goal);
        Assertions.assertEquals(expectedSubArrayCount, actualSubArrayCount);
    }
}
