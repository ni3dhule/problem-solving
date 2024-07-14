package com.problem.solving.leetcode.dailychalange.year2024.july;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfAtomsTest {
    @Test
    public void shouldReturnNumberOfAtomsSuccess(){
        String inputFormula = "K4(ON(SO3)2)2";
        assertEquals("K4N2O14S4", NumberOfAtoms.countOfAtoms(inputFormula));
    }
}
