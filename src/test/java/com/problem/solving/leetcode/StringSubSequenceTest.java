package com.problem.solving.leetcode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StringSubSequenceTest {
    @Test
    public void subSequenceTest() {
        String source = "abc";
        String destination = "ahbgdc";
        Assertions.assertTrue(StringSubSequence.isSubSequence(source, destination));
    }
    @Test
    public void subSequenceTest1() {
        String source = "abc";
        String destination = "cahbgd";
        Assertions.assertFalse(StringSubSequence.isSubSequence(source, destination));
    }
}
