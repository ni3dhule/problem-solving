package com.problem.solving.leetcode.dailychalange.year2024.october;

import java.util.HashSet;

public class SplitStringMaxUniqueString {
    private SplitStringMaxUniqueString(){}
    public static int maxUniqueSplit(String s) {
        return backtrack(0, s, new HashSet<>());
    }
    private static int backtrack(int start, String s, HashSet<String> seen) {
        if (start == s.length()) {
            return 0;
        }
        int maxSplits = 0;
        for (int end = start + 1; end <= s.length(); end++) {
            String substring = s.substring(start, end);
            if (!seen.contains(substring)) {
                seen.add(substring);
                maxSplits = Math.max(maxSplits, 1 + backtrack(end, s, seen));
                seen.remove(substring);
            }
        }
        return maxSplits;
    }
}
