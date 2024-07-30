package com.problem.solving.leetcode.dailychalange.year2024.july;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumDeletionToMakeBalanceStringTest {
    @Test
    public void shouldReturnMinimumDeletionCountSuccess(){
        assertEquals(2, MinimumDeletionToMakeBalanceString.minimumDeletions("aababbab"));
    }
}
