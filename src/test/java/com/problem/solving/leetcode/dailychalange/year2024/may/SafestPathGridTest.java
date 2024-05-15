package com.problem.solving.leetcode.dailychalange.year2024.may;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SafestPathGridTest {
    @Test
    public void shouldReturnSafestPathInGridSuccess() {
        List<List<Integer>> grid = Arrays.asList(Arrays.asList(1,0,0), Arrays.asList(0,0,0), Arrays.asList(0,0,1));
        assertEquals(0, SafestPathGrid.maximumSafenessFactor(grid));
    }
}
