package com.problem.solving.leetcode.dailychalange.year2024.june;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumFlipsTest {
    @Test
    public void shouldReturnMinimumFlipsSuccess(){
        int[] input = new int[] {0,1,0};
        int k = 1;
        assertEquals(2, MinimumFlips.minKBitFlips(input, k));
    }
}
