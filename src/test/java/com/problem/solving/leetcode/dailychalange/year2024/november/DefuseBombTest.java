package com.problem.solving.leetcode.dailychalange.year2024.november;

import org.junit.Assert;
import org.junit.Test;

public class DefuseBombTest {
    @Test
    public void shouldDecryptBombDiffusionSuccess() {
        Assert.assertArrayEquals(new int []{12,10,16,13}, DefuseBomb.decrypt(new int[]{5,7,1,4}, 3));
    }
}
