package com.problem.solving.leetcode.dailychalange.year2024.july;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CrawlerLogFolderTest {
    @Test
    public void shouldReturnMinimumOperationsSuccess() {
        String[] logs = new String[]{"d1/","d2/","../","d21/","./"};
        assertEquals(2, CrawlerLogFolder.minOperations(logs));
    }
}
