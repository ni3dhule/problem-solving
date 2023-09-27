package com.problem.solving.leetcode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FindRandomAddedCharTest {
    @Test
    public void getRandomlyAddedCharactersTest(){
        String source = "ae";
        String dest = "aea";
        char result = FindRandomAddedChar.findTheDifference(source, dest);
        Assertions.assertEquals('a', result);
    }
}
