package com.problem.solving.leetcode.dailychalange.year2024.october;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakeSumDivisibleByPTest {
    @Test
    public void shouldReturnSumDivisibleByPSuccess() {
        assertEquals(1, MakeSumDivisibleByP.minSubArray(new int[]{3,1,4,2}, 6));
    }
}
