package com.problem.solving.leetcode.dailychalange.year2024.may;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestPositiveWithItsNegativeTest {
    @Test
    public void shouldReturnContrasNnumber_Success(){
        int []input = new int[]{-1,2,3,-3};
        assertEquals(3, LargestPositiveWithItsNegative.findMaxK(input));
    }
}
