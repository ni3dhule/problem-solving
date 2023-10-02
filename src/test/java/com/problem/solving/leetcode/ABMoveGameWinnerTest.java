package com.problem.solving.leetcode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ABMoveGameWinnerTest {
    @Test
    public void findMoveWinnerPositiveTest() {
        String colors = "AAABABB";
        boolean expectedResult = true;
        boolean actualResult = ABMoveGameWinner.winnerOfGame(colors);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
