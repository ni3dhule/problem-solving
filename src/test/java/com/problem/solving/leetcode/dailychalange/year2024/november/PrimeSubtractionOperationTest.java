package com.problem.solving.leetcode.dailychalange.year2024.november;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class PrimeSubtractionOperationTest {
    @Test
    public void shouldReturnTruePrimeSubtractionSuccess(){
        assertTrue(PrimeSubtractionOperation.primeSubOperation(new int[]{4,9,6,10}));
    }
}
