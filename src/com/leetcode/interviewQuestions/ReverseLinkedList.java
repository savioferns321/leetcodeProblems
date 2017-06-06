package com.leetcode.interviewQuestions;
/**
 * Reverse a singly linked list.
 * URL : https://leetcode.com/problems/reverse-linked-list/#/description
 */
public class ReverseLinkedList {
    
    public ListNode reverseList(ListNode head) {
        
        ListNode newList = null;
        ListNode temp;
        ListNode oldList = head;
        while(oldList != null){
            temp = oldList.next;
            oldList.next = newList;
            newList = oldList;
            oldList = temp;
        }
        return newList;
    }
}


