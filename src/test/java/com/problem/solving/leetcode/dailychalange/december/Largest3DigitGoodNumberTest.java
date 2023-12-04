package com.problem.solving.leetcode.dailychalange.december;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Largest3DigitGoodNumberTest {
    @Test
    public void shouldReturn3DigitLargestNumber_Success(){
        String input = "6777133339";
        String expectedNumber = "777";
        String actualNumber = Largest3DigitGoodNumber.largestGoodInteger(input);
        Assertions.assertEquals(expectedNumber, actualNumber);

    }
}
