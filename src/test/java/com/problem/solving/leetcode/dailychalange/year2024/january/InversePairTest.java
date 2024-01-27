package com.problem.solving.leetcode.dailychalange.year2024.january;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class InversePairTest {
    @Test
    public void shouldReturnNumberOfInversePairs_Success(){
        int n = 3;
        int k = 0;
        int expectedNumberOfPairs = 1;
        int actualNumberOfPairs = InversePair.kInversePairs(n, k);
        Assertions.assertEquals(expectedNumberOfPairs, actualNumberOfPairs);
    }
}
