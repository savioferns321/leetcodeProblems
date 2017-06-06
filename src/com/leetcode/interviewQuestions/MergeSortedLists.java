package com.leetcode.interviewQuestions;
/**
 * Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
 * URL : https://leetcode.com/problems/merge-two-sorted-lists/#/description
 */
public class MergeSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode output = new ListNode(0);
        mergeHelper(l1, l2, output);
        return output.next;
    }
    
    public void mergeHelper(ListNode l1,  ListNode l2, ListNode output){
        if(l1 == null && l2 == null) return;
        
        if(l1 == null){
            output.next = l2;
            return;
        } else if(l2 == null){
            output.next = l1;
            return;
        }
        
        if(l1.val <= l2.val){
            output.next = l1;
            mergeHelper(l1.next, l2, output.next);
        } else {
            output.next = l2;
            mergeHelper(l1, l2.next, output.next);
        }
    }
    
}
