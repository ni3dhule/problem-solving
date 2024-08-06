package com.problem.solving.leetcode.dailychalange.year2024.august;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumPushesWordIITest {
    @Test
    public void shouldReturnMinimumPushesSuccess() {
        assertEquals(5, MinimumPushesWordII.minimumPushes("abcde"));
    }
}
