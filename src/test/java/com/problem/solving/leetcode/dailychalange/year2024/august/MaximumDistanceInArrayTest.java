package com.problem.solving.leetcode.dailychalange.year2024.august;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumDistanceInArrayTest {
    @Test
    public void shouldReturnMaximumDistanceInArraySuccess() {
        List<List<Integer>> list = Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5), Arrays.asList(1,2,3));
        assertEquals(4, MaximumDistanceInArray.maxDistance(list));
    }
}
