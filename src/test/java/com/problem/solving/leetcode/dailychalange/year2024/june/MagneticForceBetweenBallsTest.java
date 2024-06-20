package com.problem.solving.leetcode.dailychalange.year2024.june;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MagneticForceBetweenBallsTest {
    @Test
    public void shouldReturnRequiredForceSuccess() {
        int[] input = new int[]{1,2,3,4,7};
        int m = 3;
        assertEquals(3, MagneticForceBetweenBalls.maxDistance(input, m));
    }
}
