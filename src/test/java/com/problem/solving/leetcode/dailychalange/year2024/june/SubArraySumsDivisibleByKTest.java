package com.problem.solving.leetcode.dailychalange.year2024.june;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubArraySumsDivisibleByKTest {
    @Test
    public void shouldReturnSubArrayCountDivisibleByKSuccess(){
        assertEquals(7, SubArraySumsDivisibleByK.subArraysDivisibleByK(new int[]{4,5,0,-2,-3,1}, 5));
    }
}
