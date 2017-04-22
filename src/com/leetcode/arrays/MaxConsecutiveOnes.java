package com.leetcode.arrays;

public class MaxConsecutiveOnes {
	public static int findMaxConsecutiveOnes(int[] nums) {
		
		int currentSum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == 0 && currentSum > 0){
				maxSum = Math.max(maxSum, currentSum);
				currentSum = 0;
			} else if(nums[i] == 1){
				currentSum++;
			} 
			
			if(i == nums.length-1){
				maxSum = Math.max(maxSum, currentSum);
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		System.out.println(findMaxConsecutiveOnes(new int[]{0,1,1,1,0,1,0,1,1,1,1}));
	}
}
