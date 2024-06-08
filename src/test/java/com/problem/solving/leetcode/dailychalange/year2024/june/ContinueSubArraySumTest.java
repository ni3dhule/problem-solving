package com.problem.solving.leetcode.dailychalange.year2024.june;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContinueSubArraySumTest {
    @Test
    public void shouldReturnTrueIfFindSubArrayWithKSumSuccess() {
        assertTrue(ContinueSubArraySum.checkSubArraySum(new int[]{23,2,4,6,7}, 6));
    }
}
