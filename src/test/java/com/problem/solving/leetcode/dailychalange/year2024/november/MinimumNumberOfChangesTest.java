package com.problem.solving.leetcode.dailychalange.year2024.november;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumNumberOfChangesTest {
    @Test
    public void shouldReturnMinimumChangesCountSuccess() {
        assertEquals(2, MinimumNumberOfChanges.minChanges("1001"));
    }
}
