package com.leetcode.trees;

import com.leetcode.trees.BTreeLevelOrderTraversal.TreeNode;

public class MinDepth {

	public int minDepth(TreeNode root) {

		if(root == null) return 0;
		
		return 1+Math.min(minDepth(root.left), minDepth(root.right));
	}
}
