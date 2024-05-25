package com.problem.solving.leetcode.dailychalange.year2024.may;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WordBreak2 {
    public List<String> wordBreak(String s, List<String> wordDict) {
        HashSet<String> hs = new HashSet<>(wordDict);
        return wordBreakHelper(s, 0, hs);
    }

    private List<String> wordBreakHelper(String s, int start, HashSet<String> dict) {
        List<String> validSubstr = new ArrayList<>();
        if (start == s.length())
            validSubstr.add("");
        for (int end = start + 1; end <= s.length(); end++) {
            String prefix = s.substring(start, end);
            if (dict.contains(prefix)) {
                List<String> suffixes = wordBreakHelper(s, end, dict);
                for (String suffix : suffixes) {
                    validSubstr.add(prefix + (suffix.equals("") ? "" : " ") + suffix);
                }
            }
        }
        return validSubstr;
    }
}
