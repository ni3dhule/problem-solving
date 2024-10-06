package com.problem.solving.leetcode.dailychalange.year2024.october;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class SentenceSimilarityIIITest {
    @Test
    public void shouldReturnTrueForSimilarSentenceSuccess() {
        assertTrue(SentenceSimilarityIII.areSentencesSimilar("My name is Haley", "My Haley"));
    }
}
