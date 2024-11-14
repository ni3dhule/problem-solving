package com.problem.solving.leetcode.dailychalange.year2024.november;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MinimizedMaximizedProductTest {
    @Test
    public void shouldReturnMinimizedMaxProductSuccess(){
        assertEquals(3, MinimizedMaximizedProduct.minimizedMaximum(6, new int[]{11,6}));
    }
}
