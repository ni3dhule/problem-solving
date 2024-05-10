package com.problem.solving.leetcode.dailychalange.year2024.may;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class SmallPrimeFractionTest {
    @Test
    public void shouldReturnSmallPrimeFractionSuccess(){
        int[] input = new int[]{1,2,3,5};
        int k = 3;
        assertArrayEquals(new int[]{2,5}, SmallPrimeFraction.kthSmallestPrimeFraction(input, k));
    }
}
