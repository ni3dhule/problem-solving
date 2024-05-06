package com.problem.solving.leetcode.dailychalange.year2024.may;

import com.problem.solving.leetcode.dailychalange.year2024.march.ListNode;

import java.util.Stack;

public class RemoveNodeFromList {
    private RemoveNodeFromList(){}
    public ListNode removeNodes(ListNode head) {
        ListNode cur = head;
        Stack<ListNode> stack = new Stack<>();

        while (cur != null) {
            while (!stack.isEmpty() && stack.peek().val < cur.val) {
                stack.pop();
            }
            stack.push(cur);
            cur = cur.next;
        }

        ListNode nxt = null;
        while (!stack.isEmpty()) {
            cur = stack.pop();
            cur.next = nxt;
            nxt = cur;
        }

        return cur;
    }
}
