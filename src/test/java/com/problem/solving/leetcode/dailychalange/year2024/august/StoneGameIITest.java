package com.problem.solving.leetcode.dailychalange.year2024.august;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class StoneGameIITest {
    @Test
    public void shouldReturnStoneAliceSuccess() {
        assertEquals(10, StoneGameII.stoneGameII(new int[]{2,7,9,4,4}));
    }
}
