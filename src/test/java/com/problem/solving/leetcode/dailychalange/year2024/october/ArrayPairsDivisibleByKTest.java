package com.problem.solving.leetcode.dailychalange.year2024.october;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayPairsDivisibleByKTest {
    @Test
    public void shouldReturnTrueIfDivisibleByKSuccess(){
        assertTrue(ArrayPairsDivisibleByK.canArrange(new int[]{1,2,3,4,5,10,6,7,8,9}, 5));
    }
}
