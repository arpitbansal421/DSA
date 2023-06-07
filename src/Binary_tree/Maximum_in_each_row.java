package Binary_tree;

import java.util.*;

 class TreeNode {
     int val;
     TreeNode left;
	    TreeNode right;
	      TreeNode() {}
	    TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
	        this.val = val;
	        this.left = left;
      this.right = right;
	    }
	 }
	 
//leetcode 515
/*
 * Given the root of a binary tree, return an array of the largest value in each row of the tree (0-indexed).
 * 
 * 
 * 
 */
public class Maximum_in_each_row {
	 public List<Integer> largestValues(TreeNode root) {
	        
	        Queue<TreeNode>qq=new LinkedList<>();
	        Queue<TreeNode>sq=new LinkedList<>();
	        List<Integer>ans=new ArrayList<>();
	        if(root==null){
	            return ans;
	        }
	        
	          int val=Integer.MIN_VALUE;
	        qq.add(root);
	        while(!qq.isEmpty()){
	            TreeNode rv=qq.remove();
	            
	          
	            int size=qq.size();
	            if(rv.left!=null){
	                sq.add(rv.left);
	            }
	            
	            if(rv.right!=null){
	                sq.add(rv.right);
	            }
	            
	            val=Math.max(rv.val,val);
	            
	            if(qq.isEmpty()){
	                
	                ans.add(val);
	                val=Integer.MIN_VALUE;
	                qq=sq;
	                sq=new LinkedList<>();
	            }
	            
	            
	       
	            
	            
	            
	            
	            
	            
	        }
	        
	        return ans;
	        
	    }

}
