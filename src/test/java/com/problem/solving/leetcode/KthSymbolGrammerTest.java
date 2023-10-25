package com.problem.solving.leetcode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class KthSymbolGrammerTest {
    @Test
    public void testKthSymblGrammer(){
        int n = 1;
        int k = 1;
        int expectedResult = 0;
        int actualResult = KthSymbolGrammer.kthGrammar(n, k);
        Assertions.assertTrue(expectedResult == actualResult);
    }
}
