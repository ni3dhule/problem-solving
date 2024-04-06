package com.problem.solving.leetcode.dailychalange.year2024.april;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MinimumRemoveForValidParenthesisTest {
    @Test
    public void shouldReturnValidParenthesisString_Success(){
        String input = "lee(t(c)o)de)";
        String exectedValidString = "lee(t(c)o)de";
        String actualValidString = MinimumRemoveForValidParenthesis.minRemoveToMakeValid(input);
        Assertions.assertEquals(exectedValidString, actualValidString);
    }
}
