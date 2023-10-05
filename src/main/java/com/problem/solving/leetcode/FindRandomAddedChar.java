package com.problem.solving.leetcode;

import java.util.Arrays;

/**
 * 389. Find the Difference
 * You are given two strings s and t.
 * String t is generated by random shuffling string s and then add one more letter at a random position.
 * Return the letter that was added to t.
 * --------------------------------
 * Example 1:
 * Input: s = "abcd", t = "abcde"
 * Output: "e"
 * Explanation: 'e' is the letter that was added.
 * ---------------------------------
 * Example 2:
 * Input: s = "", t = "y"
 * Output: "y"
 *
 */
public class FindRandomAddedChar {

    private FindRandomAddedChar(){}
    public static char findTheDifference(String s, String t) {
        if (s.isEmpty()){
            return t.charAt(0);
        }
        char[] first = s.toCharArray();
        Arrays.sort(first);
        s = new String(first);

        char[] second = t.toCharArray();
        Arrays.sort(second);
        t = new String(second);
        // ae
        // aae
        for(int i = 0; i < s.length();i++) {
            if(s.charAt(i) != t.charAt(i))
                return t.charAt(i);
        }
        return t.charAt(t.length()-1);
    }
}