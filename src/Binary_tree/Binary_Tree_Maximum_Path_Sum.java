package Binary_tree;

import java.util.*;
/*
 * A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.

The path sum of a path is the sum of the node's values in the path.

Given the root of a binary tree, return the maximum path sum of any non-empty path.
 * 
 * 
 * 
 */
public class Binary_Tree_Maximum_Path_Sum {
	
	class Solution {
	    
        public int maxPathSum(TreeNode root) {
      
       return  max(root);
      
      
        
    }
    
    class MaxSum{
        int NTN_sum=Integer.MIN_VALUE;
        int RTN_sum=0;
    }
    
    public int max(TreeNode root){
        return maxPath(root).NTN_sum;
    }
    
    public MaxSum maxPath(TreeNode root){
        
        if(root==null){
            return new MaxSum();
        }
        
        MaxSum lp= maxPath(root.left);//left max pair
        MaxSum rp= maxPath(root.right);//right max pair
        
        MaxSum self=new MaxSum();//self pair
        
        int Rtn=Math.max(lp.RTN_sum,rp.RTN_sum)+root.val;
                        
                     int   ntn=
            Math.max(lp.NTN_sum,Math.max(rp.NTN_sum,Math.max(root.val+rp.RTN_sum+lp.RTN_sum,Math.max(root.val,Rtn))));
        
        self.RTN_sum=Math.max(Rtn,root.val);
        
        self.NTN_sum=ntn;
        
        return self;
            
        
        
        
        
        
       
   
                          
                     
        
       
    }
    
   
    
    
   
}

}
