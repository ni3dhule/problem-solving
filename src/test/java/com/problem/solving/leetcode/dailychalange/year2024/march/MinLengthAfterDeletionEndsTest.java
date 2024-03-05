package com.problem.solving.leetcode.dailychalange.year2024.march;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MinLengthAfterDeletionEndsTest {
    @Test
    public void shouldReturnMinLengthAfterDeletion_Success(){
        String input = "ca";
        int expectedMinLength = 2;
        int actualMinLength = MinLengthAfterDeletionEnds.minimumLength(input);
        Assertions.assertEquals(expectedMinLength, actualMinLength);
    }
}
