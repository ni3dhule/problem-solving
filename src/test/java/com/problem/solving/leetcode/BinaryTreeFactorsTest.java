package com.problem.solving.leetcode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BinaryTreeFactorsTest {
    @Test
    public void shouldGiveBinaryTreeFactors() {
        int[] input = new int[]{2, 4};
        int expectedFactor = 3;
        int actualFactor = BinaryTreeFactors.numFactoredBinaryTrees(input);
        Assertions.assertTrue(expectedFactor == actualFactor);
    }
}
