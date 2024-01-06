package com.problem.solving.leetcode.dailychalange.year2023.november;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalOrderTraversalTest {
    @Test
    public void shouldReturnDiagonalTraversOrder(){
        Integer[] a =new Integer[]{1,2,3};
        List<Integer> al1 = Arrays.asList(a);
        Integer[] b =new Integer[]{4,5,6};
        List<Integer> al2 = Arrays.asList(b);
        Integer[] c =new Integer[]{7,8,9};
        List<Integer> al3 = Arrays.asList(c);
        List<List<Integer>> in = new ArrayList<>();
        in.add(al1);
        in.add(al2);
        in.add(al3);

        int[] expectedResult = new int[]{1,4,2,7,5,3,8,6,9};
        int[] actualResult = DiagonalOrderTraversal.findDiagonalOrder(in);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
