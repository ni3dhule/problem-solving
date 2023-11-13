package com.problem.solving.leetcode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SortVowelsTest {
    @Test
    public void shouldReturnSortedVowels() {
        String input = "lEetcOde";
        String expectedSortedVowels = "lEOtcede";
        String actualSortedVowels = SortVowels.sortVowels(input);
        Assertions.assertEquals(expectedSortedVowels, actualSortedVowels);
    }
}
