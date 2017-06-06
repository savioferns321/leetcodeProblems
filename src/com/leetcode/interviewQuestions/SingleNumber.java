package com.leetcode.interviewQuestions;

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * URL : https://leetcode.com/problems/single-number/#/description
 */
public class SingleNumber {
    
     public int singleNumber(int[] nums) {
         
         if(nums == null || nums.length == 0) return 0;
         
         int output = 0;
         for(int i=0; i < nums.length; i++){
             output ^= nums[i];
         }
         
         return output;
     }
}
