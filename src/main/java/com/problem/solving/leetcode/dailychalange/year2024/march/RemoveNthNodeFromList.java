package com.problem.solving.leetcode.dailychalange.year2024.march;

public class RemoveNthNodeFromList {
    private RemoveNthNodeFromList(){}
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy, fast = dummy;
        // Giving fast pointer a head start of n nodes
        while (fast != null && n-- > 0) {
            fast = fast.next;
        }
        // If the node to be removed is head
        if (fast == null) {
            return head.next;
        }
        // You continue below process till your fast pointer reaches last node
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        // Slow will be pointing to one node previous to the node that is to be removed
        slow.next = slow.next.next;
        return dummy.next;
    }
}
