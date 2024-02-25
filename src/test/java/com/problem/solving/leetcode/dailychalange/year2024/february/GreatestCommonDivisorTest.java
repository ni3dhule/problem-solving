package com.problem.solving.leetcode.dailychalange.year2024.february;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class GreatestCommonDivisorTest {
    @Test
    public void shouldReturnTrueIfPossibleToTravelBetweenPairs_Success(){
        int[] input = new int[]{2,3,6};
        Assertions.assertTrue(GreatestCommonDivisor.canTraverseAllPairs(input));
    }
}
