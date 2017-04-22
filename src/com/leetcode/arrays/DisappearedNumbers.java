package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> output = new ArrayList<>();
		int currentIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			currentIndex = Math.abs(nums[i]) - 1;
			if(nums[currentIndex] > 0)
				nums[currentIndex] = -nums[currentIndex];
		}
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > 0)
				output.add(i+1);
		}
		return output;
	}

	public static void main(String[] args) {
		System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
	}
}
