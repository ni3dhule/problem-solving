package com.problem.solving.leetcode.dailychalange.year2024.january;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UniqueNumberOccurrencesTest {
    @Test
    public void shouldReturnUniqueNumberOccurrences_Success(){
        int[] input = new int[]{1,2};
        boolean expectedResult = false;
        boolean actualResult = UniqueNumberOccurrences.uniqueOccurrences(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
