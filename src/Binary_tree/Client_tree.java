package Binary_tree;

import java.util.*;
public class Client_tree {
	
	public static void main(String[] args) {
		Tree_implementation tt=new Tree_implementation();
		tt.dispay();
		boolean k=tt.find(0);
		int a=tt.min();
		System.out.println(a);
		System.out.println(k);
		int c=tt.size();
		int d=tt.ht();
		
		System.out.println(tt.diameter());
		System.out.println(tt.diameter_op());
		
//		tt.preorder();
//		System.out.println();
//		tt.postorder();
//		System.out.println();
//		tt.inorder();
//		tt.levelordertraversal();
		tt.levelorderline();
		System.out.println(tt.isbalanced());
		
		System.out.println(tt.isBalanced());
//		System.out.println(c);
//		System.out.println(d);
	}

}

//60 true 20 true 30 false false true 40 false false true 15 true 35 false false true 46 false false