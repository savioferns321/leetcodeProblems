package com.leetcode.interviewQuestions;

/**
 * Given a binary tree, find its maximum depth.
 * URL : https://leetcode.com/problems/maximum-depth-of-binary-tree/#/description
 */
public class BinaryTreeDepth {
    
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
