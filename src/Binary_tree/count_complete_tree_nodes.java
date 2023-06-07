package Binary_tree;
import java.util.*;
public class count_complete_tree_nodes {
	 public int countNodes(TreeNode root) {
	        
	        if(root==null){
	            return 0;
	        }
	        int left=countNodes(root.left);
	        int right=countNodes(root.right);
	        
	        return left+right+1;
	        
	    }

}
