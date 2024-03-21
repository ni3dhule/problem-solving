package com.problem.solving.leetcode.dailychalange.year2024.march;

public class ReverseLinkedList {
    private ReverseLinkedList(){}
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode nextNode = null;
        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}
