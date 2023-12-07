package com.problem.solving.leetcode.dailychalange.december;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class LargestOddNumberTest {
    @Test
    public void shouldReturnLargestNumber_Success() {
        String input = "52";
        String expectedLargestNumber = "5";
        String actualLargestNumber = LargestOddNumber.largestOddNumber(input);
        Assertions.assertEquals(expectedLargestNumber, actualLargestNumber);
    }
}
