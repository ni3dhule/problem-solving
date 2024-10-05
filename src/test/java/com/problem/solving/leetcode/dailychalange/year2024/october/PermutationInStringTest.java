package com.problem.solving.leetcode.dailychalange.year2024.october;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PermutationInStringTest {
    @Test
    public void shouldReturnTrueIfPermutationSuccess() {
        assertTrue(PermutationInString.checkInclusion("ab", "eidbaooo"));
    }
}
