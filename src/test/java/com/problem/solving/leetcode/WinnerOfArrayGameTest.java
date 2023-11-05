package com.problem.solving.leetcode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class WinnerOfArrayGameTest {
    @Test
    public void shouldReturnTheWinnerElementOfArrayGame() {
        int[] inputArray = new int[]{2,1,3,5,4,6,7};
        int consecutiveWins = 2;
        int expectedWinnerItem = 5;
        int actualWinnerItem = WinnerOfArrayGame.getWinner(inputArray, consecutiveWins);
        Assertions.assertEquals(expectedWinnerItem, actualWinnerItem);
    }
}
