package com.problem.solving.leetcode.dailychalange.year2024.february;

import java.util.ArrayList;
import java.util.List;

public class SortedListWithSequencialDigit {
    private SortedListWithSequencialDigit(){}
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> a = new ArrayList<>();

        for (int i = 1; i <= 9; ++i) {
            int num = i;
            int nextDigit = i + 1;

            while (num <= high && nextDigit <= 9) {
                num = num * 10 + nextDigit;
                if (low <= num && num <= high) {
                    a.add(num);
                }
                ++nextDigit;
            }
        }
        a.sort(null);
        return a;
    }
}
