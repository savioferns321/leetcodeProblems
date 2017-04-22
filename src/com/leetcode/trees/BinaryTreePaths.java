package com.leetcode.trees;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.trees.BTreeLevelOrderTraversal.TreeNode;

public class BinaryTreePaths {

	public List<String> binaryTreePaths(TreeNode root) {
		List<String> outputList = new ArrayList<>();
		pathHelper(root, outputList, "");
		return outputList;
	}

	public List<String> pathHelper(TreeNode node, List<String> paths, String currpath){
		if(node == null){			
			return paths;
		} 
		
		if(!currpath.isEmpty())
			currpath = currpath + "->" + node.val;
		else
			currpath = currpath+node.val;
		
		if(node.left == null && node.right == null){
			paths.add(currpath);
			return paths;
		}			

		pathHelper(node.left, paths, currpath);
		pathHelper(node.right, paths, currpath);	

		return paths;
	}
}
