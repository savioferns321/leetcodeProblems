package com.leetcode.trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTreeLevelOrderTraversal {

	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return String.valueOf(val);
		}
	}
	
	public List<List<Integer>> levelOrderBottom2(TreeNode root){
		List<List<Integer>> output = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		
		if(root == null)
			return null;
		
		queue.offer(root);
		int numNodes; //Number of the nodes at the current level
		while(!queue.isEmpty()){
			numNodes = queue.size();
			List<Integer> subList = new ArrayList<>();
			for (int i = 0; i < numNodes; i++) {
				if(queue.peek().left != null) queue.offer(queue.peek().left);
				
				if(queue.peek().right != null) queue.offer(queue.peek().right);
				
				subList.add(queue.remove().val);
			}
			output.add(0, subList);
		}
		return output;
	}
	
	
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		Queue<TreeNode> levelQ = new LinkedList<>();

		levelQ.add(root);
		TreeNode node;
		List<List<Integer>> output = new ArrayList<>();
		List<Integer> curr = new ArrayList<>();
		int power = 0; 
		double nodeCounter = 0;
		while(!levelQ.isEmpty()){
			nodeCounter ++;
			node = levelQ.poll();
			if(node != null){
				curr.add(node.val);
			}
			if(nodeCounter == Math.pow(2, power)){
				output.add(curr);
				power++;
				nodeCounter = 0;
				/*for (int i = 0; i < curr.size(); i++) {
					System.out.print(curr.get(i)+"\t");
				}*/
				curr = new ArrayList<>();

				//System.out.println();
			}
			if(node != null){
				levelQ.add(node.left);
				levelQ.add(node.right);
			}	
		}
		Collections.reverse(output);
		return output;

	}
	
	public static void main(String[] args) {
		TreeNode root = new BTreeLevelOrderTraversal().new TreeNode(1);
		root.left = new BTreeLevelOrderTraversal().new TreeNode(2);
		root.left.left = new BTreeLevelOrderTraversal().new TreeNode(3);
		root.left.left.left = new BTreeLevelOrderTraversal().new TreeNode(4);
		root.left.left.left.left = new BTreeLevelOrderTraversal().new TreeNode(5);
		
		List<List<Integer>> output = new BTreeLevelOrderTraversal().levelOrderBottom(root);
		
		List<List<Integer>> output2 = new BTreeLevelOrderTraversal().levelOrderBottom(root);
		
		/*for (List<Integer> list : output) {
			for (Integer integer : list) {
				System.out.print(integer+"\t");
			}
			System.out.println();
		}*/
		
	}
}
