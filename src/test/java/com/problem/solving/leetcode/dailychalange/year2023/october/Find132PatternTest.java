package com.problem.solving.leetcode.dailychalange.year2023.october;

import com.problem.solving.leetcode.dailychalange.year2023.october.Find132Pattern;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Find132PatternTest {
    @Test
    public void find132PatternNegativeTestCase(){
        int[] input = new int[] {1,2,3,4};
        boolean expectedResult = false;
        boolean actualResult = Find132Pattern.is132Pattern(input);
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void find132PatternPositiveTestCase(){
        int[] input = new int[] {3,1,4,2};
        boolean expectedResult = true;
        boolean actualResult = Find132Pattern.is132Pattern(input);
        Assertions.assertEquals(actualResult, expectedResult);
    }

}
