package com.problem.solving.leetcode.dailychalange.year2024.may;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecialArrayTest {
    @Test
    public void shouldReturnSpecialNumberOfArraySuccess(){
        int[] numbers = new int[]{3,5};
        assertEquals(2, SpecialArray.specialArray(numbers));
    }
}
