package com.problem.solving.leetcode.dailychalange.year2024.august;

import java.util.HashMap;
import java.util.Map;

public class KthDistinctStringArray {
    private KthDistinctStringArray(){}
    public static String kthDistinct(String[] arr, int k) {
        Map<String, Integer> counter = new HashMap<>();
        for (String v : arr) {
            counter.put(v, counter.getOrDefault(v, 0) + 1);
        }
        for (String v : arr) {
            if (counter.get(v) == 1) {
                --k;
                if (k == 0) {
                    return v;
                }
            }
        }
        return "";
    }
}
