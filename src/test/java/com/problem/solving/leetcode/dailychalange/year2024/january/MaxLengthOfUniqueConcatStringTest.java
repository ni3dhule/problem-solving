package com.problem.solving.leetcode.dailychalange.year2024.january;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class MaxLengthOfUniqueConcatStringTest {
    @Test
    public void shouldReturnMaxLengthOfConcatString_Success(){
        String[] input = new String[]{"un","iq","ue"};
        int expectedOutput = 4;
        int actualOutput = MaxLengthOfUniqueConcatString.maxLength(Arrays.asList(input));
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}
