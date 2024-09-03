package com.problem.solving.leetcode.dailychalange.year2024.september;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfDigitsAfterConvertTest {
    @Test
    public void shouldReturnSumNumberSuccess() {
        assertEquals(36, SumOfDigitsAfterConvert.getLucky("iiii", 1));
    }
}
