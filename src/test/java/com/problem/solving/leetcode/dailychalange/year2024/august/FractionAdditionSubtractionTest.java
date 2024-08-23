package com.problem.solving.leetcode.dailychalange.year2024.august;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionAdditionSubtractionTest {
    @Test
    public void shouldReturnFractionAddSubSuccess() {
        assertEquals("0/1",FractionAdditionSubtraction.fractionAddition("-1/2+1/2"));
    }
}
