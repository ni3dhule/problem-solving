package com.problem.solving.leetcode.dailychalange.year2024.may;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MaximumSumOfNodeValueTest {
    @Test
    public void shouldReturnMaxValueOfNodeSuccess(){
        int[] numbers = new int[]{1,2,1};
        int k = 3;
        int[][] edges = new int[][]{{0,1},{0,2}};
        Assertions.assertEquals(6, MaximumSumOfNodeValue.maximumValueSum(numbers, k, edges));
    }
}
