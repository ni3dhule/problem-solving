package com.problem.solving.leetcode.dailychalange.year2024.january;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class OperationToMakeEmptyArrayTest {
    @Test
    public void shouldReturnMinNumberToMakeEmptyArray_Success(){
        int[] input =new int[]{2,3,3,2,2,4,2,3,4};
        int expectedMinOperation = 4;
        int actualMinOperation = OperationToMakeEmptyArray.minOperations(input);
        Assertions.assertEquals(expectedMinOperation, actualMinOperation);
    }
}
