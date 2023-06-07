o
ackage Binary_tree;

import java.util.*;


public class VerticalOrderTraversalofaBinaryTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	
	//firstly we will make the class of the verticaL pair
	
	public class Verticalpair{
		int ht=0;
		int vt=0;
		TreeNode node;
	}
	
	public  List<List<Integer>>verticalorder(TreeNode Node){
		Verticalpair vp=new Verticalpair();//vertical pair
		
		LinkedList<Verticalpair>Queue=new LinkedList<>();//level order traversal
		
		TreeMap<Integer,ArrayList<Verticalpair>>map=new TreeMap<>();//particular level pe no f of nodes
		
		vp.node=Node;//root node se iterate
		Queue.add(vp);
		
		while(!Queue.isEmpty()) {
			Verticalpair rv=Queue.remove();
			
			if(map.containsKey(rv)) {
				map.get(rv.vt).add(rv);
			}
			map.put(rv.vt, new ArrayList<Verticalpair>());
			
			//left iteration
			if(rv.node.left!=null) {
				Verticalpair nvp=new Verticalpair();
				
				
				nvp.ht=rv.ht+1;
				nvp.vt=rv.vt-1;
				Queue.add(nvp);
				
				
			}
			
			//right iteration
			if(rv.node.right!=null) {
				Verticalpair nvp=new Verticalpair();
				nvp.ht=rv.ht+1;
				nvp.vt=rv.vt+1;
				Queue.add(nvp);
				
			}
			
			
			
			
		}
			
			// output formate
			List<List<Integer>> list = new ArrayList<>();
			for (int key : map.keySet()) {
				List<Verticalpair> ll = map.get(key);
				Collections.sort(ll, new Comparator<Verticalpair>() {

//				

					@Override
					public int compare(Verticalpair o1, Verticalpair o2) {
						// TODO Auto-generated method stub
						
						
						if(o1.ht==o2.ht) {
							return o1.node.val-o2.node.val;
						}
						
						return 0;
					}

				});

				List<Integer> l= new ArrayList<>();
				for (int i = 0; i <ll.size(); i++) {
					l.add(ll.get(i).node.val);

				}
				list.add(l);

			}
		return list;
			
	
	
			
	

//			return list;

		
			
		
		
		
		
		
		
		
		
		
		
		
	
		
	}
	
	
	public static void main(String[]args) {
		
		VerticalOrderTraversalofaBinaryTree tt=new VerticalOrderTraversalofaBinaryTree();
	    
		TreeNode nn=tt.new TreeNode();
		TreeNode left=tt.new TreeNode();
		TreeNode right=tt.new TreeNode();
		nn.val=10;
		
		nn.left=left;
		nn.right=right;
		left.val=20;
		right.val=30;
		
		
		left.right.val=50;
		right.right.val=20;
		right.left.val=60;
		
		List<List<Integer>>ans=new ArrayList<>();
		ans=tt.verticalorder(nn);
		
		System.out.println(ans);
		
		
		
		
		
		
		
	}
	
}
