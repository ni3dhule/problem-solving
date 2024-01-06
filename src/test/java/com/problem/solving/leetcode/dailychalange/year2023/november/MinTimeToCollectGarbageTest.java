package com.problem.solving.leetcode.dailychalange.year2023.november;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MinTimeToCollectGarbageTest {
    @Test
    public void shouldReturnMinTimeReqToCollectGarbage_Success() {
        String[] garbage = new String[]{"G","P","GP","GG"};
        int[] travelTime = new int[]{2, 4, 3};
        int expectedMinTime = 21;
        int actualMinTime = MinTimeToCollectGarbage.garbageCollection(garbage, travelTime);
        Assertions.assertEquals(expectedMinTime, actualMinTime);
    }
}
