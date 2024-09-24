package com.problem.solving.leetcode.dailychalange.year2024.september;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthOfLongestCommonPrefixTest {
    @Test
    public void shouldReturnLongestPrefixLengthSuccess(){
        assertEquals(3, LengthOfLongestCommonPrefix.longestCommonPrefix(new int[]{1,10,100}, new int[]{1000}));
    }
}
