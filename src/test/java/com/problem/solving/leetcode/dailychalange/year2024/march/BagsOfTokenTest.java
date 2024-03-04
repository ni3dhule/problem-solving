package com.problem.solving.leetcode.dailychalange.year2024.march;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BagsOfTokenTest {
    @Test
    public void shouldReturnMaximumTokenAmount_Success(){
        int[] input = new int[]{100};
        int token = 50;
        int expectedMaxSumToken = 0;
        int actualMaxSumToken = BagsOfToken.bagOfTokensScore(input, token);
        Assertions.assertEquals(expectedMaxSumToken, actualMaxSumToken);
    }
}
