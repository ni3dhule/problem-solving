package com.problem.solving.hackerrank;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class VeryBigSumTest {
    @Test
    public void testBigSum() {
        List<Long> list = new ArrayList<>();
        list.add(1000000001L);
        list.add(1000000002L);
        list.add(1000000003L);
        list.add(1000000004L);
        list.add(1000000005L);

        Long expectedOutput = 5000000015L;
        Long actualOutput = VeryBigSum.veryBigSum(list);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}
