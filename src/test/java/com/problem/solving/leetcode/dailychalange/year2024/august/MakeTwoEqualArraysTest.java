package com.problem.solving.leetcode.dailychalange.year2024.august;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MakeTwoEqualArraysTest {
    @Test
    public void shouldReturnTrueIfEqualsSuccess() {
        int[] target = new int[]{1,2,3,4};
        int[] arr = new int[]{2,4,1,3};
        assertTrue(MakeTwoEqualArrays.canBeEqual(target, arr));
    }
}
