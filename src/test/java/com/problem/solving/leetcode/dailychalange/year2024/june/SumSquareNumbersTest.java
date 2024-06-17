package com.problem.solving.leetcode.dailychalange.year2024.june;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SumSquareNumbersTest {
    @Test
    public void shouldReturnTrueIfGivenNumberIsSumOfSquareOfNumbersSuccess() {
        int input = 5;
        assertTrue(SumSquareNumbers.judgeSquareSum(input));
    }
}
