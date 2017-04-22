package com.leetcode.google;

public class EquilibriumIndex {

	public int solution(int[] A) {
		// write your code in Java SE 8
		int leftsum = 0;
		int rightsum = 0;
		for (int i = 0; i < A.length; i++) {
			rightsum += A[i];
		}
		
		for (int i = 0; i < A.length; i++) {
			if(i!=0){
				leftsum +=A[i-1];
			}	
			rightsum -=A[i];
			if(leftsum == rightsum)
				return i;
		}
		return -1;

	}

	public static void main(String[] args) {

		int[] A = new int[]{-1,3,-4,5,1,-6,2,1};
		new EquilibriumIndex().solution(A);
	}
}
