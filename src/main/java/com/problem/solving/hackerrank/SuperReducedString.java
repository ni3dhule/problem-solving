package com.problem.solving.hackerrank;

public class SuperReducedString {
    private SuperReducedString(){}
    public static String superReducedString(String s) {
        // Write your code here
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        while (sb.length() != 0 && i < sb.length()) {
            if (i+1 < sb.length() && sb.charAt(i) == sb.charAt(i+1)) {
                sb.deleteCharAt(i+1);
                sb.deleteCharAt(i);
                if (i > 0) {
                    i--;
                }
            }
            else {
                i++;
            }
        }
        if (sb.length() == 0) {
            return "Empty String";
        }
        return sb.toString();
    }
}
