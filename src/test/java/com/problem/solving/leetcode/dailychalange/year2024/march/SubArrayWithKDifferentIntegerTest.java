package com.problem.solving.leetcode.dailychalange.year2024.march;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SubArrayWithKDifferentIntegerTest {
    @Test
    public void shouldReturnKDifferetntInteger_Success() {
        int[] input = new int[]{1,2,1,2,3};
        int kDiffInteger = 2;
        int expectedTotalSubArrayCount = 7;
        int actualTotalSubArrayCount = SubArrayWithKDifferentInteger.subArraysWithKDistinct(input, kDiffInteger);
        Assertions.assertEquals(expectedTotalSubArrayCount, actualTotalSubArrayCount);
    }
}
