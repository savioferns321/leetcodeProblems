package com.leetcode.interviewQuestions;

/**
 * Given a singly linked list, determine if it is a palindrome.
 * URL : https://leetcode.com/problems/palindrome-linked-list/#/description
 */
public class PalindromeLinkedList {
    
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        slow.next = reverseList(fast);
        fast = head;
        slow = slow.next;
        
        while(slow != null){
            if(slow.val != fast.val) return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
    
    ListNode reverseList(ListNode root){
        ListNode newList = null;
        ListNode oldList=  root;
        ListNode temp;
        
        while(oldList != null){
            temp = oldList.next;
            oldList.next = newList;
            newList = oldList;
            oldList = temp;
        }
        return newList;
    }
}
