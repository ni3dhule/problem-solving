package com.problem.solving.leetcode.dailychalange.year2024.april;

import java.util.Stack;

public class MinimumRemoveForValidParenthesis {
    private MinimumRemoveForValidParenthesis(){}
    public static String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();

        // First pass: remove excessive ')' and track '(' indices
        for (int i = 0; i < sb.length(); ++i) {
            if (sb.charAt(i) == '(') {
                stack.push(i);
            } else if (sb.charAt(i) == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    sb.setCharAt(i, '*'); // Mark ')' for removal
                }
            }
        }

        // Mark excessive '(' for removal
        while (!stack.isEmpty()) {
            sb.setCharAt(stack.pop(), '*');
        }

        // Construct result string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sb.length(); ++i) {
            if (sb.charAt(i) != '*') {
                result.append(sb.charAt(i));
            }
        }

        return result.toString();
    }
}
