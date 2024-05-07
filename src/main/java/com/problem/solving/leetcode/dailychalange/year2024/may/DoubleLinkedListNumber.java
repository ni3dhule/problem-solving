package com.problem.solving.leetcode.dailychalange.year2024.may;

import com.problem.solving.leetcode.dailychalange.year2024.march.ListNode;
public class DoubleLinkedListNumber {
    private DoubleLinkedListNumber(){}
    private static int car;
    public static void doubleUtil(ListNode head) {
        if (head == null) return;
        doubleUtil(head.next);
        int cur = 2 * head.val + car;
        car = cur / 10;
        head.val = cur % 10;
    }

    public ListNode doubleIt(ListNode head) {
        car = 0;
        doubleUtil(head);
        return (car == 0) ? head : new ListNode(car, head);
    }
}
