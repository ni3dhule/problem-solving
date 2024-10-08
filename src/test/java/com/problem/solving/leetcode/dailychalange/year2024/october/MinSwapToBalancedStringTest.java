package com.problem.solving.leetcode.dailychalange.year2024.october;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinSwapToBalancedStringTest {
    @Test
    public void shouldReturnMinNoOfSwapSuccess(){
        assertEquals(1, MinSwapToBalancedString.minSwaps("][]["));
    }
}
