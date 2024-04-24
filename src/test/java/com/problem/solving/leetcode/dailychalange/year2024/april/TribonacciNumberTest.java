package com.problem.solving.leetcode.dailychalange.year2024.april;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TribonacciNumberTest {
    @Test
    public void shouldReturnTribonacciNumber_Success() {
        int n = 4;
        Assertions.assertEquals(4, TribonacciNumber.tribonacci(n));
    }
}
