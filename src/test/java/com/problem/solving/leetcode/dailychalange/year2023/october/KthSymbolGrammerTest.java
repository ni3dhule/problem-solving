package com.problem.solving.leetcode.dailychalange.year2023.october;

import com.problem.solving.leetcode.dailychalange.year2023.october.KthSymbolGrammer;
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
