package com.problem.solving.leetcode.dailychalange.year2023.september;

import com.problem.solving.leetcode.dailychalange.year2023.september.SearchTargetIndex;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SearchTargetIndexTest {
    @Test
    public void searchTargetIndexPositiveTestCase(){
        int[] input = new int[]{5,7,7,8,8,10};
        int target = 8;
        int[] expectedResult = new int[]{3, 4};
        int[] actualResult = SearchTargetIndex.searchRange(input, target);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
