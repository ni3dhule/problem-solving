package com.problem.solving.leetcode.dailychalange.year2024.november;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class StringCompressionTest {
    @Test
    public void shouldReturnCompressedStringSuccess(){
        assertEquals("1a1b1c1d1e", StringCompression.compressedString("abcde"));
    }
}
