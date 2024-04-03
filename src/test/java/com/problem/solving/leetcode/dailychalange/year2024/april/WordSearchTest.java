package com.problem.solving.leetcode.dailychalange.year2024.april;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class WordSearchTest {
    @Test
    public void shouldReturnTrueIfAbleToConstructWord_Success(){
        char[][] input = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        Assertions.assertTrue(WordSearch.exist(input, word));
    }
}
