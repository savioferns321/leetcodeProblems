package com.leetcode.trees;

import com.leetcode.trees.BTreeLevelOrderTraversal.TreeNode;

public class SymmetricTree {

	public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        
        return isSymmetricHelper(root.left, root.right);
    }
	
	public boolean isSymmetricHelper(TreeNode a, TreeNode b){
		if(a == null && b == null) return true;
		
		if(a == null && b!=null || b == null && a != null)
			return false;
		
		if(a.val != b.val) return false;
		
		return isSymmetricHelper(a.left, b.right) && isSymmetricHelper(a.right, b.left);
	}
}
