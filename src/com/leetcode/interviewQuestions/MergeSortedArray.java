package com.leetcode.interviewQuestions;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. 
The number of elements initialized in nums1 and nums2 are m and n respectively.
URL : https://leetcode.com/problems/merge-sorted-array/#/description
 */
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
