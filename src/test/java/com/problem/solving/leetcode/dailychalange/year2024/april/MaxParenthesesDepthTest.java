package com.problem.solving.leetcode.dailychalange.year2024.april;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MaxParenthesesDepthTest {
    @Test
    public void shouldReturnMaxDepthOfParentheses_Success(){
        String inputParenthesesString = "(1+(2*3)+((8)/4))+1";
        int expectedDepth = 3;
        int actualDepth = MaxParenthesesDepth.maxDepth(inputParenthesesString);
        Assertions.assertEquals(expectedDepth, actualDepth);
    }
}
