package com.problem.solving.leetcode.dailychalange.year2024.august;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class RangeSumOfSortedSubArrayTest {
    @Test
    public void shouldReturnRangeSumSuccess() {
        int[] numbers = new int[]{1,2,3,4};
        int n = 4;
        int left = 1;
        int right = 5;
        assertEquals(13, RangeSumOfSortedSubArray.rangeSum(numbers, n, left, right));
    }
}
