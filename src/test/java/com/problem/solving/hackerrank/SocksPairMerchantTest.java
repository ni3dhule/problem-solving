package com.problem.solving.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SocksPairMerchantTest {

    @Test
    public void testCase1(){
        int number = 15;
        Integer[] input = new Integer[] {6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5};
        int resultPairs = SocksPairMerchant.socksPairMerchant(number, Arrays.asList(input));
    }



}
