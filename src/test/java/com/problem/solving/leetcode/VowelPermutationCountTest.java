package com.problem.solving.leetcode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class VowelPermutationCountTest {
    @Test
    public void testVowelPermutationCount() {
        int inputNo = 1;
        int expectedResult = 5;
        int actualResult = VowelPermutationCount.countVowelPermutation(inputNo);
        Assertions.assertEquals(expectedResult, actualResult);

    }
}
