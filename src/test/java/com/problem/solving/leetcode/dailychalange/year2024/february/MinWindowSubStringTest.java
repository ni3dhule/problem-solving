package com.problem.solving.leetcode.dailychalange.year2024.february;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MinWindowSubStringTest {
    @Test
    public void shouldReturnMinWindowSubString_Success(){
        String input = "ADOBECODEBANC";
        String target = "ABC";
        String expectedOutput = "BANC";
        String actualOutput = MinWindowSubString.minWindow(input,  target);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}
