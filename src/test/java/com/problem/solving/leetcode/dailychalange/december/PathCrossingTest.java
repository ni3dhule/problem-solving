package com.problem.solving.leetcode.dailychalange.december;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PathCrossingTest {
    @Test
    public void shouldReturnTrueIfPathCrossed_Success(){
        String input = "NES";
        boolean actualResult = PathCrossing.isPathCrossing(input);
        Assertions.assertFalse(actualResult);
    }
}
