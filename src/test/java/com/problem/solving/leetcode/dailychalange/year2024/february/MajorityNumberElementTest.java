package com.problem.solving.leetcode.dailychalange.year2024.february;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MajorityNumberElementTest {
    @Test
    public void shouldReturnElementWithMajorityInArray_Success(){
        int[] input = new int[]{3,2,3};
        int expectedMajorityElement = 3;
        int actualMajorityElement = MajorityNumberElement.majorityElement(input);
        Assertions.assertEquals(expectedMajorityElement, actualMajorityElement);
    }
}
