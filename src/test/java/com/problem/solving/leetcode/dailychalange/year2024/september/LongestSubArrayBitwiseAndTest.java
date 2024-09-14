package com.problem.solving.leetcode.dailychalange.year2024.september;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubArrayBitwiseAndTest {
    @Test
    public void shouldReturnSubArrayLengthSuccess(){
        assertEquals(2, LongestSubArrayBitwiseAnd.longestSubArray(new int[]{1,2,3,3,2,2}));
    }
}
