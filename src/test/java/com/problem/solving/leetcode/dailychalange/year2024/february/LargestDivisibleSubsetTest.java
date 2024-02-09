package com.problem.solving.leetcode.dailychalange.year2024.february;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubsetTest {
    @Test
    public void shouldReturnDivisibleSubset_Success(){
        int[] input = new int[]{1,2,3};
        List<Integer> expectedSubset = Arrays.asList(2,1);
        System.out.println("Expected : "+expectedSubset.stream().toArray());
        expectedSubset.stream().forEach(System.out::println);
        List<Integer> actualSubset = LargestDivisibleSubset.largestDivisibleSubset(input);
        actualSubset.stream().forEach(System.out::println);
        Assertions.assertArrayEquals(expectedSubset.toArray(), actualSubset.toArray());
    }
}
