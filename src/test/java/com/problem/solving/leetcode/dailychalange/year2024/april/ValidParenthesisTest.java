package com.problem.solving.leetcode.dailychalange.year2024.april;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ValidParenthesisTest {
    @Test
    public void shouldReturnTrueOnValidParenthesis_Success(){
        String input = "()";
        Assertions.assertTrue(ValidParenthesis.checkValidString(input));
    }
}
