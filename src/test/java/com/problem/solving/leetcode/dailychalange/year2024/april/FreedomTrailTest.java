package com.problem.solving.leetcode.dailychalange.year2024.april;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FreedomTrailTest {
    @Test
    public void shouldReturnRotateSteps_Success(){
        String input = "godding";
        String key = "gd";
        assertEquals(4, FreedomTrail.findRotateSteps(input, key));
    }
}
