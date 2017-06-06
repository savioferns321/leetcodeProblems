package com.leetcode.interviewQuestions;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        
        return isSymmetricHelper(root, root);
    }
    
    public boolean isSymmetricHelper(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null) return true;
        
        if(root1 == null || root2 == null) return false;
        
        if(root1.val != root2.val) return false;
        
        return isSymmetricHelper(root1.left, root2.right) && isSymmetricHelper(root1.right, root2.left);
    }
}
