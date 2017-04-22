package com.leetcode.arrays;

public class PlusOne {

	public int[] plusOne(int[] digits) {
		
		int sum = 1;
		
		for (int i = digits.length - 1; i >= 0; i--) {
			sum = digits[i] + sum;
			digits[i] = sum %10;
			sum = sum / 10;
			
			if(sum == 0) break;
		}
		
		if(sum != 0){
			int[] output = new int[digits.length + 1];
			for (int i = 1; i < output.length; i++) {
				output[i] = digits[i-1];
			}
			output[0] = sum;
			digits = output;
		}
		
		return digits;
	}
}
