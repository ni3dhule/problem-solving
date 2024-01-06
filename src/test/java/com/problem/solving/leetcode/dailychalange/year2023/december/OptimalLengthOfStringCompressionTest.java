package com.problem.solving.leetcode.dailychalange.year2023.december;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class OptimalLengthOfStringCompressionTest {
    @Test
    public void shouldReturnTheOptimalLength_Success(){
        String input = "aaabcccd";
        int k = 2;
        int expectedReult = 4;
        int actualResult = OptimalLengthOfStringCompression.getLengthOfOptimalCompression(input, k);
        Assertions.assertEquals(expectedReult, actualResult);
    }
}
