package com.leetcode.interviewQuestions;

/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.
URL : https://leetcode.com/problems/maximum-subarray/#/description
 */
public class MaximumSubarray {
    public int maxSubArray(int[] a) {
        if(a == null || a.length == 0) return Integer.MIN_VALUE;
        //Kadane's algorithm
        int overallMax = a[0];
        int currentMax = a[0];
        
        for(int i=1; i < a.length; i++){
            currentMax = Math.max(currentMax + a[i], a[i]);
            overallMax = Math.max(currentMax, overallMax);
        }
        
        return overallMax;
         
    }
    
}
