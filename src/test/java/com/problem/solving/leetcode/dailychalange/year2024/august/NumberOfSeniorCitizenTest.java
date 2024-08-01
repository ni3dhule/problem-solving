package com.problem.solving.leetcode.dailychalange.year2024.august;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfSeniorCitizenTest {
    @Test
    public void shouldReturnNumberOfSeniorCitizenSuccess() {
        String[] details = new String[]{"7868190130M7522","5303914400F9211","9273338290F4010"};
        assertEquals(2, NumberOfSeniorCitizen.countSeniors(details));
    }
}
