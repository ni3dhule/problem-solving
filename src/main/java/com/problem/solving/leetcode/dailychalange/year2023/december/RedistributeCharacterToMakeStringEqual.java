package com.problem.solving.leetcode.dailychalange.year2023.december;

import java.util.HashMap;
import java.util.Map;

public class RedistributeCharacterToMakeStringEqual {
    private RedistributeCharacterToMakeStringEqual(){}
    public static boolean makeEqual(String[] words) {
        Map<Character, Integer> counts = new HashMap<>();
        for (String word : words) {
            for (char c : word.toCharArray()) {
                counts.put(c, counts.getOrDefault(c, 0) + 1);
            }
        }
        int n = words.length;
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() % n != 0) {
                return false;
            }
        }
        return true;
    }
}
