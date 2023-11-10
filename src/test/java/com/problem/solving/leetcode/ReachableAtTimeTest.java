package com.problem.solving.leetcode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ReachableAtTimeTest {
    @Test
    public void shouldReturnTrueIfReachableInTime(){
        int sx = 2;
        int sy = 4;
        int fx = 7;
        int fy = 7;
        int t = 6;
        boolean expectedOutput = true;
        boolean actualOutput = ReachableAtTime.isReachableAtTime(sx, sy, fx, fy, t);
        Assertions.assertTrue(expectedOutput == actualOutput);
    }
}
