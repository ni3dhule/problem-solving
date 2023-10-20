package com.problem.solving.leetcode;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class FlattenNestedListIterator implements Iterator<Integer> {
    private Stack<FlattenNestedListIterator> stack;

    public FlattenNestedListIterator(List<FlattenNestedListIterator> nestedList) {
        stack = new Stack<>();
        for (int i = nestedList.size() - 1; i >= 0; i--) {
            stack.push(nestedList.get(i));
        }
    }

    @Override
    public Integer next() {
        return stack.pop().next();
    }

    @Override
    public boolean hasNext() {
        while (!stack.isEmpty()) {
            if (stack.peek().hasNext()) {
                return true;
            }
            List<FlattenNestedListIterator> nestedList = stack.pop().stack;
            for (int i = nestedList.size() - 1; i >= 0; i--) {
                stack.push(nestedList.get(i));
            }
        }
        return false;
    }
}
