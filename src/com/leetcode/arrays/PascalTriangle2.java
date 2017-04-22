package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {

	public List<Integer> getRow(int rowIndex) {
		
		if(rowIndex < 0) return null;
		
		List<Integer> output = new ArrayList<Integer>(rowIndex + 1);
		
		for (int i = 0; i < rowIndex; i++) {
			output.add(0, 1);
			for (int j = 0; j <i; j++) {
				output.set(j,output.get(j)+output.get(j+1));
			}
		}
		output.add(0,1);
		
		return output;
	}
	
	
	public static void main(String[] args) {
		PascalTriangle2 pascalTriangle2 = new PascalTriangle2();
		List<Integer> output = pascalTriangle2.getRow(3);
		output.forEach(System.out:: println);
	}
}
