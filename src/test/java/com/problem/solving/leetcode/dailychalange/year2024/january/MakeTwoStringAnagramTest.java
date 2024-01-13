package com.problem.solving.leetcode.dailychalange.year2024.january;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MakeTwoStringAnagramTest {
    @Test
    public void shouldReturnMinimumStepsToMakeAnagram_Success(){
        String source = "bab";
        String destination = "aba";
        int expectedMinSteps = 1;
        int actualMinSteps = MakeTwoStringAnagram.minSteps(source, destination);
        Assertions.assertEquals(expectedMinSteps, actualMinSteps);
    }
}
