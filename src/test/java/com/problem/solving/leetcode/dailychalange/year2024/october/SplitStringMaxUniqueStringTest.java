package com.problem.solving.leetcode.dailychalange.year2024.october;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SplitStringMaxUniqueStringTest {
    @Test
    public void shouldReturnMaxUniqueSubStringSuccess() {
        assertEquals(5, SplitStringMaxUniqueString.maxUniqueSplit("ababccc"));
    }
}
