package com.problem.solving.leetcode.dailychalange.year2024.june;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppendCharacterToMakeSubSequenceTest {
    @Test
    public void shouldReturnCharacterCountsSuccess() {
        assertEquals(4, AppendCharacterToMakeSubSequence.appendCharacters("coaching", "coding"));
    }
}
