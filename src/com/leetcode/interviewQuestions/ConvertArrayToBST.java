package com.leetcode.interviewQuestions;

/**
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 * URL : https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/#/description
 */
public class ConvertArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        
        if(nums == null || nums.length == 0) return null;
        
        TreeNode root = null;
        root = createBST(0, nums.length, nums);
        
        return root;
    }
    
    public TreeNode createBST(int left, int right, int nums[]){
        
        if(left > right) return null;
        
        int mid = left + (right - left)/2 - 1;
        TreeNode current = new TreeNode(nums[mid]);
        current.left = createBST(left, mid-1, nums);
        current.right = createBST(mid+1, right, nums);
        
        return current;
        
    }
}
