package com.leetcode.interviewQuestions;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.

Note:
Your algorithm should run in linear runtime complexity. 
URL : https://leetcode.com/problems/missing-number/#/description
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        
        if(nums == null || nums.length == 0) return 0;
        
        int sum = 0;
        int len = nums.length;
        
        for(int i=0; i < len; i++){
            sum += nums[i];
        }
        
        return (len * (len + 1)/2) - sum;
    }
}
