package com.problem.solving.leetcode.dailychalange.year2024.october;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountSquareSubMatricesTest {
    @Test
    public void shouldReturnCountSquareSubMatricesSuccess() {
        assertEquals(15, CountSquareSubMatrices.countSquares(new int[][]{{0,1,1,1}, {1,1,1,1}, {0,1,1,1}}));
    }
}
