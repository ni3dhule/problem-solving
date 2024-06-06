package com.problem.solving.leetcode.dailychalange.year2024.june;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HandOfStraightsTest {
    @Test
    public void shouldReturnTrueIfStraightHandsSuccess(){
        assertTrue(HandOfStraights.isNStraightHand(new int[]{1,2,3,6,2,3,4,7,8}, 3));
    }
}
