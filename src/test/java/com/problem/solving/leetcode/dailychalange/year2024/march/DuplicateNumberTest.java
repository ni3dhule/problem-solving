package com.problem.solving.leetcode.dailychalange.year2024.march;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class DuplicateNumberTest {
    @Test
    public void shouldReturnDuplicateNumber_Success(){
        int[] input = new int[]{1,3,4,2,2};
        int expectedDuplicateNumber = 2;
        int actualDuplicateNumber = DuplicateNumber.findDuplicate(input);
        Assertions.assertEquals(expectedDuplicateNumber, actualDuplicateNumber);
    }
}
