package Binary_tree;

import java.util.*;
//leetcode 116
/*
 * You are given a perfect binary tree where all leaves are on the same level, 
 * and every parent has two children. The binary tree has the following definition:
 * 
 * 
 */
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
public class Populating_next_right_pointer_each_node {
	 public Node connect(Node root) {
	        
	        if(root==null){
	            return null;
	        }
	        
	        Queue<Node>q=new LinkedList<>();
	        
	        q.add(root);
	        q.add(null);
	        
	        while(!q.isEmpty()){
	            Node node=q.remove();
	            
	            if(node!=null){
	                if(node.left!=null){
	                    q.add(node.left);
	                }
	                
	                if(node.right!=null){
	                    q.add(node.right);
	                }
	                
	                node.next=q.peek();
	            }
	            
	            else{
	                if(!q.isEmpty()){
	                    q.add(null);
	                }
	            }
	        }
	        
	        return root;
	        
	    }

}
