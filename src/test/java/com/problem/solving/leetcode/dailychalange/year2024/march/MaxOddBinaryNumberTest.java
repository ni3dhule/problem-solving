package com.problem.solving.leetcode.dailychalange.year2024.march;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MaxOddBinaryNumberTest {

    @Test
    public void shouldReturnMaxOddNumber_Success(){
        String input = "1010";
        String expectedMaxOddNumber = "1001";
        String actualMaxOddNumber = MaxOddBinaryNumber.maximumOddBinaryNumber(input);
        Assertions.assertEquals(expectedMaxOddNumber, actualMaxOddNumber);
    }
}
