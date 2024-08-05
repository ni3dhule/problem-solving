package com.problem.solving.leetcode.dailychalange.year2024.august;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthDistinctStringArrayTest {
    @Test
    public void shouldReturnKthDistinctStringSuccess(){
        String arr[] = new String[]{"d","b","c","b","c","a"};
        int kPosition = 2;
        assertEquals("a", KthDistinctStringArray.kthDistinct(arr, kPosition));
    }
}
