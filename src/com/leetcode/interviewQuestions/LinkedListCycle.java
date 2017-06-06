package com.leetcode.interviewQuestions;

/**
 * Given a linked list, determine if it has a cycle in it.
 * URL : https://leetcode.com/problems/linked-list-cycle/#/description
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode slow = head, fast = head;
        while(fast.next !=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
}
