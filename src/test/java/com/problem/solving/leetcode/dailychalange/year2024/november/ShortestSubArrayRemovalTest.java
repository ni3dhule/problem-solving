package com.problem.solving.leetcode.dailychalange.year2024.november;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ShortestSubArrayRemovalTest {
    @Test
    public void shouldReturnLengthOfRemovalSubArraySuccess() {
        assertEquals(3, ShortestSubArrayRemoval.findLengthOfShortestSubarray(new int[]{1,2,3,10,4,2,3,5}));
    }
}
