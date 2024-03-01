package com.problem.solving.leetcode.dailychalange.year2024.march;

import java.util.Collections;

public class MaxOddBinaryNumber {
    private MaxOddBinaryNumber(){}
    public static String maximumOddBinaryNumber(String s) {
        return s.chars()
                .boxed()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString()
                .concat("1");
    }
}
