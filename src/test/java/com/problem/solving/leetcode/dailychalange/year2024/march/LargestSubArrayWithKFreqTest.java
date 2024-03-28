package com.problem.solving.leetcode.dailychalange.year2024.march;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class LargestSubArrayWithKFreqTest {
    @Test
    public void shouldReturnLengthOfSubArrayWithKFrequency_Success(){
        int[] input = new int[]{1,2,3,1,2,3,1,2};
        int k = 2;
        int expectedSubArrayLength = 6;
        int actualSubArrayLength = LargestSubArrayWithKFreq.maxSubarrayLength(input, k);
        Assertions.assertEquals(expectedSubArrayLength, actualSubArrayLength);
    }
}
