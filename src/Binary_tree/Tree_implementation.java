package Binary_tree;

import java.util.*;
public class Tree_implementation {
	Scanner sc=new Scanner(System.in);
	
	public class Node{
		Node left;//left child of the tree
		Node right; //right child of the tree
		
		int data;
	}
	
	
	
	private Node root;
	
	
	public  Tree_implementation() {
		
		this.root=create_tree(null,true);
		
	}


	private Node create_tree(Node parent, boolean ilc) {
		// TODO Auto-generated method stub
		
		if(parent==null) {
			System.out.println("Enter the data for parent node");
		}
		else if(ilc) {
			System.out.println("Enter the data for left child"+parent.data);
		}else {
			System.out.println("Enter the data for the rigth child"+parent.data);
		}
		Node nn=new Node();
		int item=sc.nextInt();
		nn.data=item;
		
		System.out.println("Has a left child?");
		boolean lc=sc.nextBoolean();
		if(lc) {
			nn.left=create_tree(nn,true);
		}
		System.out.println("Has a rigth child?");
		boolean rc=sc.nextBoolean();
		if(rc) {
			nn.right=create_tree(nn,false);
		}
		
		
		return nn;
	}
	
	
	public void dispay() {
		this.dispay(this.root);
	}


	private void dispay(Node root) {
		// TODO Auto-generated method stub
		
		//base condition
		if(root==null) {
			return;
		}
		
		String  str=""+root.data;
		
		if(root.left!=null) {
			str=root.left.data+"<<---"+str;
		}else {
			str+=".";
		}
		
		
		if(root.right!=null) {
			str+="<<<<---"+root.right.data;
		}else {
			str+=".";
		}
		
		System.out.println(str);
		dispay(root.left);
		dispay(root.right);
		
	}
	
	public boolean find(int item) {
		return this.find(this.root,item);
	}


	private boolean find(Node root2, int item) {
		// TODO Auto-generated method stub
		
		if(root2==null) {
			return false;
		}
		
		if(root2.data==item) {
			return true;
		}
		boolean l=find(root2.left,item);
		boolean r=find(root2.right,item);
		
		return l||r;
	}
	
	public int min() {
		
		return this.min(this.root);
	}


	private int min(Node root2) {
		// TODO Auto-generated method stub
		
		if(root2==null) {
			return 100000;
		}
		
		int l=min(root2.left);
		int r=min(root2.right);
		
		return Math.min(l,Math.min(root2.data, r));
	}
	
	public int size() {
		return this.size(this.root);
	}


	private int size(Node root2) {
		// TODO Auto-generated method stub
		
		if(root2==null) {
			return 0;
		}
		
		int l=size(root2.left);
		int r=size(root2.right);
		return l+r+1;
	}
	
	//slightly important
	public int ht() {
		return this.ht(this.root);
	}


	private int ht(Node root2) {
		// TODO Auto-generated method stub
		
		if(root2==null) {
			return -1;
		}
		int l=ht(root2.left);
		int r=ht(root2.right);
		return Math.max(l, r)+1;
	}
	
	public void preorder() {
		this.preorder(this.root);
	}


	//root left rigth
	private void preorder(Node root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return;
		}
		
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
		
	}
	
	public void postorder() {
		this.postorder(this.root);
	}


	private void postorder(Node root2) {
		// TODO Auto-generated method stub
		
		if(root2==null) {
			return;
		}
		postorder(root2.left);
		postorder(root2.right);
		System.out.print(root2.data+" ");
		
	}
	
	
	public void inorder() {
		this.inorder(this.root);
	}


	private void inorder(Node root2) {
		// TODO Auto-generated method stub
		
		if(root2==null) {
			return;
		}
		postorder(root2.left);
		System.out.print(root2.data+" ");
		postorder(root2.right);
	
	}
	
	public boolean isbalanced() {
		
		return this.isbalanced(this.root);
	}


	private boolean isbalanced(Node root2) {
		// TODO Auto-generated method stub
		
		if(root2==null) {
			return true;
		}
		boolean lb=isbalanced(root2.left);
		boolean rb=isbalanced(root2.right);
		
		int lh=this.ht(root2.left);
		int rh=this.ht(root2.right);
		
		return lb && rb && Math.abs(lh-rh)<=1;
		
				
	
}
	
	
	public void levelordertraversal() {
		this.levelordertraversal(this.root);
	}


	private void levelordertraversal(Node root2) {
		// TODO Auto-generated method stub
		
		Queue<Node>qq=new LinkedList<>();
		qq.add(root2);
		
		while(!qq.isEmpty()) {
			Node rv=qq.remove();
			
			System.out.print(rv.data+" ");
			
			if(rv.left!=null) {
				qq.add(rv.left);
			}
			
			if(rv.right!=null) {
				qq.add(rv.right);
			}
			
		}
		
	}
	
	
	public void levelorderline() {
		this.levelorderline(this.root);

	}
	private void levelorderline(Node root) {
		// TODO Auto-generated method stub
		
			Queue<Node>p=new LinkedList<>();//primary queue
			Queue<Node>h=new LinkedList<>();//helper queue
			
			List<Integer>sl=new ArrayList<>();//secondary list
			List<List<Integer>>res=new ArrayList<>();//result list
			p.add(root);
			sl.add(root.data);
		
			res.add(sl);
			sl=new ArrayList<>();
			while(!p.isEmpty()) {
				Node rv=p.remove();
				
			
				
				if(rv.left!=null) {
					h.add(rv.left);
					sl.add(rv.left.data);
				}
				
				if(rv.right!=null) {
					h.add(rv.right);
					sl.add(rv.right.data);
				}
				
				if(p.isEmpty()) {
					if(sl.size()!=0) {
						res.add(sl);
					}
				
					sl=new ArrayList<>();
					p=h;
					h=new LinkedList<>();
					
				}
			}
			
			System.out.println(res);
	};
	
	
	//unoptimised approach
	
	//diameter--maximum distance between two nodes
	public int diameter() {
		return this.diameter(this.root);
	}


	private int diameter(Node root) {
		// TODO Auto-generated method stub
		
		if(root==null) {
			return 0;
		}
		
		int lsd=diameter(root.left);
		int rsd=diameter(root.right);
		int lh=this.ht(root.left);
		int rh=this.ht(root.right);
		int sd=lh+rh+2;
		
		return Math.max(lsd, Math.max(rsd, sd));
	}
	
	public int diameter_op() {
		return this.diameter_op(this.root).d;
	}


	
	private class  diapair{
		int h=-1;
		int d=0;
	};
	private diapair diameter_op(Node root) {
		// TODO Auto-generated method stub
		
		if(root==null) {
			return new diapair();
		}
		
		diapair ldp=diameter_op(root.left);//left diameter calculate kiya
		diapair rdp=diameter_op(root.right);//right diameter calculate kiya
		diapair sdp=new diapair();
		sdp.h=Math.max(ldp.h,rdp.h)+1;//hieght calculate ke
		int d=ldp.h+rdp.h+2;//diameter kiya
		sdp.d=Math.max(ldp.d, Math.max(rdp.d, d));//ans set kiya
		
		return sdp;
	}
	
	
	 public boolean isBalanced() {
         
	        return balancedpair(root).b;
		
	        
	    }
	 public boolean isBalanced(Node root) {
         
	        return balancedpair(root).b;
		
	        
	    }
	 public class Balancedpair{
	        
	        int ht=-1;
	        boolean b=true;
	    }
	    
	    
	    public  Balancedpair balancedpair(Node root){
	        
	        if(root==null){
	            return new Balancedpair();
	        }
	        
	        Balancedpair lbs=balancedpair(root.left);
	        
	        Balancedpair rbs=balancedpair(root.right);
	        
	        Balancedpair sbp=new Balancedpair();
	        sbp.ht=Math.max(lbs.ht,rbs.ht)+1;
	        sbp.b=Math.abs(lbs.ht-rbs.ht)<=1 && lbs.b&&rbs.b;
	        
	        return sbp;
	        
	    }
	
	
	}
	
	
	
	
	


