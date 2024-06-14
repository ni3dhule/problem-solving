package com.problem.solving.leetcode.dailychalange.year2024.june;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumIncrementForUniqueArrayTest {
    @Test
    public void shouldReturnMinimumIncrementsForUniqueArraySuccess() {
        int[] numbers = new int[]{1,2,2};
        assertEquals(1, MinimumIncrementForUniqueArray.minIncrementForUnique(numbers));
    }
}
