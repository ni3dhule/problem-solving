package com.problem.solving.leetcode.dailychalange.year2024.june;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeightCheckerTest {
    @Test
    public void shouldReturnIndexOfNonMatchingHeightSuccess(){
        assertEquals(3, HeightChecker.heightChecker(new int[]{1,1,4,2,1,3}));
    }
}
