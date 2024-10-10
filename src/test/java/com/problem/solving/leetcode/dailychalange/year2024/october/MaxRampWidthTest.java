package com.problem.solving.leetcode.dailychalange.year2024.october;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MaxRampWidthTest {
    @Test
    public void shouldReturnMaxWidthOfRampSuccess(){
        assertEquals(4, MaxRampWidth.maxWidthRamp(new int[]{6,0,8,2,1,5}));
    }
}
