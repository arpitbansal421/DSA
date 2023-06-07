package Binary_tree;
import java.util.*;

import Binary_tree.Tree_implementation.Node;
public class Binary_Search_Tree {
	
	public class Node{
		Node left;
		Node right;
		int data;
		
		public Node(int val) {
			this.data=val;
		}
		
		public Node() {
			
		}
	}
	
	private Node root;
	
	public Binary_Search_Tree(int[]arr) {
		
		this.root=createTree(arr,0,arr.length-1);
	}
	
	public Node createTree(int[]arr,int si,int ei) {
		
		if(si>ei) {
			return null;
		}
		Node nn=new Node();
		int mid=(si+ei)/2;
		
		nn.data=arr[mid];
		nn.left=createTree(arr,si,mid-1);
		nn.right=createTree(arr,mid+1,ei);
		
		return nn;
		
		
		
	}
	
	
	public void preorder() {
		preorder(this.root);
	}
	
	private void preorder(Node root) {
		if(root==null) {
			
			return;
			}
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
			
		}
	
	
	public long max(Node root) {
		
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		
		if(root.right==null) {
			return root.data;
		}
		
		return max(root.right);
	}
	
	
	public long min(Node root) {
		if(root==null) {
			return Integer.MAX_VALUE;
		}
		
		if(root.left==null) {
			return root.data;
		}
		
		return min(root.left);
	}
	//leetcode 98
	//is valid tree basically we are given a binary tree we have to check whether this tree is valid bst or not
	
	public boolean isvalidtree() {
		return isvalidbinaryTree(root);
	}
	public boolean  isvalidbinaryTree(Node root) {
		
		if(root==null) {
			return true;
		}
		
		
		boolean lbs=isvalidbinaryTree(root.left);
		boolean rbs=isvalidbinaryTree(root.right);
		//now we knew that for a tree to be valid binary tree the following conditions
		//should be valid
		//the left maximum should be less than root val and the right min minimum should be 
		//greater than root val and left val
		//left and right subtree should be a binary tree
		long leftmax=max(root.left);
		long rightmin=min(root.right);
		
		return lbs&&rbs&&leftmax<root.data&&root.data<rightmin;
		
	}
	
	//optimized code
	class BstPair{
		
		long max=Long.MIN_VALUE;
		long min=Long.MAX_VALUE;
		boolean isvalid=true;
	}
	
	
	public boolean isvalid() {
		return isvalid(root).isvalid;
	}
	public BstPair isvalid(Node root) {
		
		if(root==null) {
			return new BstPair();
		}
		
		
		BstPair lbs=isvalid(root.left);
		BstPair rbs=isvalid(root.right);
		
		BstPair sbst=new BstPair();
		sbst.max=Math.max(rbs.max,root.data);
		sbst.min=Math.min(lbs.min, root.data);
		
		sbst.isvalid=lbs.isvalid &&rbs.isvalid&&lbs.max<root.data&&root.data<rbs.min;
		
		return sbst;
		
	}
	
	//DELETE NODE IN BST
	//LEETCODE 450
	
	
	private Node deletenode(int key) {
		return deletenode(root,key);
	}
	public Node deletenode(Node root,int key) {
		
		if(root==null) {
			return null;
		}
		
		if(key>root.data) {
			
			root.right=deletenode(root.right,key);
		}else if(key<root.data) {
			root.left=deletenode(root.left,key);
		}else {
			
			if(root.left==null) {
				return root.right;
			}
			if(root.right==null) {
				return root.left;
			}else {
				long right_min=min(root.right);
				root.data=(int) right_min;
				
				root.right=deletenode(root.right,(int)right_min);
				
				
		
				
			}
		}
		
		return root;
	}
	
	//leetcode 652
	
	//find the all duplicate subtree in leetcode
    HashMap<String,Node>map=new HashMap<>();
    HashSet<Integer>set=new HashSet<>();
    
    
    public void findduplicatesubtree() {
    	System.out.println(findDuplicateSubtrees(root));
    }
    
    public List<Integer> findDuplicateSubtrees(Node root) {
        duplicate(root);
        
    
        return new ArrayList<>(set);
        
    }
    
    
	 public String duplicate(Node root){
	        
	        if(root==null){
	            return "x";
	        }
	        String left=duplicate(root.left);
	        String right=duplicate(root.right);
	        String s=root.data+" "+left+" "+right;//we can use inorder because structurally indentical ka case faisega
	        //ex [0,0,0,0,null,null,0,null,null,null,0]
	       
	        if(map.containsKey(s)){
	            set.add(map.get(s).data);
	        }else{
	            map.put(s,root);
	        }
	        
	        return s;
	    }
	 
	 //leetcode 701 insert a node into bst
	 
	   public Node insertIntoBst(int val) {
		   return insertIntoBST(root,val);
	   }
	 
	    public Node insertIntoBST(Node root, int val) {
	        
	        if(root==null){
	            
	            return new Node(val);
	        }
	        
	        if(root.data>val){
	            
	            root.left=insertIntoBST(root.left,val);
	}
	        
	        else if(root.data<val){
	            root.right=insertIntoBST(root.right,val);
	        }
	        
	        return root;
	        
	        
	    }
	    
	    //TREENODE 99
	    
//	    You are given the root of a binary search tree (BST),
//	    where the values of exactly two nodes of the tree were swapped by mistake.
//	    Recover the tree without changing its structure.
	    
        Node prev=null;
    Node first=null;
    Node second=null;
	public void recoverTree(Node root) {
	    
	    ArrayList<Node>lsit=new ArrayList<>();
	    //firstly we are finding our sorted list by using inorder traversal because inorder traversal provides us a sorted
	    //list then we will check our first node from front which greater then next value
	    //and our second node from last which is less than our next value the main logic behind this that 
	    //the first will be always in left and second will be always right and we knew that this 
	    //logic could work because if we check simultaneously by using single loop many of corner might come 
	    //like IN 1 3 2etc
	    inorder(root,lsit);
	
	    
	    for(int i=0;i<lsit.size()-1;i++){
	        
	        if(lsit.get(i).data>lsit.get(i+1).data){
	             first=lsit.get(i);
	             break;
	         }
	    }
	    
	    for(int i=lsit.size()-1;i>0;i--){
	        
	        if(lsit.get(i).data<lsit.get(i-1).data){
	            second=lsit.get(i);
	             break;
	        }
	    }
	    
	    int temp=first.data;
	    first.data=second.data;
	    
	    second.data=temp;
	        
	    
	    
	// //}}
	}
	
	
	//space optimized code
	
	//basically in this code we bringing our leftmaxima in each case and checking with our root node
	 public void inorder(Node root,ArrayList<Node>lsit){
	    
	    if(root==null){
	        return;
	    }
	    
	    inorder(root.left,lsit);
	    lsit.add(root);
	    
	     inorder(root.right,lsit);
	    
	     return;
	}
	
	 
	 public void recoverTree_space_optimized(Node root) {
	        
	        ArrayList<Node>lsit=new ArrayList<>();
	        
	        Inorder(root);

	        
//	         for(int i=0;i<lsit.size()-1;i++){
	            
//	             if(lsit.get(i).val>lsit.get(i+1).val){
//	                 first=lsit.get(i);
//	                 break;
//	             }
//	         }
	        
//	         for(int i=lsit.size()-1;i>0;i--){
	            
//	             if(lsit.get(i).val<lsit.get(i-1).val){
//	                 second=lsit.get(i);
//	                 break;
//	             }
//	         }
	        
	        int temp=first.data;
	        first.data=second.data;
	        
	        second.data=temp;
	            
	        
	        
//	     //}}
	    }
	 
	    public void Inorder(Node root){
	        
	        if(root==null){
	            return;
	        }
	        
	        Inorder(root.left);
	        
	        if(prev!=null && prev.data>root.data){
	            
	            if(first==null){
	                first=prev;
	            }
	            
	        
	            
	            second=root;
	        
	            }
	        prev=root;
	        Inorder(root.right);
	    }
	    
	    
	    //leetcode 230
	    //kth smallest element in bst
	   // Given the root of a binary search tree,
	   // and an integer k, return the kth smallest value (1-indexed) of all the values 
	    	//	of the nodes in the tree
	    
	    Node ans=null;
	    int Lastindex=0;
	    public int kthSmallest(Node root, int k) {
	        
//	         ArrayList<TreeNode>lsit=new ArrayList<TreeNode>();
	        // Inorder(root,lsit);
	        inorder(root,k);
	        
//	         for(int i=0;i<lsit.size();i++){
	            
//	             if(i+1==k){
//	                 return lsit.get(i).val;
//	             }
//	         }
	        
	        return ans.data;//for compilation
	        
	    }
	    
//	     public void Inorder(TreeNode root,ArrayList<TreeNode>lsit){
	        
//	         if(root==null){
//	             return;
//	         }
	        
//	         Inorder(root.left,lsit);
//	         lsit.add(root);
//	         Inorder(root.right,lsit);
	        
//	         return;
//	     }
	    
	    
	    //basically in optimized we are travelling depest left
	    //And when we returning we increasing our count 
	    //beacuse deppest left is our first minima
	    //when k==count we are returning that val
	    public void inorder(Node root,int k){
	        
	        if(root==null){
	            return;
	        }
	        
	      
	        
	        inorder(root.left,k);
	        Lastindex++;
	        if(Lastindex==k){
	            ans=root;
	            return ;
	        }
	        
	        inorder(root.right,k);
	        
	    }
	    
	    ///Letcode 968
	    //MinimumCamera Needed
	    //coverd
	    //i have camera 
	    // i nedd camera
	    
	    int ans1=0;
	    public int minCameraCover(Node root) {
	        int ii=minCamera(root);
	        if(ii==-1){
	            return ans1+1;
	        }
	        return ans1;
	        
	        
	        
	    }
	    
	    public int  minCamera(Node root){
	                
	        if(root==null){
	            return 1;//i am covered
	        }
	        
	        int left=minCamera(root.left);
	        int right=minCamera(root.right);
	        
	        if(left==-1|| right==-1){
	         
	            ans1++;
	            return 2;
	        }
	        
	        else if(left==1 && right==1){
	           
	            return -1;
	        }else{
	            return 1;
	        }
	        
	    }
	    
	    //leetcode 124
	    //find the binary search tree maximum
	    int pathsum=Integer.MIN_VALUE;
	    public int maxPath(Node root){
	        
	        if(root==null){
	            return 0;
	        }
	        
	        int left=maxPath(root.left);//0
	        int right=maxPath(root.right);//0
	                        //0+-3                  //-3+0    
	        int sp=Math.max(left+root.data,Math.max(right+root.data,root.data));
	        
	        int rp=Math.max(sp,left+right+root.data);
	       
	        pathsum=Math.max(pathsum,rp);
	        
	        return sp;
	    }
	    
	    //687. Longest Univalue Path
	    
	    //Given the root of a binary tree, return the length of the longest path, 
	    //where each node in the path has the same value. This path may or may not pass through the root.

	    //The length of the path between two nodes is represented by the number of edges between them.
	    int ans12=Integer.MIN_VALUE;
	    int sum=0;
	    public int longestUnivaluePath(Node root) {
	        
	        if(root==null){
	            return 0;
	        }
	        longestUnivalue(root);
	        return ans12;
	        
	        
	        
	        
	    }
	      public int longestUnivalue(Node root) {
	        
	       if(root==null){
	           return 0;
	       }
	        
	        int left=longestUnivalue(root.left);
	        int right=longestUnivalue(root.right);
	        
	       
	        
	        if(root.left!=null && root.left.data==root.data){
	            left+=1;
	        }else{
	            left=0;//here we have return 0 becuase we when the values are not same we consider it as break point and ret
	            //urn 0 
	        }
	        
	         if(root.right!=null && root.data==root.right.data){
	            right+=1;
	        }else{
	             right=0;
	         }
	        
	        ans12=Math.max(ans12,Math.max(left,Math.max(right,left+right)));
	        
	        return Math.max(left,right);
	    
	        
	        
	        
	        
	    }
	      
	      
	      //inorder successor lintcode 448
	      Node successor=null;
	      public Node inorderSuccessor(Node root, Node p) {
	          
	          if(root==null){
	              return null;
	          }

	          if(root.data<=p.data){
	              
	              inorderSuccessor(root.right,p);

	          }

	          if(root.data>p.data){
	              successor=root;
	              inorderSuccessor(root.left,p);
	          }


	          

	          // write your code here
	          return successor;   
	           
	      }
	      
	      //leetcode 915
	      //inorder predeceessor
	      
	      Node predessor=null;
	      
	      public Node inorderPredecessor(Node root, Node p) {
	          // write your code here

	          if(root==null){
	              return null;
	          }

	          if(root.data<p.data){
	              
	              successor=root;
	              inorderPredecessor(root.right,p);

	          }

	          if(root.data>=p.data){
	              inorderPredecessor(root.left,p);
	          }


	          

	          // write your code here
	          return predessor;   
	           }
	      
	      
	      //leetcode 1609
	      //EVEN ODD TREES
	      
	      //A binary tree is named Even-Odd if it meets the following conditions:

	    	  //The root of the binary tree is at level index 0, its children are at level index 1, 
	    	  //their children are at level index 2, etc.
	    	  //For every even-indexed level, all nodes at the level have odd integer values in strictly increasing order 
	    	 // (from left to right).
	    	 // For every odd-indexed level, 
	    	 // all nodes at the level have even integer values in strictly decreasing order (from left to right).
	      
	      public boolean isEvenOddTree(Node root) {
	          
	          Queue<Node>queue=new LinkedList<>();
	          
	          queue.add(root);
	          
	          int lv=0;
	          //level order traversal
	          
	          int max=Integer.MIN_VALUE;
	          int min=Integer.MAX_VALUE;
	         
	          while(!queue.isEmpty()){
	              
	              int size=queue.size();
	           
	              //in this question we will check for each level whether the following condition are meetin or not
	              
	              while(size>0){
	                  
	                  Node rv=queue.remove();
	              
	                  if(rv.left!=null){
	                      queue.add(rv.left);
	                  }
	                  
	                  if(rv.right!=null){
	                      queue.add(rv.right);
	                  }
	                  
	                  //even level
	                  if(lv%2==0 && (rv.data<=max || rv.data%2==0)){
	                    
	                      return false;
	                  }else{
	                   
	                      max=rv.data;
	                    
	                  }
	                  
	                  if(lv%2!=0 &&(rv.data>=min || rv.data%2!=0)){
	                     
	                      
	                      return false;
	                      
	                  }else{
	                      
	                    
	                      min=rv.data;
	                  }
	                  
	                  size--;
	                  
	                  
	              }
	              
	              
	              
	              lv+=1;
	          max=Integer.MIN_VALUE;
	           min=Integer.MAX_VALUE;
	              
	          }
	          
	          return true;
	      
	              
	              
	              
	              //
	          }
	      
	      // Leetcode 988. Smallest String Starting From Leaf  
	      
	      //You are given the root of a binary tree where each node has a value in the range [0, 25] representing the letters 'a' to 'z'.

	      //Return the lexicographically smallest string that starts at a leaf of this tree and ends at the root.

	     // As a reminder, any shorter prefix of a string is lexicographically smaller.
	      
	      
	      
	      
	      
	      
	      String char_ans="~";
	      public String smallestFromLeaf(Node root) {
	          smallestfrmleaf(root,new StringBuilder());
	          
	          return char_ans;
	      }
	      
	      public void smallestfrmleaf(Node root,StringBuilder sb){
	          
	          if(root==null){
	              return ;
	          }
	          
	          sb.append((char)(root.data+'a'));//basically the root.data denotes the interger from 0-25
	          //so 0+ascii of a ==a
	          
	          if(root.left==null && root.right==null){
	              String s=sb.reverse().toString();
	              
	              sb.reverse();
	              
	              if(s.compareTo(char_ans)<1){
	                  char_ans=s;
	              }
	              
	              
	          }
	          smallestfrmleaf(root.left,sb);
	          smallestfrmleaf(root.right,sb);
	          
	          sb.deleteCharAt(sb.length()-1);
	          
	          
	      }
	      
	      
	      //987. Vertical Order Traversal of a Binary Tree
	      
	    //  Given the root of a binary tree, calculate the vertical order traversal of the binary tree.

	      //For each node at position (row, col), its left and right children will be at positions (row + 1, col - 1) 
	      //and (row + 1, col + 1) respectively. The root of the tree is at (0, 0).

	     // The vertical order traversal of a binary tree is a list of top-to-bottom orderings 
	     // for each column index starting from the leftmost column and ending on the rightmost column. 
	      //There may be multiple nodes in the same row and same column. In such a case, sort these nodes by their values.
	      
	      public List<List<Integer>> verticalTraversal(Node root) {
	          
	          Queue<Verticalpair>queue=new LinkedList<>();//it will contain the nodes of the tree
	          TreeMap<Integer,List<Verticalpair>>map=new TreeMap<>();//we are use treemap because
	          //it keep the key in sorted order
	          
	          Verticalpair pp=new Verticalpair(0,0,root);
	          
	          queue.add(pp);
	          //now we will iterate the queue
	          
	          while(!queue.isEmpty()){
	              
	              Verticalpair rv=queue.remove();
	              
	              
	              //it vertical level index is missing so we add new pair and keep all vetical levels in it
	              if(!map. containsKey(rv.vlv)){
	                  
	                  map.put(rv.vlv,new ArrayList<>());
	              }
	              
	              map.get(rv.vlv).add(rv);
	              
	              if(rv.node.left!=null){
	                  
	                  Verticalpair np=new Verticalpair(rv.vlv-1,rv.hlv+1,rv.node.left);//left iteration
	                  queue.add(np);
	              }
	              
	              if(rv.node.right!=null){
	                  Verticalpair np=new Verticalpair(rv.vlv+1,rv.hlv+1,rv.node.right);//right  iteration
	                  queue.add(np);
	              }
	              
	              
	          }
	          
	          List<List<Integer>>res=new ArrayList<>();
	       
	          
	          for(int key:map.keySet()){
	                List<Integer>ans=new ArrayList<>(); 
	              List<Verticalpair>ll=map.get(key);
	              
	              Collections.sort(ll,new Comparator<Verticalpair>(){
	                  
	                  @Override
	                  
	                  public int compare(Verticalpair o1,Verticalpair o2){
	                      
	                      if(o1.hlv==o2.hlv){
	                          
	                          return o1.node.data-o2.node.data;
	                      }
	                      
	                      return 0;
	                  }
	              });
	              
	              for(Verticalpair p:ll){
	                  
	                  ans.add(p.node.data);
	              }
	              
	              res.add(ans);
	          }
	          
	        return res;  
	          
	      }
	      class Verticalpair{
	    	    
	    	    int vlv;
	    	    int hlv;
	    	    
	    	    Node node;
	    	    
	    	    public Verticalpair(int vlv,int hlv,Node node){
	    	        this.vlv=vlv;
	    	        this.hlv=hlv;
	    	        this.node=node;
	    	    }
	    	    
	    	    
	    	    //1305. All Elements in Two Binary Search Trees
	    	    
	    	    //Given two binary search trees root1 and root2, return a list containing all the integers 
	    	    		//from both trees sorted in ascending order.
	    	    
	    	    public List<Integer> getAllElements(Node root1, Node root2) {
	    	        List<Integer>l1=new ArrayList<>();
	    	        List<Integer>l2=new ArrayList<>();
	    	        List<Integer>res=new ArrayList<>();
	    	        
	    	        
	    	         getAllElements(root1,res);
	    	         getAllElements(root2,res);
	    	        
//	    	        inorder(root1,l1);
//	    	        inorder(root2,l2);
	    	        
	    	        //merge two sorted aarray
	    	        int i=0;
	    	        int j=0;
	    	        while(i<l1.size() && j<l2.size()){
	    	            
	    	            if(l1.get(i)<l2.get(j)){
	    	                res.add(l1.get(i));
	    	                i++;
	    	            }else{
	    	                res.add(l2.get(j));
	    	                j++;
	    	            }
	    	        }
	    	        
	    	        while(i<l1.size()){
	    	            res.add(l1.get(i));
	    	            i++;
	    	        }
	    	        
	    	        while(j<l2.size()){
	    	            res.add(l2.get(j));
	    	            j++;
	    	        }
	    	        
	    	        return res;
	    	        
	    	        
	    	        
	    	        
	    	        
	    	    }
	    	    
	    	    public void inorder(Node root,List<Integer>ans){
	    	        
	    	        if(root==null){
	    	            return;
	    	        }
	    	        
	    	        inorder(root.left,ans);
	    	        ans.add(root.data );
	    	        inorder(root.right,ans);
	    	        return;
	    	    }
	    	    
	    	    
    	     public void getAllElements(Node root1,List<Integer>res){
	    	        
    	         if(root1==null){
    	             return;
    	         }
    	         res.add(root1.data);
    	         getAllElements(root1.left,res);
    	         getAllElements(root1.right,res);
	    	        
    	         return;
	    	        
	    	        
    	     }
    	     
    	     
	    	    
	 
    	    // 865. Smallest Subtree with all the Deepest Nodes 
    	     
    	     //Given the root of a binary tree, the depth of each node is the shortest distance to the root.

    	     //Return the smallest subtree such that it contains all the deepest nodes in the original tree.

    	     //A node is called the deepest if it has the largest depth possible among any node in the entire tree.

    	    //The subtree of a node is a tree consisting of that node, plus the set of all descendants of that node.
    	     
    	     HashMap<Node,Integer>map=new HashMap<>();

    	     public Node subtreeWithAllDeepest(Node root) {
    	             map.put(null,-1);
    	         int max_d=Integer.MIN_VALUE;
    	         subtreeWithAllDeepest(root,0);
    	         

    	         
    	         for(Node key:map.keySet()){
    	             
    	             max_d=Math.max(max_d,map.get(key));
    	         }
    	       
    	         return answer(root,max_d);
    	         
    	     }
    	     
    	     public void subtreeWithAllDeepest(Node root,int depth){
    	         
    	         if(root==null){
    	             return;
    	         }
    	         map.put(root,depth);
    	        
    	         subtreeWithAllDeepest(root.left,depth+1);
    	         subtreeWithAllDeepest(root.right,depth+1);
    	         
    	         return;
    	         
    	     
    	 }
    	     
    	     public Node answer(Node root,int max_d){
    	         
    	         if(root==null || map.get(root)==max_d ){
    	             return root;
    	         }
    	         
    	         Node left=answer(root.left,max_d);
    	         Node right=answer(root.right,max_d);
    	         
    	         if(left!=null && right!=null){
    	             return root;
    	         }
    	         else if(right!=null){
    	             return right;
    	         }else{
    	             return left;
    	         }
    	     }
    	     
    	     
    	     
    	     //Lettcode 662. Maximum Width of Binary Tree
    	     
//    	     Given the root of a binary tree, return the maximum width of the given tree.
//
//    	    		 The maximum width of a tree is the maximum width among all levels.
//
//    	    		 The width of one level is defined as the length between the end-nodes 
//    	    		 (the leftmost and rightmost non-null nodes), where the null nodes between the end-nodes that would be present in a
//    	    		 complete binary tree extending down to that 
//    	    		 level are also counted into the length calculation.
    	     
    	     public int widthOfBinaryTree(Node root) {

    	         Queue<TreeWidth>qq=new LinkedList<>();
    	         TreeWidth tt=new TreeWidth(root,0);
    	         qq.add(tt);
    	         int ans=0;
    	         if(root==null){
    	             return ans;
    	         }
    	         while(!qq.isEmpty()){
    	             
    	             int size=qq.size();
    	             int f=0;
    	             int l=0;
    	             
    	             for(int i=0;i<size;i++){
    	                 
    	                 TreeWidth rv=qq.remove();
    	                 if(i==0){
    	                     f=rv.index;
    	                 }
    	                 
    	                 if(i==size-1){
    	                     l=rv.index;
    	                 }
    	                 
    	                 if(rv.node.left!=null){
    	                     TreeWidth np=new TreeWidth(rv.node.left,2*rv.index+1);
    	                     qq.add(np);
    	                 }
    	                 
    	                 if(rv.node.right!=null){
    	                     TreeWidth np=new TreeWidth(rv.node.right,2*rv.index+2);
    	                     qq.add(np);
    	                 }
    	             }
    	       
    	            
    	             ans=Math.max(ans,l-f+1);
    	             
    	         }
    	         
    	         
    	         return (int)ans;
    	         
    	         
    	     
    	        
    	         
    	     }
    	     
    	     class TreeWidth{
    	         
    	         Node node;
    	       
    	         int index=0;//left distance
    	         
    	         public TreeWidth(Node node,int index){
    	             this.node=node;
    	             this.index=index;
    	         }
    	         
    	         public TreeWidth(){
    	             
    	         }
    	     }
    	     
    	     
    	     
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int[]arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		Binary_Search_Tree tt=new Binary_Search_Tree(arr);
		tt.preorder();
		
//		tt.deletenode(20);
		tt.findduplicatesubtree();
		
		
		
		
//		System.out.println(tt.isvalidtree());
		
		System.out.println(tt.isvalid());
		
		tt.insertIntoBst(15);
		tt.preorder();
		
	}}}
	
	
	
	


