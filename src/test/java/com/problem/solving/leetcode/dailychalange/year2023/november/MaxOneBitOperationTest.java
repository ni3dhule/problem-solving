package com.problem.solving.leetcode.dailychalange.year2023.november;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MaxOneBitOperationTest {
    @Test
    public void shouldReturnMaxOperationCount_Success(){
        int input =3;
        int expectedResult = 2;
        int actualResult = MaxOneBitOperation.minimumOneBitOperations(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
