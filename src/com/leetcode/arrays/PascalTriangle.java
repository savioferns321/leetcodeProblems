package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
		
		List<List<Integer>> output = new ArrayList<>();
		
		
		for (int i = 0; i <numRows; i++) {
			
			int[] currArr = new int[i+1];
			
			for (int j = 0; j < (currArr.length+1)/2; j++) {
				int currElement;
				
				if(j == 0){
					currElement = 1;
				} else{
					currElement = output.get(i-1).get(j) + output.get(i-1).get(j-1);
				}
				
				currArr[j] = currArr[currArr.length - 1 - j] = currElement;
			}
			
			List<Integer> currList = new ArrayList<>();
			for (int j = 0; j < currArr.length; j++) {
				currList.add(currArr[j]);
				System.out.print(currArr[j]+"\t");
			}
			System.out.println();
			output.add(currList);
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		List<List<Integer>> output = new PascalTriangle().generate(5);
		System.out.println(output.isEmpty());
	}
}
