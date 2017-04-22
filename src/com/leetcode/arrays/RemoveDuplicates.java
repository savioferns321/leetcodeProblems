package com.leetcode.arrays;

public class RemoveDuplicates {

	public int removeDuplicates(int[] nums) {
		if(nums == null || nums.length == 0 ) return 0;

		int currIndex = 0;

		for (int i = 1; i < nums.length; i++) {
			if(nums[i] != nums[currIndex]){
				//Changed index - currIndex stores the 1st index at which value changes
				nums[++currIndex] = nums[i];
			} 
		}
		return currIndex+1;
	}
}
