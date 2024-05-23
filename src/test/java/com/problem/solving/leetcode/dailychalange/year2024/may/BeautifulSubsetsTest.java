package com.problem.solving.leetcode.dailychalange.year2024.may;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeautifulSubsetsTest {
    @Test
    public void shouldReturnNumberOfBeautifulSubsetsSuccess() {
        int[] numbers = new int[]{2,4,6};
        int k= 2;
        BeautifulSubsets bs = new BeautifulSubsets();
        assertEquals(4, bs.beautifulSubsets(numbers, k));
    }
}
