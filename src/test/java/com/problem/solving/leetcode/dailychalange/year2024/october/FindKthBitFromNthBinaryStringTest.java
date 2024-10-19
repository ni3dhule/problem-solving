package com.problem.solving.leetcode.dailychalange.year2024.october;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FindKthBitFromNthBinaryStringTest {
    @Test
    public void shouldReturnKthBitSuccess(){
        assertEquals('0', FindKthBitFromNthBinaryString.findKthBit(3, 1));
    }
}
