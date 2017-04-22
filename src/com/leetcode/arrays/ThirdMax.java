package com.leetcode.arrays;

public class ThirdMax {

	public static int thirdMax(int[] nums) {
		Integer[] output = new Integer[3];
		for (int i = 0; i < output.length; i++) {
			output[i] = null;
		}
		Integer curr = null;
		for (int i = 0; i < nums.length; i++) {
			curr = nums[i];
			if(curr.equals(output[0]) || curr.equals(output[1]) || curr.equals(output[2]))
				continue;
			
			if(output[2] == null || nums[i] > output[2]){
				output[0] = output[1];
				output[1] = output[2];
				output[2] = nums[i];
			} else if(output[1] == null || nums[i] > output[1]){
				output[0] = output[1];
				output[1] = nums[i];
			} else if(output[0] == null || nums[i] > output[0]){
				output[0] = nums[i];
			}
		}
		
		return output[0] == null? output[2]: output[0];
	}
	
	public static void main(String[] args) {
		System.out.println(thirdMax(new int[]{2, 2, 3, 1}));
	}
}
