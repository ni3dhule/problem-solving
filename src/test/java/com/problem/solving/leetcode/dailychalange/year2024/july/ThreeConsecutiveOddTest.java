package com.problem.solving.leetcode.dailychalange.year2024.july;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class ThreeConsecutiveOddTest {
    @Test
    public void shouldReturnTrueForConsecutiveOddNumberSuccess() {
        int[] input = new int[]{2,4,6,1};
        assertFalse(ThreeConsecutiveOdd.threeConsecutiveOdds(input));
    }
}
