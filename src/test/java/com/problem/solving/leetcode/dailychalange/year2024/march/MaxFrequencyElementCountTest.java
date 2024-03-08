package com.problem.solving.leetcode.dailychalange.year2024.march;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MaxFrequencyElementCountTest {
    @Test
    public void shouldReturnMaxFrequencyElementCount_Success(){
        int[] input = new int[]{1,2,2,3,1,4};
        int expectedCount = 4;
        int actualCount = MaxFrequencyElementCount.maxFrequencyElements(input);
        Assertions.assertEquals(expectedCount, actualCount);
    }
}
