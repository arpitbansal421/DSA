package Binary_tree;
//leetcode 998
/*
 * A maximum tree is a tree where every node has a value greater than any other value in its subtree.

You are given the root of a maximum binary tree and an integer val.

Just as in the previous problem, the given tree was constructed from a list a (root = Construct(a)) 
recursively with the following Construct(a) routine:
 * 
 * 
 */
  class TreeNode {
     int val;
     TreeNode left;
    TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }    TreeNode(int val, TreeNode left, TreeNode right) {
       this.val = val;
         this.left = left;
         this.right = right;
     }
}
public class Maximum_binary_tree_2 {
	 public TreeNode insertIntoMaxTree(TreeNode root, int val) {
	        
	        if(root==null){
	            return new TreeNode(val);
	        }
	        
	        if(val>root.val){
	            TreeNode nn=new TreeNode(val);
	            nn.left=root;
	            return nn;
	        }
	        
	        root.right=insertIntoMaxTree(root.right,val);
	        
	        return root;
//	         List<Integer>ll=new ArrayList<>();
	        
//	         inorder(root,ll);
	        
//	         ll.add(val);
//	         int[]nums=new int[ll.size()];
	        
//	         for(int i=0;i<ll.size();i++){
//	             nums[i]=ll.get(i);
//	         }
//	         return constructMaximumBinaryTree(nums,0,nums.length-1);
	        
	        
	        
	    }
	    
	    public void inorder(TreeNode root,List<Integer>ll){
	        
	        if(root==null){
	            return;
	        }
	        
	        inorder(root.left,ll);
	        ll.add(root.val);
	        inorder(root.right,ll);
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
