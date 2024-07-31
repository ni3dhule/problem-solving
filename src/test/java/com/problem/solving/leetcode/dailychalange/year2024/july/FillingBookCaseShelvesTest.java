package com.problem.solving.leetcode.dailychalange.year2024.july;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FillingBookCaseShelvesTest {
    @Test
    public void shouldReturnMinimumPossibleHeightSuccess() {
        assertEquals(6, FillingBookCaseShelves.minHeightShelves(new int[][]{{1,1}, {2,3}, {2,3}, {1,1}, {1,1}, {1,2}}, 4));
    }
}
