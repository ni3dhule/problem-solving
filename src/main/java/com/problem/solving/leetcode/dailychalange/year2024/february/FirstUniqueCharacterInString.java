package com.problem.solving.leetcode.dailychalange.year2024.february;

import java.util.HashMap;

public class FirstUniqueCharacterInString {
    private FirstUniqueCharacterInString(){}
    public static int firstUniqueChar(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(hm.get(c) == 1)
                return i;
        }
        return -1;
    }
}
