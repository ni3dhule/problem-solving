package com.problem.solving.leetcode.dailychalange.year2024.november;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class FindIfArrayCanSortedTest {
    @Test
    public void shouldReturnTrueIfArrayIsSortableSuccess() {
        assertTrue(FindIfArrayCanSorted.canSortArray(new int[]{8,4,2,30,15}));
    }
}
