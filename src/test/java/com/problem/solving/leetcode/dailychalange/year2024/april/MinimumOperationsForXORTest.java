package com.problem.solving.leetcode.dailychalange.year2024.april;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumOperationsForXORTest {
    @Test
    public void shouldReturnNumberOfOperationForXOR_Success(){
        int[] input = new int[]{2,1,3,4};
        int k = 1;
        assertEquals(2, MinimumOperationsForXOR.minOperations(input, k));
    }
}
