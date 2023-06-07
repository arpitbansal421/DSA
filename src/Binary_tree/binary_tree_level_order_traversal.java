package Binary_tree;
import java.util.*;
class Tree{
	
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
	
//	private Node root=createTree1();
	
	
	
	
	private Node createTree1() {
		
		Scanner sc=new Scanner(System.in);
		
	
		
		Node parent=new Node(sc.nextInt());
		Queue<Node>qq=new LinkedList<>();
		qq.add(parent);
		
		while(!qq.isEmpty()) {
			
			Node child=qq.remove();
			
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a!=-1) {
				child.left=new Node(a);
				qq.add(child.left);
			}
			if(b!=-1) {
				child.right=new Node(b);
				qq.add(child.right);
			}
		}
		
		System.out.print("hi");
		
		
	    
	    return parent;
		
	}
	
	public boolean isTreeSymmetrical() {
		
		Node root=createTree1();
		//System.out.print("hi");
		return ismirror(root.left,root.right);
			
	}
	
	public boolean ismirror(Node left,Node right){
		//System.out.println("hi");
		if(left ==null && right==null) {
			return true;
		}
		
		if((left==null && right!=null )||(left!=null && right==null)|| right.data!=right.data) {
			return false;
		}
		return ismirror(left.left,right.right)&&ismirror(left.right ,right.left);
		
		
	}
	
	
}

public class binary_tree_level_order_traversal {
	
	public static void main(String[] args) {
		
		Tree tt=new Tree();
		boolean ans=tt.isTreeSymmetrical();
		if(ans) {
			System.out.print("yes");
		}else {
			System.out.print("False");
		}
		
		
	}
	
	

}
