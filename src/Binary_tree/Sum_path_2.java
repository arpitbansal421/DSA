package Binary_tree;

import java.util.ArrayList;
import java.util.Scanner;


//given a binary tree and target print the path where the target meets

public class Sum_path_2 {
	
static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		Sum_path_2 m = new Sum_path_2();
		BinaryTree bt = m.new BinaryTree();
		bt.sumOfNodes();
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

		public void sumOfNodes() {
			int item=scn.nextInt();
			ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
			ArrayList<Integer>ques=new ArrayList<>();
			 this.sumOfNodes1(this.root,0,item,ans,ques) ;
			 System.out.println(ans);
		}
		
		private void sumOfNodes1(Node node,int curr,int item,ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>ques) {
			//null node
			if(node==null) {
				return ;
			}
			//leaf node
			if(node.left==null && node.right==null && item-node.data==0) {
				
				
					ques.add(node.data);
					
					ans.add(new ArrayList<>(ques));
					ques.remove(ques.size()-1);
					return;
				}
				
			
			ques.add(node.data);
			sumOfNodes1(node.left,curr,item-node.data,ans,ques);
			sumOfNodes1(node.right,curr,item-node.data,ans,ques);
			ques.remove(ques.size()-1);
			
			return ;
			
//			return lf+rt;
			
			// write your code here
			
			
		}
	}

}
