package com.leetcode.interviewQuestions;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int counter =0;
        for(int i =1; i < nums.length; i++){
            if(nums[i] != nums[i-1])
                nums[++counter] = nums[i];
        }
        return counter;
    }
}
