package com.problem.solving.leetcode.dailychalange.year2024.february;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FindMissingNumberInArrayTest {
    @Test
    public void shouldReturnMissingNumberFromArray_Success(){
        int[] inputs = new int[]{3,0,1};
        int expectedMissingNumber = 2;
        int actualMissingNumber = FindMissingNumberInArray.missingNumber(inputs);
        Assertions.assertEquals(expectedMissingNumber, actualMissingNumber);
    }
}
