package com.problem.solving.leetcode.dailychalange.year2024.june;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContinuousLongestSubArrayTest {
    @Test
    public void shouldReturnLengthOfLongestArraySuccess(){
        int[] input = new int[]{8,2,4,7};
        int limit = 4;
        assertEquals(2, ContinuousLongestSubArray.longestSubArray(input, limit));
    }
}
