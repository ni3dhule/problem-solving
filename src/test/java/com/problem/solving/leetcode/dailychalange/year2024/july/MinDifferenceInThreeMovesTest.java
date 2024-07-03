package com.problem.solving.leetcode.dailychalange.year2024.july;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinDifferenceInThreeMovesTest {
    @Test
    public void shouldReturnMinimumDifferenceBetweenSmallLargeValueSuccess() {
        int[] numbers = new int[]{5,3,2,4};
        assertEquals(0, MinDifferenceInThreeMoves.minDifference(numbers));
    }
}
