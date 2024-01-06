package com.problem.solving.leetcode.dailychalange.year2023.september;

import com.problem.solving.leetcode.dailychalange.year2023.september.SortVowels;
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
