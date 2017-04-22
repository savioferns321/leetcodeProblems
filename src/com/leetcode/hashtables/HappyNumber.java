package com.leetcode.hashtables;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	public boolean isHappy(int n) {
		
		Set<Integer> set = new HashSet<>();
		
		while(set.add(n)){
			
			n = squareSum(n);
			if(n == 1) return true;	
			
		}
		
		return false;
	}
	
	public int squareSum(int n){
		int squareSum = 0;
		int lsb = 0;
		while(n > 0){
			lsb = n % 10;
			squareSum += lsb* lsb;
			n/= 10;
		}
		
		return squareSum;
	}
	
	public static void main(String[] args) {
		HappyNumber happyNumber = new HappyNumber();
		System.out.println(happyNumber.squareSum(2));
		System.out.println(happyNumber.isHappy(19));
	}
}
