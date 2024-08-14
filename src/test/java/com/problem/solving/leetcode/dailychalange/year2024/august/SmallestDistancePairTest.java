package com.problem.solving.leetcode.dailychalange.year2024.august;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallestDistancePairTest {
    @Test
    public void shouldReturnSmallestDistancePairSuccess() {
        assertEquals(0, SmallestDistancePair.smallestDistancePair(new int[]{1,3,1}, 1));
    }
}
