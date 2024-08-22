package com.problem.solving.leetcode.dailychalange.year2024.august;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberComplementTest {
    @Test
    public void shouldReturnComplementNumberSuccess(){
        assertEquals(2, NumberComplement.findComplement(5));
    }
}
