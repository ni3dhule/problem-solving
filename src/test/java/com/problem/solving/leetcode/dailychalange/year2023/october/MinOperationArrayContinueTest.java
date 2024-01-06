package com.problem.solving.leetcode.dailychalange.year2023.october;

import com.problem.solving.leetcode.dailychalange.year2023.october.MinOperationArrayContinue;
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
    @Test
    public void getMinOperationToMakeArrayContinue_2(){
        int[] input = new int[]{1,10,100,1000};
        int expectedResult = 3;
        int actualesult = MinOperationArrayContinue.minOperations(input);
        Assertions.assertEquals(expectedResult, actualesult);
    }
}
