package com.problem.solving.leetcode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MinOperationArrayContinueTest {
    @Test
    public void getMinOperationToMakeArrayContinue(){
        int[] input = new int[]{4,2,5,3};
        int expectedResult = 0;
        int actualesult = MinOperationArrayContinue.minOperations(input);
        Assertions.assertEquals(expectedResult, actualesult);
    }
}
