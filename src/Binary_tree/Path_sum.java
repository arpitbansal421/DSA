package Binary_tree;

//112. Path Sum
/*
 * Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

   
   
   A leaf is a node with no children
 * 
 * 
 */
import java.util.*;
class tree1{
	Scanner sc=new Scanner(System.in);
	class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data=data;
		}
		
		public Node() {
			
		}
	}
	
	

	
	public Node createTree() {
	
		return this.createTree(null, false);
	}

	
	public Node createTree(Node parent,boolean ilc) {
	
	  Node nn=new Node(sc.nextInt());
	  
	  boolean ileftc=sc.nextBoolean();
	  if(ileftc) {
		  
		  nn.left=createTree(nn,true);
		  
	  }
	  
	  boolean irightc=sc.nextBoolean();
	  if(irightc) {
		  nn.right=createTree(nn,true);
	  }
	  return nn;
		
		
		
		
	}
	
	public boolean path_sum(int target) {
		Node root=this.createTree();
		return path_sum(root,target,0);
	}
	
	private boolean path_sum(Node root, int target,int curr) {
		
		if(root==null) {
			return false;
		}
		
		if(root.left==null && root.right==null) {
			curr=curr+root.data;
		}
		if(root.left==null && root.right==null && curr==target) {
			
			return true;
		}
		
		boolean ls=path_sum(root.left,target,curr+root.data);
		boolean rs=path_sum(root.right,target,curr+root.data);
		
		if(ls||rs) {
			return true;
		}
		
		return false;
	}
}
public class Path_sum {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int target=sc.nextInt();
		tree1 tt=new tree1();
		System.out.println(tt.path_sum(target));
		
		
	}

}
