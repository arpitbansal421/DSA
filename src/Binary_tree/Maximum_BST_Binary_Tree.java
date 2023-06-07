package Binary_tree;

/*1373. Maximum Sum BST in Binary Tree
 * 
 * Given a binary tree root, return the maximum sum of all keys of any sub-tree which is also a Binary Search Tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
 * 
 * 
 * 
 */
import java.util.*;
public class Maximum_BST_Binary_Tree {
	
	 public int maxSumBST(TreeNode root) {

	        return maxSum(root).ans<0?0:maxSum(root).ans;
	        
	    }

	    public BSTpair maxSum(TreeNode root){

	        if(root==null){
	            return new BSTpair();
	        }
	        BSTpair lbs=maxSum(root.left);
	        BSTpair rbs=maxSum(root.right);

	        BSTpair sbs=new BSTpair();

	        sbs.max=Math.max(root.val,rbs.max);
	        sbs.min=Math.min(root.val,lbs.min);

	        sbs.sum=lbs.sum+rbs.sum+root.val;

	        sbs.isvalid=lbs.isvalid&&rbs.isvalid&&lbs.max<root.val &&root.val<rbs.min;

	        if(sbs.isvalid){

	           sbs.ans=Math.max(lbs.ans,Math.max(rbs.ans,sbs.sum));
	           return sbs;


	        }
	        
	        //while revising the code i came across the condition 
	        /*what if the sum are calculated for previous binary tree but 
	         * it is not possible because as lower tree is not a valid tree than upper  tree will also
	         * be not a valid tree
	         * 
	         * 
	         */

	        sbs.ans=Math.max(lbs.ans,rbs.ans);
	        return sbs;

	      
	    }
	}


	 class BSTpair{
	    int ans=Integer.MIN_VALUE;
	    int max=Integer.MIN_VALUE;
	    int min=Integer.MAX_VALUE;
	    int sum=0;
	    boolean isvalid=true;
	}


