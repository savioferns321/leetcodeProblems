package com.leetcode.arrays;

public class MoveZeroes {

	public void moveZeroes(int[] nums) {
		
		int zeroCount = 0;

		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == 0)
				zeroCount++;
			
			if(nums[i] > 0 && zeroCount > 0 ){
				nums[i - zeroCount] = nums[i];
				nums[i] = 0;
			}
			
			if(nums.length - zeroCount == i){
				break;
			}
		}
	}
}
