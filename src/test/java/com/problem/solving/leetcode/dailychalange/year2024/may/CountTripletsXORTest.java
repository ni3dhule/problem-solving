package com.problem.solving.leetcode.dailychalange.year2024.may;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTripletsXORTest {
    @Test
    public void shouldReturnCountTripletsXORSuccess(){
        assertEquals(4, CountTripletsXOR.countTriplets(new int[]{2,3,1,6,7}));
    }
}
