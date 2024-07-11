package com.problem.solving.leetcode.dailychalange.year2024.july;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseSubStringInParenthesesTest {
    @Test
    public void shouldReturnReverseStringSuccess(){
        assertEquals("dcba", ReverseSubStringInParentheses.reverseParentheses("(abcd)"));
    }
}
