package com.problem.solving.geekforgeek;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class PairOfElementsTargetSumTest {
    //Find a pair with the given sum in an array
    @Test
    public void getPairsOfElementForTargetSumTest() {
        int []arr = new int[] {2, 4, 1, 6, 8, 9, 7, 3};
        List<String> actualResult = PairOfElementsTargetSum.getPairsOfElementForTargetSum(arr, 10);
        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("(1,9)");
        expectedResult.add("(2,8)");
        expectedResult.add("(3,7)");
        expectedResult.add("(4,6)");
        Assertions.assertTrue(actualResult.containsAll(expectedResult));
    }
}
