package com.problem.solving.leetcode.dailychalange.year2024.may;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumCostToHireKWorkerTest {
    @Test
    public void shouldReturnMinimumHiringCostSuccess() {
        int[] quality = new int[]{10,20,5};
        int[] wadges = new int[]{70,50,30};
        int workers = 2;
        assertEquals(105.0000, MinimumCostToHireKWorker.minCostToHireWorkers(quality, wadges, workers));
    }
}
