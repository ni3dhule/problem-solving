package com.problem.solving.leetcode.dailychalange.year2024.september;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsistentStringCountTest {
    @Test
    public void shouldReturnCountConsistentStringSuccess() {
        assertEquals(2, ConsistentStringCount.countConsistentStrings("ab", new String[]{"ad","bd","aaab","baa","badab"}));
    }
}
