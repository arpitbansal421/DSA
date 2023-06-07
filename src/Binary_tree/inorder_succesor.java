package Binary_tree;

import java.util.*;

import Binary_tree.VerticalOrderTraversalofaBinaryTree.TreeNode;
/*
 * Lintcode 448
 * Given a binary search tree (See Definition) and a node in it, find the in-order successor of that node in the BST.

If the given node has no in-order successor in the tree, return null.
 * 
 * 
 */
public class inorder_succesor {
	
	 public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
	        // write your code here

	        TreeNode succ=null;

	        while(root!=null){

	            if(root.val<=p.val){
	                root=root.right;

	            }else{
	                succ=root;
	                root=root.left;
	            }
	        }

	        return succ;
	    }

}
