package com.problem.solving.leetcode.dailychalange.year2024.november;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ShortestSubArrayTest {
    @Test
    public void shouldReturnShortestSubArraySubArraySuccess() {
        assertEquals(1, ShortestSubArray.minimumSubArrayLength(new int[]{1,2,4}, 2));
    }
}
