package com.problem.solving.leetcode.dailychalange.year2024.june;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContinuousLongestSubArrayTest {
    @Test
    public void shouldReturnLengthOfLongestArraySuccess(){
        int[] input = new int[]{8,2,4,7};
        int limit = 4;
        assertEquals(2, ContinuousLongestSubArray.longestSubArray(input, limit));
        Integer x = 10;
        Integer y = 20;
        Map<String, Object> map = new HashMap<>();
        System.out.println("x : "+x +" | y : "+y);
        System.out.println("Map Before Swap : "+map);
        swap(x, y, map);
        System.out.println("Map After Swap : "+map);
        System.out.println("x : "+x +" | y : "+y);
    }

    private void swap(Integer a, Integer b, Map<String, Object> result){
        System.out.println(" Before Swap : a : "+a+" | b : "+b+" Map : "+result);
        Integer t = a;
        a=b;
        b=t;
        result.put("x:", a);
        System.out.println(" After Swap : a : "+a+" | b : "+b+" Map : "+result);
    }
}

