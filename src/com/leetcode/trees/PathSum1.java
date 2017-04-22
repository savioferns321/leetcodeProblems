package com.leetcode.trees;

import com.leetcode.trees.BTreeLevelOrderTraversal.TreeNode;

public class PathSum1 {

	public boolean hasPathSum(TreeNode root, int sum) {

		return hasPathHelper(root, 0, sum);
	}
	
	public boolean hasPathHelper(TreeNode root, int currSum, int sum){
		if(root == null) return false;
		
		
		currSum += root.val;
		
		if(root.left == null && root.right == null) 
			return currSum == sum;
		
		return hasPathHelper(root.left, currSum, sum) || hasPathHelper(root.right, currSum, sum);
	}
}
