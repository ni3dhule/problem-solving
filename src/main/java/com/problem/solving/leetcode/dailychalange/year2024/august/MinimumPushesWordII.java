package com.problem.solving.leetcode.dailychalange.year2024.august;

import java.util.Arrays;
import java.util.Collections;

public class MinimumPushesWordII {
    private MinimumPushesWordII(){}
    public static int minimumPushes(String word) {
        int[] letterFrequency = new int[26];
        for (char c : word.toCharArray()) {
            letterFrequency[c - 'a']++;
        }

        Integer[] sortedFreq = new Integer[26];
        for (int i = 0; i < 26; i++) {
            sortedFreq[i] = letterFrequency[i];
        }
        Arrays.sort(sortedFreq, Collections.reverseOrder());

        int totalPresses = 0;
        for (int i = 0; i < 26; i++) {
            if (sortedFreq[i] == 0) break;
            totalPresses += (i / 8 + 1) * sortedFreq[i];
        }

        return totalPresses;
    }
}
