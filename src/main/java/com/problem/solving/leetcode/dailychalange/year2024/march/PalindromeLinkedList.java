package com.problem.solving.leetcode.dailychalange.year2024.march;

public class PalindromeLinkedList {
    private PalindromeLinkedList(){}
    public ListNode reverse(ListNode head) {
        if (head == null) return null;
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

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode reverseHead = reverse(slow);
        ListNode temp1 = head;
        ListNode temp2 = reverseHead;

        while (temp2 != null) {
            if (temp1.val != temp2.val) return false;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
    }
}
