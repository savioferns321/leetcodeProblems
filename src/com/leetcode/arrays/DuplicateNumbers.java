package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumbers {
	public static List<Integer> findDuplicates(int[] nums) {
		
		List<Integer> output = new ArrayList<>();
		int currVal = 0;
		for (int i = 0; i < nums.length; i++) {
			currVal = Math.abs(nums[i]) - 1;
			if(nums[currVal] < 0)
				output.add(currVal+1);
			else{
				nums[currVal] = -nums[currVal];
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		System.out.println(findDuplicates(new int[]{10,2,5,10,9,1,1,4,3,7}));
	}
}
