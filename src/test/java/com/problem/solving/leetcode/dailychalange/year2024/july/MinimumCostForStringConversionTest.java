package com.problem.solving.leetcode.dailychalange.year2024.july;

import org.junit.Test;

public class MinimumCostForStringConversionTest {
    @Test
    public void shouldReturnMinimumCostForStringConversionSuccess(){
        String source = "abcd";
        String target = "acbd";
        String[] original = new String[] {"a","b","c","c","e","d"};
        String[] charged = new String[]{"b","c","b","e","b","e"};
        int[] cost = new int[]{2,5,5,1,2,20};
        //assertEquals(28, MinimumCostForStringConversion.minimumCost(source, target, original, charged, cost));
    }
}
