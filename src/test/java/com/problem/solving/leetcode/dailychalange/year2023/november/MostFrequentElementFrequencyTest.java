package com.problem.solving.leetcode.dailychalange.year2023.november;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MostFrequentElementFrequencyTest {
    @Test
    public void shouldReturnMaxFrequcy_Success(){
        int[] input = new int[] {1, 2, 4};
        int operation = 5;
        int expectedFrequency = 3;
        int actualFrequency = MostFrequentElementFrequency.maxFrequency(input,operation);
        Assertions.assertEquals(expectedFrequency, actualFrequency);
    }
}
