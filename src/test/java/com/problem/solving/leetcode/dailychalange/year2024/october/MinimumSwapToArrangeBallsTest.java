package com.problem.solving.leetcode.dailychalange.year2024.october;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumSwapToArrangeBallsTest {
    @Test
    public void shouldReturnMinimumSwapCountSuccess() {
        assertEquals(1, MinimumSwapToArrangeBalls.minimumSteps("101"));
    }
}
