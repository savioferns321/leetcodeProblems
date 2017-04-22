package com.leetcode.arrays;

public class MaxSubArraySum {

	//TODO Had to look at the solution.
	/*
	 * We have to obtain the max value of the previously obtained sum, starting from A[0].
	 * We have to check if the current max value is greater than sum of current max value and A[i].
	 * 
	 * 
	 * We have another variable, maxSoFar, which records the maximum sum of a sub-array obtained previously. 
	 * We then calculate if max(currentSubarray, maxSoFar)
	 * where currentSubarray = maxEndingHere, which gives the sum of the current Max sub-array.
	 * 
	 */
	public int maxSubArray(int[] nums) {

		int maxEndingHere = nums[0];
		int maxSoFar = nums[0];
		for (int i = 1; i < nums.length; i++) {
			maxEndingHere = Math.max(maxEndingHere+ nums[i], nums[i]);
			System.out.println(maxEndingHere);
			maxSoFar = Math.max(maxSoFar, maxEndingHere);
		}
		return maxSoFar;
	}
	
	public static void main(String[] args) {
		int[] x= new int[]{-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println(new MaxSubArraySum().maxSubArray(x));
	}
}
