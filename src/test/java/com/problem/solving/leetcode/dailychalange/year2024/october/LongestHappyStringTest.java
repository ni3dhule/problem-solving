package com.problem.solving.leetcode.dailychalange.year2024.october;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestHappyStringTest {
    @Test
    public void shouldReturnHappyStringSuccess(){
        assertEquals("ccaccbcc", LongestHappyString.longestDiverseString(1,1,7));
    }
}
