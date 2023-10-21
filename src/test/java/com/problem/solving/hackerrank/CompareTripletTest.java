package com.problem.solving.hackerrank;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareTripletTest {
    @Test
    public void compareTriplets_positive_test() {
        Integer[] alice = new Integer[] {5, 6, 7};
        Integer[] bob = new Integer[]{3,6,10};
        List<Integer> expectedList = Arrays.asList(1,1);
        List<Integer> actualResult = CompareTriplet.compareTriplets(Arrays.asList(alice), Arrays.asList(bob));
        Assertions.assertTrue(expectedList.size() == actualResult.size()
                && expectedList.containsAll(actualResult)
                && actualResult.containsAll(expectedList));
    }
}
