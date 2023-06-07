package Binary_tree;

import java.util.*;
public class sum_number1 {

	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		sum_number1 m = new sum_number1();
		BinaryTree bt = m.new BinaryTree();
		System.out.println(bt.sumOfNodes());
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {
			
			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public int sumOfNodes() {
			return this.sumOfNodes(this.root,0) ;
		}
		
		private int sumOfNodes(Node node,int curr) {
			
			if(node==null) {
				return 0;
			}
			
			if(node.left==null && node.right==null) {
				return curr*10+node.data;
			}
			
			int lf=sumOfNodes(node.left,curr*10+node.data);
			int rt=sumOfNodes(node.right,curr*10+node.data);
			return lf+rt;
			
			// write your code here
			
			
		}
	}
}




 


