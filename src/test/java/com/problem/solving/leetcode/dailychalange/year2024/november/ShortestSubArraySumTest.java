package com.problem.solving.leetcode.dailychalange.year2024.november;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ShortestSubArraySumTest {
    @Test
    public void shouldReturnSubArrayCountSuccess(){
        assertEquals(1, ShortestSubArraySum.shortestSubArray(new int[]{1}, 1));
    }
}
