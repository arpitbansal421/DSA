package Binary_tree;

import java.util.*;
public class connect_node {
	class Tree{
	    Scanner sc=new Scanner(System.in);


	    class Node{
	        int val;
	        Node left;
	        Node right;
	    

	    public Node(){

	    }

	    public Node(int val){
	        this.val=val;
	    }
	    }
	    Node root=this.createtree();

	    public Node createtree(){

	      Node nn=new Node(sc.nextInt());

	      Queue<Node>qq=new LinkedList<>();
	      qq.add(nn);

	      while(!qq.isEmpty()){

	          Node rv=qq.remove();

	          int a=sc.nextInt();
	          int b=sc.nextInt();

	          if(a!=-1){
	              Node nv=new Node(a);
	              rv.left=nv;
	              qq.add(nv);
	          }
	          if(b!=-1){
	              Node nv1=new Node(b);
	              rv.right=nv1;
	              qq.add(nv1);
	          }
	      }
	      return nn;
	    }

	    public void printright(){

	        Queue<Node>pq=new LinkedList<>();
	        Queue<Node>sq=new LinkedList<>();

	        pq.add(root);
	        

	        while(!pq.isEmpty()){

	            Node rv=pq.poll();
	            
	            if(rv.left!=null){
	                sq.add(rv.left);
	            }

	            if(rv.right!=null){
	                sq.add(rv.right);
	            }

	            if(pq.isEmpty()){
	                System.out.print(-1+" ");
	                pq=sq;
	                sq=new LinkedList<>();
	            }else{
	                System.out.print(pq.peek().val+" ");
	            }


	            }
	        }
	    }

	    

	
	    public static void main (String args[]) {
	        connect_node mm=new connect_node();
	        mm.printright();

	    }

	    public void printright(){
	        Tree tt=new Tree();
	        tt.printright();
	    }
	}


