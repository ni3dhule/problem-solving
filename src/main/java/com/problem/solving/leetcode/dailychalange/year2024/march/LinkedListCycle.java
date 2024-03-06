package com.problem.solving.leetcode.dailychalange.year2024.march;

public class LinkedListCycle {
    private LinkedListCycle() {
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return true;
        }
        return false;
    }
}
