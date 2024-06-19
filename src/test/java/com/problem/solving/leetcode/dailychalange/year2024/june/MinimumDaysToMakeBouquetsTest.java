package com.problem.solving.leetcode.dailychalange.year2024.june;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumDaysToMakeBouquetsTest {
    @Test
    public void shouldReturnMinimumNumberOfDaysSuccess(){
        int[] bloomDays = new int[]{1,10,3,10,2};
        int m = 3;
        int k = 1;
        assertEquals(3, MinimumDaysToMakeBouquets.minDays(bloomDays, m, k));
    }
}
