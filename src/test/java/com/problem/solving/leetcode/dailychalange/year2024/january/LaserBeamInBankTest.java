package com.problem.solving.leetcode.dailychalange.year2024.january;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class LaserBeamInBankTest {
    @Test
    public void shouldReturnNumberOfBeamsInBank_Success(){
        String[] banks = new String[]{"011001","000000","010100","001000"};
        int expectedLaserBeams = 8;
        int actualLaserBeams = LaserBeamInBank.numberOfBeams(banks);
        Assertions.assertEquals(expectedLaserBeams, actualLaserBeams);
    }
}
