package Binary_tree;

import java.util.*;

class Trees{
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
	
//	private Node root=this.createTree();

	private Node createTree() {
		// TODO Auto-generated method stub
		String str=sc.next();
		
		Queue<Node>qq=new LinkedList<>();
		
		Node parent=new Node(str.charAt(0)-'0');
		
		qq.add(parent);
		int i=1;
		while(!qq.isEmpty() && i<str.length()){
			
			Node child=qq.remove();
			if(i<str.length()) {
				child.left=new Node(str.charAt(i)-'0');
			
				
				qq.add(child.left);
				
				i++;
				
			}
			if(i<str.length()) {
				child.right=new Node(str.charAt(i)-'0');
				qq.add(child.right);
			
				i++;
			}
		}
		return parent;
	}
	
	class Count{
		int count;
	}
	
	public void dispaly(Node nn) {
		
		if(nn==null) {
			return;
		}
		
		System.out.print(nn.data+"-->");
		dispaly(nn.left);
		dispaly(nn.right);
		return;
	}
	public void countsub() {
		int t=sc.nextInt();//no test cases
		while(t-->0) {
			Node nn=this.createTree();
			int target=sc.nextInt();
			dispaly(nn);
			System.out.println();
			System.out.print(countsub(nn,target));
			
			
		}
		
	}

	private int countsub(Node root, int target) {
		// TODO Auto-generated method stub
		
		if(root==null) {
			return 0;
		}
		
	
		int sl=counttotal(root,target,new Count() );
		int lf=counttotal(root.left,target,new Count());
		int rf=counttotal(root.right,target,new Count());
		return sl+lf+rf;
		
		
	}

	private int counttotal(Node root, int target, Count count) {
		// TODO Auto-generated method stub
		
		if(root==null) {
			return 0;
		}
		
		count.count+=root.data;
		
		
	
		int lf=counttotal(root.left,target,count);
		int rf=counttotal(root.right,target,count);
		
		if(count.count==target) {
		
			return 1;
		}
		
		return 0;
		
		
		
		
	}
}
public class sub_tree_with_given_sum {
	
	public static void main(String[] args) {
		Trees tt=new Trees();
		tt.countsub();
	}
	

}
