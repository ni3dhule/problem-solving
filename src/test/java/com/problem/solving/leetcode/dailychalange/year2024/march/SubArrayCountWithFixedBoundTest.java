package com.problem.solving.leetcode.dailychalange.year2024.march;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SubArrayCountWithFixedBoundTest {
    @Test
    public void shouldReturnSubArrayCountWithFixedBound_Success(){
        int[] input = new int[]{1,3,5,2,7,5};
        int minK = 1;
        int maxK = 5;
        long expectedSubArrayCount = 2;
        long actualSubArrayCount = SubArrayCountWithFixedBound.countSubArrays(input, minK,maxK);
        Assertions.assertEquals(expectedSubArrayCount, actualSubArrayCount);
    }
}
