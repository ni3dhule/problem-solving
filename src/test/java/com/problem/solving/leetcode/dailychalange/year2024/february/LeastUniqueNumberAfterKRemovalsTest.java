package com.problem.solving.leetcode.dailychalange.year2024.february;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class LeastUniqueNumberAfterKRemovalsTest {
    @Test
    public void shouldReturnLeastNumberCountAfterKRemovals_Success(){
        int[] input = new int[]{5,5,4};
        int k = 1;
        int expectedUniqueLeastElement  = 1;
        int actualLeastUniqueElements = LeastUniqueNumberAfterKRemovals.findLeastNumOfUniqueInts(input, k);
        Assertions.assertEquals(expectedUniqueLeastElement, actualLeastUniqueElements);
    }
}
