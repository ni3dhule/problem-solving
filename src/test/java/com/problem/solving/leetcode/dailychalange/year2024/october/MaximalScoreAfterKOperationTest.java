package com.problem.solving.leetcode.dailychalange.year2024.october;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximalScoreAfterKOperationTest {
    @Test
    public void shouldReturnMaximalOperationSuccess() {
        assertEquals(50, MaximalScoreAfterKOperation.maxKElements(new int[]{10,10,10,10,10}, 5));
    }
}
