package Binary_tree;

import java.util.*;
public class big_bang_theory_of_trees {


    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
     
        int n=sc.nextInt();
        int k=sc.nextInt();
        int x=sc.nextInt();
       
 

        big_bang_theory_of_trees mm=new big_bang_theory_of_trees();
        System.out.println(mm.iswinner(k,x));



    }
    class Tree{
        Scanner scn=new Scanner(System.in);



        class Node{

            Node left;
            Node right;
            int val;
            public Node(int val){
                
                this.val=val;
            }

            public Node(){

            }
        }

         Node root=this.preorder();

         public Node rnode(){
             return root;
         }
      
        public  Node preorder(){

           return  preorder(root);
        }

        public Node preorder(Node root){
        	
        	

            int data=scn.nextInt();
            if(data==-1){
                return null;
            }
         
            
            Node nn=new Node(data);
            nn.left=preorder(nn.left);
            nn.right=preorder(nn.right);
            return nn;
            
            

         
           
         
        

          
          
           
        }
    

    int lc=0;
    int rc=0;

    public boolean gamewinningmove(int n,int x){
        lc=0;
        rc=0;

       

        

        count(root,x);
        
        int p=n-(rc+lc+1);
        int max=Math.max(lc,Math.max(rc,p));

        return max>n/2;

    }

    public int count(Node root,int x){
        if(root==null){
            return 0;
        }
        int left=count(root.left,x);
        int right=count(root.right,x);

        if(root.val==x){
            lc=left;
            rc=right;
        }

        return left+right+1;
    }
    }
    

    public int iswinner(int n,int x){
    	
        Tree tt=new Tree();
         boolean isp=tt.gamewinningmove( n, x);

         return isp==true?1:0;
    }

}
