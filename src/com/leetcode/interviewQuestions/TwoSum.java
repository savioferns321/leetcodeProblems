package com.leetcode.interviewQuestions;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
URL : 
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
        int[] output = new int[2];
        if(nums == null || nums.length == 0) return output;
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < nums.length; i++){
            if(map.containsKey(nums[i])) return new int[]{i, map.get(nums[i])};
            else map.put(target - nums[i], i);
        }
        return output;
    }
}
