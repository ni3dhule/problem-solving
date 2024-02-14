package com.problem.solving.leetcode.dailychalange.year2024.february;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ReArrangeArrayBySignTest {
    @Test
    public void shouldReturnReArrangedArrayBySign_Success(){
        int[] input = new int[] {3,1,-2,-5,2,-4};
        int[] expectedArray = new int[]{3,-2,1,-5,2,-4};
        int[] actualArray = ReArrangeArrayBySign.rearrangeArray(input);
        Assertions.assertArrayEquals(expectedArray, actualArray);
    }
}
