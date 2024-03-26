package com.problem.solving.leetcode.dailychalange.year2024.march;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FirstMissingPositiveNumberTest {
    @Test
    public void shouldReturnFirstMissingPositiveNumber_Success(){
        int[] input = new int[]{1,2,0};
        int expectedMissingNumber = 3;
        int actualMissingNumber = FirstMissingPositiveNumber.firstMissingPositive(input);
        Assertions.assertEquals(expectedMissingNumber, actualMissingNumber);
    }
}
