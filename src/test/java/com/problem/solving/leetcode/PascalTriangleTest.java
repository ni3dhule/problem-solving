package com.problem.solving.leetcode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.util.List;
public class PascalTriangleTest {
    @Test
    public void testGetTriangleLastRow() {
        // Test for rowIndex 0 (first row)
        List<Integer> resultRow0 = PascalTriangle.getTriangleLastRow(0);
        Assertions.assertEquals(List.of(1), resultRow0);

        // Test for rowIndex 1 (second row)
        List<Integer> resultRow1 = PascalTriangle.getTriangleLastRow(1);
        Assertions.assertEquals(List.of(1, 1), resultRow1);

        // Test for rowIndex 2 (third row)
        List<Integer> resultRow2 = PascalTriangle.getTriangleLastRow(2);
        Assertions.assertEquals(List.of(1, 2, 1), resultRow2);

        // Add more test cases for other row indices as needed.
    }

}
