package com.problem.solving.leetcode.dailychalange.year2024.march;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SubArrayWhereMaxElementAppearsKTimeTest {
    @Test
    public void shouldReturnSubArrayCount_Success(){
        int[] input = new int[]{1,3,2,3,3};
        int k = 2;
        long expectedCount = 6;
        long actualCount = SubArrayWhereMaxElementAppearsKTime.countSubArrays(input, k);
        Assertions.assertEquals(expectedCount, actualCount);
    }
}
