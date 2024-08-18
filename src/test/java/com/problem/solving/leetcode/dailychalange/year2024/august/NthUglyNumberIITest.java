package com.problem.solving.leetcode.dailychalange.year2024.august;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NthUglyNumberIITest {
    @Test
    public void shouldReturnNthUglySuccess() {
        assertEquals(12, NthUglyNumberII.nthUglyNumber(10));
    }
}
