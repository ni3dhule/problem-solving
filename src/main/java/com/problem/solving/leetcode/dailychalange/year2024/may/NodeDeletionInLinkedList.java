package com.problem.solving.leetcode.dailychalange.year2024.may;

import com.problem.solving.leetcode.dailychalange.year2024.march.ListNode;

public class NodeDeletionInLinkedList {
    private NodeDeletionInLinkedList(){}
    public void deleteNode(ListNode node) {
        // Traverse the list until the second last node
        while (node.next.next != null) {
            // Copy the value of the next node to the current node
            node.val = node.next.val;
            // Move to the next node
            node = node.next;
        }
        // Copy the value of the last node to the current node
        node.val = node.next.val;
        // Remove the last node by setting the next pointer to null
        node.next = null;
    }
}
