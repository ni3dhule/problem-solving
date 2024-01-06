package com.problem.solving.leetcode.dailychalange.year2024.january;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MaxProfitInSchedulingTest {
    @Test
    public void shouldReturnMaximumProfitInScheduling_Success(){
        int[] startTime = new int[]{1,2,3,4,6};
        int[] endTime = new int[]{3,5,10,6,9};
        int[] profit = new int[]{20,20,100,70,60};
        int expectedMaxProfit = 150;
        int actualMaxProfit = MaxProfitInScheduling.jobScheduling(startTime, endTime, profit);
        Assertions.assertEquals(expectedMaxProfit, actualMaxProfit);
    }
}
