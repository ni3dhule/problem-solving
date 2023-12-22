package com.problem.solving.leetcode.dailychalange.december;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MaxScoreAfterSplitTest {
    @Test
    public void shouldReturnMaxScoreAfterSplit_Success(){
        String input = "011101";
        int expectedResult = 5;
        int actualResult = MaxScoreAfterSplit.maxScore(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
