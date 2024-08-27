package com.problem.solving.leetcode.dailychalange.year2024.august;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxProbabilityPathTest {
    @Test
    public void shouldReturnMaxProbabilityPathSuccess() {
        assertEquals(0.25000, MaxProbabilityPath.maxProbability(3, new int[][]{{0,1},{1,2},{0,2}}, new double[]{0.5,0.5,0.2}, 0, 2));
    }
}
