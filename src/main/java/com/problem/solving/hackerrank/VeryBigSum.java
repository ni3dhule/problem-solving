package com.problem.solving.hackerrank;

import java.util.List;

public class VeryBigSum {
    private VeryBigSum(){}
    public static long veryBigSum(List<Long> ar) {
        Long sum = 0L;
        for (Long longNumber: ar) {
            sum+=longNumber;
        }
        return sum;
    }
}
