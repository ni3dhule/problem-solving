package com.problem.solving.leetcode.dailychalange.year2024.june;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GrumpyBookStoreOwnerTest {
    @Test
    public void shouldReturnMaximumSatisfiedCustomerCountSuccess() {
        int[] customer = new int[]{1,0,1,2,1,1,7,5};
        int[] grumpy = new int[]{0,1,0,1,0,1,0,1};
        int minutes = 3;
        assertEquals(16, GrumpyBookStoreOwner.maxSatisfied(customer, grumpy, minutes));
    }
}
