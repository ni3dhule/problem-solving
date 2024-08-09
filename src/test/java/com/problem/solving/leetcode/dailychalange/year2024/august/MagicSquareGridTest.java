package com.problem.solving.leetcode.dailychalange.year2024.august;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MagicSquareGridTest {
    @Test
    public void shouldReturnMagicSquareGridNumberSuccess() {
        assertEquals(1, MagicSquareGrid.numMagicSquaresInside(new int[][]{{4,3,8,4},{9,5,1,9},{2,7,6,2}}));
    }
}
