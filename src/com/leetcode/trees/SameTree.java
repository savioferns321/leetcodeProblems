package com.leetcode.trees;

import com.leetcode.trees.BTreeLevelOrderTraversal.TreeNode;

public class SameTree {

	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null && q!= null || p != null && q == null) return false;
		
		if(p == null && q == null) return true;
		
		if(p.val != q.val) return false;
		
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

	}
}
