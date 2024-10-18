package com.problem.solving.leetcode.dailychalange.year2024.october;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CountBitWiseORTest {
    @Test
    public void shouldReturnCountOfBitWiseORSuccess() {
        assertEquals(2, CountBitWiseOR.countMaxOrSubsets(new int[]{3,1}));
    }
}
