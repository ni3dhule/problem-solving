package com.problem.solving.leetcode.dailychalange.november;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MaxCoinCollectedTest {
    @Test
    public void shouldReturnMaxCoinCount(){
        int[] input = new int[]{2,4,1,2,7,8};
        int expectedCoinCount = 9;
        int actualCoinCount = MaxCoinCollected.maxCoins(input);
        Assertions.assertEquals(expectedCoinCount, actualCoinCount);

    }

}
