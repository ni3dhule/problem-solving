package com.problem.solving.leetcode.dailychalange.year2023.november;

import com.problem.solving.leetcode.dailychalange.november.KnightRider;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class KnightRiderTest {
    @Test
    public void shouldReturnKnightRider_Success(){
        int input = 1;
        int expectedOutput = 10;
        int actualOutput = KnightRider.knightDialer(input);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}
