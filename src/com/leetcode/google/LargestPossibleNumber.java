package com.leetcode.google;

import java.util.Scanner;

public class LargestPossibleNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();		
		
		System.out.println(getLargestPossibleNumber(input));
		scanner.close();
	}
	
	public static int getLargestPossibleNumber(int input){
	
		if(Math.abs(input) < 10)
			return input;
		String inputString = String.valueOf(input);
		char[] inputArr = inputString.toCharArray();
		int maxValue = Integer.MIN_VALUE;
		int currMaxValue = Integer.MIN_VALUE;
		int currAvg = 0;
		for (int i = 1; i < inputArr.length; i++) {
			if(inputArr[i] <= '9' && inputArr[i] >= '0' 
					&& inputArr[i-1] <= '9' && inputArr[i-1] >= '0'){
				
				currAvg = (int)Math.ceil((inputArr[i] - '0' + inputArr[i-1] - '0')/2.0);
				currMaxValue = Integer.parseInt(inputString.substring(0, i-1) + currAvg + inputString.substring(i+1, inputString.length()));
				System.out.println("Average "+currAvg+"\t"+inputString.substring(0, i-1)+"\t"+inputString.substring(i+1, inputString.length()));
				if(currMaxValue > maxValue)
					maxValue = currMaxValue;				

				if(inputArr[i] > inputArr[i-1])
					break;
				
			} else
				return Integer.MIN_VALUE;
		}
		
		return maxValue;
	}
}
