package com.problem.solving.leetcode.dailychalange.year2024.september;
import com.problem.solving.leetcode.dailychalange.LargestNumber;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class LargestNumberTest {
    @Test
    public void shouldReturnLargestNumberSuccess() {
        assertEquals("210", LargestNumber.largestNumber(new int[]{10,2}));
    }
}
