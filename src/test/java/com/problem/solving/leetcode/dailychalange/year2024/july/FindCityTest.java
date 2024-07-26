package com.problem.solving.leetcode.dailychalange.year2024.july;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindCityTest {
    @Test
    public void shouldReturnClosestCitySuccess() {
        int inputN0 = 4;
        int[][] edges = new int[][] {{0,1,3}, {1,2,1}, {1,3,4}, {2,3,1}};
        int distanceThreshold = 4;
        assertEquals(3, FindCity.findTheCity(inputN0, edges, distanceThreshold));
    }
}
