package com.problem.solving.leetcode.dailychalange.year2023.december;

import com.problem.solving.leetcode.dailychalange.december.TimeToMakeRope;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TimeToMakeRopeTest {
    @Test
    public void shouldReturnTimeToMakeRope_Success(){
        String colors = "abaac";
        int[] timeNeeded = new int[]{1,2,3,4,5};
        int expectedTime = 3;
        int actualTime = TimeToMakeRope.minCost(colors, timeNeeded);
        Assertions.assertEquals(expectedTime, actualTime);
    }
}
