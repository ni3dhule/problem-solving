package com.problem.solving.leetcode.dailychalange.year2024.september;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MinimumBitFlipsTest {
    @Test
    public void shouldReturnMinimumBitFlipCountSuccess() {
        assertEquals(3, MinimumBitFlips.minBitFlips(10,7));
    }
}
