package com.problem.solving.leetcode.dailychalange.year2024.june;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCodeIPOTest {
    @Test
    public void shouldReturnMaximumCapitalSuccess() {
        int k = 2;
        int w = 0;
        int[] profits = new int[]{1,2,3};
        int[] capitals = new int[]{0,1,1};
        assertEquals(4, LeetCodeIPO.findMaximizedCapital(k, w, profits, capitals));
    }
}
