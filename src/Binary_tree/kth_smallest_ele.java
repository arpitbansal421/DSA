package Binary_tree;

import java.util.*;
/*
 * 
 * Given the root of a binary search tree, and an integer k,
 *  return the kth smallest value (1-indexed) of all the values of the nodes in the tree.
 * 
 * 
 */
public class kth_smallest_ele {
	class Solution {
	    TreeNode ans=null;
	    int Lastindex=0;
	    public int kthSmallest(TreeNode root, int k) {
	        
//	         ArrayList<TreeNode>lsit=new ArrayList<TreeNode>();
	        // Inorder(root,lsit);
	        inorder(root,k);
	        
//	         for(int i=0;i<lsit.size();i++){
	            
//	             if(i+1==k){
//	                 return lsit.get(i).val;
//	             }
//	         }
	        
	        return ans.val;//for compilation
	        
	    }
	    
//	     public void Inorder(TreeNode root,ArrayList<TreeNode>lsit){
	        
//	         if(root==null){
//	             return;
//	         }
	        
//	         Inorder(root.left,lsit);
//	         lsit.add(root);
//	         Inorder(root.right,lsit);
	        
//	         return;
//	     }
	    
	    public void inorder(TreeNode root,int k){
	        
	        if(root==null){
	            return;
	        }
	        
	      
	        
	        inorder(root.left,k);
	        Lastindex++;
	        if(Lastindex==k){
	            ans=root;
	            return ;
	        }
	        
	        inorder(root.right,k);
	        
	    }
	}

}
