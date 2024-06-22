package com.problem.solving.leetcode.dailychalange.year2024.june;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NiceSubArrayTest {
    @Test
    public void shouldReturnNiceSubArrayCountSuccess(){
        int[] input = new int[]{1,1,2,1,1};
        int k = 3;
        assertEquals(2, NiceSubArray.numberOfSubArrays(input, k));
    }
}
