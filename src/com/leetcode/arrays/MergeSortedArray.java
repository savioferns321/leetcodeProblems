package com.leetcode.arrays;

public class MergeSortedArray {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		
		int mCounter = m-1;
		int nCounter = n-1;
		
		for (int i = m + n - 1; i >=0 ; i--) {
			if(mCounter < 0 && nCounter < 0) break;
			
			if(mCounter < 0){
				nums1[i] = nums2[nCounter--];
				continue;
			}
			
			if(nCounter < 0){
				nums1[i] = nums1[mCounter--];
				continue;
			}
			
			nums1[i] = nums1[mCounter] > nums2[nCounter] ? nums1[mCounter--] : nums2[nCounter--];
		}
	}
}
