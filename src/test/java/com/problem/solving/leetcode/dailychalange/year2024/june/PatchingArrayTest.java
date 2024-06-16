package com.problem.solving.leetcode.dailychalange.year2024.june;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatchingArrayTest {
    @Test
    public void shouldReturnMinimumPatchesRequiredSuccess(){
        int[] inputArr = new int[]{1,3};
        int n = 6;
        assertEquals(1, PatchingArray.minPatches(inputArr, n));
    }
}
