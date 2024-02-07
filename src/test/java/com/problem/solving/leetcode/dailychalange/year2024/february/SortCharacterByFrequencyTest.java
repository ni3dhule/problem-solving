package com.problem.solving.leetcode.dailychalange.year2024.february;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SortCharacterByFrequencyTest {
    @Test
    public void shouldReturnSortedCharacterFrequency_Success(){
        String input = "tree";
        String expectedCharFrequency = "eert";
        String actualCharFrequency = SortCharacterByFrequency.frequencySort(input);
        Assertions.assertEquals(expectedCharFrequency, actualCharFrequency);
    }
}
