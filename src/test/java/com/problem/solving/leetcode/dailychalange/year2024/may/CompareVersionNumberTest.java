package com.problem.solving.leetcode.dailychalange.year2024.may;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareVersionNumberTest {
    @Test
    public void shouldCompareVersionNumberSuccess() {
        String version1 = "1.01";
        String version2 = "1.001";
        assertEquals(0, CompareVersionNumber.compareVersion(version1, version2));
    }
}
