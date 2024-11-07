package com.problem.solving.leetcode.dailychalange.year2024.november;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class LargestCombinationBitwiseANDTest {
    @Test
    public void shouldReturnLargestCombinationSuccess() {
        assertEquals(4, LargestCombinationBitwiseAND.largestCombination(new int[]{16,17,71,62,12,24,14}));
    }
}
