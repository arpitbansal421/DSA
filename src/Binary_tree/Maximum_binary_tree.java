package Binary_tree;

import java.util.*;

import Binary_tree.VerticalOrderTraversalofaBinaryTree.TreeNode;
//Maximum binary tree
/*
 * You are given an integer array nums with no duplicates. A maximum binary tree can be built recursively from nums using the following algorithm:

Create a root node whose value is the maximum value in nums.
Recursively build the left subtree on the subarray prefix to the left of the maximum value.
Recursively build the right subtree on the subarray suffix to the right of the maximum value.
 * 
 * 
 * 
 */
public class Maximum_binary_tree {
	
	 public TreeNode constructMaximumBinaryTree(int[] nums) {
	        return constructMaximumBinaryTree(nums,0,nums.length-1);
	    }
	    
	    public TreeNode constructMaximumBinaryTree(int[]nums,int si,int ei){
	        
	        if(si>ei){
	            return null;
	        }
	        int ind=-1;
	        int val=Integer.MIN_VALUE;
	        for(int i=si;i<=ei;i++){
	            
	            if(nums[i]>val){
	                val=nums[i];
	                ind=i;
	            }
	            
	        }
	        
	        TreeNode root=new TreeNode(val);
	        
	        root.left=constructMaximumBinaryTree(nums,si,ind-1);
	        root.right=constructMaximumBinaryTree(nums,ind+1,ei);
	        
	        return root; 
	        
	    }

}
