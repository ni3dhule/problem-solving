package com.problem.solving.leetcode.dailychalange.year2024.june;

public class AppendCharacterToMakeSubSequence {
    private AppendCharacterToMakeSubSequence(){}

    public static int appendCharacters(String s, String t) {
        int sIndex = 0, tIndex = 0;
        int sLength = s.length(), tLength = t.length();
        while (sIndex < sLength && tIndex < tLength) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                tIndex++;
            }
            sIndex++;
        }
        return tLength - tIndex;
    }
}
