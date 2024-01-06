package com.problem.solving.leetcode.dailychalange.year2023.october;

import com.problem.solving.leetcode.dailychalange.year2023.september.PoorPigBucket;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PoorPigBucketTest {
    @Test
    public void testPoorPigBucketPositive(){
        int buckets= 4;
        int minutesToDie = 15;
        int minutesToTest = 15;
        int expectedOutput = 2;
        int actualOutput = PoorPigBucket.poorPigs(buckets, minutesToDie, minutesToTest);
        Assertions.assertEquals(expectedOutput,actualOutput);

    }

}
