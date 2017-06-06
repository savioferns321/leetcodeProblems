package com.leetcode.interviewQuestions;

/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
URL : https://leetcode.com/problems/majority-element/#/description
 */
public class MajorityElement {
    
    /**
     * Moore's Polling algorithm : 
     * Select the first element as candidate.
     * Iterate over the array.
     * Keep a counter which increments if current element is the candidate and which decrements if current element is not.
     * If counter becomes zero, current element is candidate and counter is set to 1.
     * Candidate at end of traversal is the majority element.
     */
    public int majorityElement(int[] nums) {
        
        if(nums == null || nums.length == 0) return 0;
        
        int candidate = nums[0];
        int counter = 1;
        
        for(int i=1; i < nums.length; i++){
            if(counter == 0)
                candidate = nums[i];
            if(nums[i] == candidate)
                counter++;
            else{
                counter--;
            }
        }
        
        return candidate;
    }
}
