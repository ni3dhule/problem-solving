package com.problem.solving.leetcode.dailychalange.year2024.august;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LemonadeChangeTest {
    @Test
    public void shouldReturnTrueForLemonadeChangeSuccess() {
        assertTrue(LemonadeChange.lemonadeChange(new int[]{5,5,5,10,20}));
    }
}
