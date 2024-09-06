package com.problem.solving.leetcode.dailychalange.year2024.september;

import com.problem.solving.leetcode.dailychalange.year2024.march.ListNode;

public class RemoveNodesFromLinkedList {
    private RemoveNodesFromLinkedList(){}
    public ListNode modifiedList(int[] nums, ListNode head) {
        int max = -1;
        for(int num : nums ){
            max = num > max ? num : max;
        }
        boolean[] freq = new boolean[max+1];

        for(int num : nums) freq[num] = true;

        ListNode temp = new ListNode();
        ListNode current = temp;

        while(head != null){
            if( head.val >= freq.length || freq[head.val] == false){
                current.next = head;
                current = current.next;
            }
            head = head.next;
        }

        current.next = null;
        return temp.next;
    }
}
