package com.problem.solving.leetcode.dailychalange.year2024.may;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfXORSubsetTest {
    @Test
    public void shouldReturnSumOfXORSubsetSuccess() {
        int[] numbers = new int[]{1,3};
        assertEquals(6, SumOfXORSubset.subsetXORSum(numbers));
    }
}
