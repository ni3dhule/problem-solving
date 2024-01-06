package com.problem.solving.leetcode.dailychalange.year2023.december;

import com.problem.solving.leetcode.dailychalange.december.RedistributeCharacterToMakeStringEqual;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class RedistributeCharacterToMakeStringEqualTest {
    @Test
    public void shouldReturnTrueIfFoundEqualStringAfterRedistribution_Success() {
        String[] input = new String[]{"abc","aabc","bc"};
        boolean expectedResult = true;
        boolean actualResult = RedistributeCharacterToMakeStringEqual.makeEqual(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
