package com.leetcode.arrays;

public class TwoSum2 {

	public int[] twoSum(int[] numbers, int target) {

		int left = 0;
		int right = numbers.length - 1;
		int[] output = null;
		
		while(left <= right){
			if(numbers[left] + numbers[right] == target){
				output = new int[]{left+1, right+1};
				return output;
			}
			
			if(numbers[left] + numbers[right] < target){
				left++;
			}
			

			if(numbers[left] + numbers[right] > target){
				right--;
			}
		}
		
		return output;
		
	}
}
