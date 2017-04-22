package com.leetcode.arrays;

public class RotateArray {

	public void rotate(int[] nums, int k) {
		
		if(k == 0) return;
		
		int shiftLength = nums.length % k;
		
		nums = reverse(nums, 0, nums.length - shiftLength - 1);
		nums = reverse(nums, nums.length - shiftLength, nums.length-1);
		nums = reverse(nums, 0, nums.length - 1);
	}
	
	public  int[] reverse(int[] arr, int start, int end){
		
		int i = start;
		int j = end;
		int temp;
		while(i < j){
			temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			i++;
			j--;
		}
		return arr;
	}
}
