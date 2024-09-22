package com.problem.solving.leetcode.dailychalange.year2024.september;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthSmallestLexicographicalOrderTest {
    @Test
    public void shouldReturnSmallestLexicographicalOrderSuccess(){
        assertEquals(10, KthSmallestLexicographicalOrder.findKthNumber(13, 2));
    }
}
