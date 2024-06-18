package com.problem.solving.leetcode.dailychalange.year2024.june;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MostProfitWorkTest {
    @Test
    public void shouldReturnMaximumProfitSuccess() {
        int[] difficulty = new int[]{2,4,6,8,10};
        int[] profit = new int[]{10,20,30,40,50};
        int[] workers = new int[]{4,5,6,7};
        assertEquals(100, MostProfitWork.maxProfitAssignment(difficulty, profit, workers));
    }
}
