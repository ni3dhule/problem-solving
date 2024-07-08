package com.problem.solving.leetcode.dailychalange.year2024.july;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircularGameWinnerTest {
    @Test
    public void shouldReturnWinnerOfCircularGameSuccess() {
        int n = 5;
        int k = 2;
        assertEquals(3, CircularGameWinner.findTheWinner(n, k));
    }
}
