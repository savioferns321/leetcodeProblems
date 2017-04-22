package com.leetcode.trees;

import com.leetcode.trees.BTreeLevelOrderTraversal.TreeNode;

public class SortedArrayToBST {
	
	private BTreeLevelOrderTraversal traversal = new BTreeLevelOrderTraversal();

	public TreeNode sortedArrayToBST(int[] nums) {

		if(nums == null || nums.length == 0 ) return null;

		TreeNode root = bstHelper(nums, 0, nums.length - 1);

		return root;
	}

	public TreeNode bstHelper(int[] nums, int start, int end){

		int middle = (start + end)/2;
		TreeNode root = traversal.new TreeNode(nums[middle]);

		if(middle > start) root.left = bstHelper(nums, start, middle - 1);

		if(middle < end) root.right = bstHelper(nums, middle + 1, end);

		return root;
	}
}
