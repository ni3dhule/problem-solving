package com.problem.solving.leetcode.dailychalange.year2024.april;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WonderfulSubStringTest {
    @Test
    public void shouldReturnWonderfulStringCount_Success(){
        String inputString = "aba";
        assertEquals(4, WonderfulSubString.wonderfulSubstrings(inputString));
    }
}
