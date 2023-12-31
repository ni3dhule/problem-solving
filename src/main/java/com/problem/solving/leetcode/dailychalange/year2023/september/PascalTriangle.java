package com.problem.solving.leetcode.dailychalange.year2023.september;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    private PascalTriangle() {}
    public static List<Integer> getTriangleLastRow(int rowIndex) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        // Generate the rows
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> currentRow = new ArrayList<>();
            // The first element of each row is always '1'
            currentRow.add(1);
            if (i > 0) {
                // Get a reference to the previous row
                List<Integer> previousRow = pascalTriangle.get(i - 1);
                // Calculate and populate the middle elements of the row
                for (int j = 1; j < previousRow.size(); j++) {
                    int sum = previousRow.get(j) + previousRow.get(j - 1);
                    currentRow.add(sum);
                }
                // The last element of each row is also '1'
                currentRow.add(1);
            }
            pascalTriangle.add(currentRow);
        }
        return pascalTriangle.get(rowIndex);
    }
}
