package com.problem.solving.leetcode.dailychalange.year2024.july;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassThePillowTest {
    @Test
    public void shouldReturnIndexOfPersonHoldingPillowSuccess() {
        int persons = 4;
        int time = 5;
        assertEquals(2, PassThePillow.passThePillow(persons, time));
    }
}
