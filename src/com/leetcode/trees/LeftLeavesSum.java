package com.leetcode.trees;

import com.leetcode.trees.BTreeLevelOrderTraversal.TreeNode;

public class LeftLeavesSum {
    public int sumOfLeftLeaves(TreeNode root) {
		return leftLeafSum(root, false, new Integer(0));

	}
	
	public Integer leftLeafSum(TreeNode node , boolean isLeft, Integer sum){
	    
		if(node == null) return sum;
		
		if(node.left == null && node.right == null && isLeft)
			return node.val + sum;
		
		return leftLeafSum(node.left, true, sum) + leftLeafSum(node.right, false, sum);
	
	}
}
