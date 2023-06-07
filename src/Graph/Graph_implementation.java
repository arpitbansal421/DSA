
package Graph;

//in undirected graph we can traverse both ways
//and in directed graph we can only traverse in one direction
import java.util.*;
public class Graph_implementation {
	
	HashMap<Integer,HashMap<Integer,Integer>>map=new HashMap<>();//it will contain a vertix of hashmap along with its neighbours
	
	
	//constructor of hashmap
	public Graph_implementation(int v) {
	
		for(int i=1;i<=v;i++) {
			map.put(i,new HashMap<Integer,Integer>());
		}	
	}
	
	
	//no of vertix of hashmap
	public int noofverices() {
		
		return map.size();
		
	}
	
	//no of edges of hashmap
	public int noofedges() {
		int ans=0;
		for(int nbrs:map.keySet()) {
		ans=ans+map.get(nbrs).size();
		}
		
		return ans/2;
		
	}
	//add edge
	public void addedge(int v1,int v2,int cost) {
		
//		System.out.println("heloo");
		
			map.get(v1).put(v2,cost);
			map.get(v2).put(v1, cost);
		
		
		
		
		
	}
	
	//if edge is present or not
	public boolean isedgepresent(int v1,int v2) {
		
		return map.get(v1).containsKey(v2)&&map.get(v2).containsKey(v1);
	}
	
	//add vetix
	
	public void addvertix(int v1) {
		if(isvertix(v1)) {
			
			map.put(v1, new HashMap<>());
		}
	}
	
	//is vertix prent or not
	
	public boolean isvertix(int v1) {
		return map.containsKey(v1);
	}
	
	//remove edge
	
	   public void removeedge(int v1,int v2) {
		   if(isedgepresent(v1,v2)) {
			   map.get(v1).remove(v2);
			   map.get(v2).remove(v1);
		   }
	   }
	   
	//remove vertix
	
	public void removeertix(int v1) {
		
		for(int nbrs:map.get(v1).keySet()) {
		   map.get(nbrs).remove(v1);
		}
		
		map.remove(v1);
	}
	
	//display function
	public void display() {
		for(int key:map.keySet()) {
			System.out.println(key+"-------"+map.get(key));
		}
	}
	
	
	//ispath present
	
	public boolean ispathpresent(int src,int dis,HashSet<Integer>visited) {
		//base case
		
		if(src==dis) {
			return true;
		}
		
		visited.add(src);
		
		//loop to to check all neibhours
		for(int nbrs:map.get(src).keySet()) {
			if(!visited.contains(nbrs)) {
				
				boolean res=ispathpresent(nbrs,dis,visited);
				if(res) {
					return true;
				}
			}
		}
	
		visited.remove(src);//undo
		return false;
	}
	
	
	///Breadth first search
	
	public boolean bfs(int src,int dis) {
		
		HashSet<Integer>visited=new HashSet<>();//visited mark karne ke liye
		Queue<Integer>q=new LinkedList<>();//queue data structure because bfs is similar to levelorder traversal of tree
		
		q.add(src);//added source to the queue
		while(!q.isEmpty()) {
			int rv=q.remove();
		
			
			//base condition 	
			//checking all the vertex of the map and its neighbous
			if(rv==dis) {
				
				return true;
			}
			
			//step2
			//very very important condition condition to check whether the graph is cyclic or not
			if(visited.contains(rv)) {
				continue;
			}
			
			visited.add(rv);//marking the element
			
			
			//neighbous will be added
			
			for(int nbrs:map.get(rv).keySet()) {
				
				if(!visited.contains(nbrs)) {
					q.add(nbrs);
					
				}
			}
		}
		
		return false;
		
	}
	
	
	///dfs depth first search algorithm
	
	public boolean dfs(int src,int dis) {
		
		Stack<Integer>s=new Stack<>();//we are using stack here as in dfs we explore a branch in depth of exisiting branch
		//would pile down the stack and its neighbours would be visited in the end
		HashSet<Integer>visited=new HashSet<>();
		
		//step1
		s.push(src);
		while(!s.isEmpty()) {
			int rv=s.pop();
			//base condition
			if(rv==dis) {
				return true;
			}
			
			//cyclic node condition
			if(visited.contains(rv)) {
				continue;
			}
			
			visited.add(rv);//marking the element
			
			for(int nbrs:map.get(rv).keySet()) {
			
				
				if(!visited.contains(nbrs)) {
					s.push(nbrs);
					
				}
			}
		    
			
		}
		return false;
	}
	
	
	//breadth search traversal(BST)
	
	public void BST() {
		HashSet<Integer>visited =new HashSet<>();
		
		Queue<Integer>q=new LinkedList<>();//queue data structure
		
		//iterating through all the vertex of the graph
		for(int src:map.keySet()) {
			
			
			if(visited.contains(src)) {
				continue;
				
			}
			q.add(src);//adding the element to the queue
			
			while(!q.isEmpty()) {
				int rv=q.remove();
				
				//cyclic node condition
				if(visited.contains(rv)) {
					continue;
				}
				System.out.print(rv+"--->");
				visited.add(rv);//marking the element
				
				//checking the neighbours of graph
				
				for(int nbrs:map.get(rv).keySet()) {
					if(visited.contains(rv)) {
						q.add(nbrs);
					}
				}
				
				
			}
			
			System.out.println();
			
			
			
			
			
			
		}
	}
	
	
	//dfs traversal
	
	public void DFS() {
		
		HashSet<Integer>visited=new HashSet<>();
		Stack<Integer>s=new Stack<>();
		
		for(int src:map.keySet()) {
			s.push(src);//putting element to the stack
			
			while(!s.isEmpty()) {
				int rv=s.pop();//removing element from stack
				
				if(visited.contains(rv)) {
					continue;
				}
				
				System.out.print(rv+"-->");
				visited.add(rv);//marking the element
				
				for(int nbrs:map.get(rv).keySet()) {
					
					if(!visited.contains(nbrs)) {
						s.push(nbrs);
					}
					
					
				}
				
			}
			
			
		}
		System.out.println();
	}
	
	
	

	
	//cycle is present or not
	
	public boolean iscyclepresent() {
		
		HashSet<Integer>visited =new HashSet<>();//visited set
		Queue<Integer>q=new LinkedList<>();
		
		for(int src:map.keySet()) {
			
			if(visited.contains(src)) {
				continue;
			}
			q.add(src);//element added to the queue
			
			while(!q.isEmpty()) {
				
				int rv=q.remove();
				
				if(visited.contains(rv)) {
					return true;
					
				}
				
				visited.add(rv);//marked
				
				//checking the neighbhours
				for(int nbrs:map.get(rv).keySet()) {
					
					if(!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
		
		return false;
		
	}
	
	//isconnected
	
	public boolean isconnected() {
		HashSet<Integer>visited=new HashSet<>();
		Queue<Integer>q=new LinkedList<>();
		int count=0;
		for(int src:map.keySet()) {
			q.add(src);
			
			if(visited.contains(src)) {
				continue;
			}
			count++;
			
			while(!q.isEmpty()) {
				int rv=q.remove();
				
				if(visited.contains(rv)) {
					continue;
				}
				
				visited.add(rv);//marked 
				
				
				for(int nbrs:map.get(rv).keySet()) {
					if(!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
			
				
			
			
		}
		
		return count==1;
	}
	
	
		
	
	
	
	public boolean isCycle() {
		HashSet<Integer> visited = new HashSet<>();
		Queue<Integer> q = new LinkedList<>();
		for (int src : map.keySet()) {

			if (visited.contains(src)) {
				continue;
			}
			q.add(src);// last me Addition
			while (!q.isEmpty()) {
				// remove
				int rv = q.remove();// fast se remove

				// Ignore if already visited
				if (visited.contains(rv)) {
					return true;
				}

				// Visited Marked
				visited.add(rv);
				// nbrs ko add kr rahe
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}

			}
		}
		return false;

	}
	
	
	public boolean isvalidtree() {
		
		return this.isconnected() && !this.isCycle();
	}
	
	
	
	//Leetcode 684 Redundant Connection
	
	//In this problem, a tree is an undirected graph that is connected and has no cycles.

	//You are given a graph that started as a tree with n nodes labeled from 1 to n, with one additional edge added. 
	//The added edge has two different vertices chosen from 1 to n, and was not an edge that already existed. 
	//The graph is represented as an array edges of length n where edges[i] = [ai, bi] indicates that 
	//there is an edge between nodes ai and bi in the graph.

	//Return an edge that can be removed so that the resulting graph is a tree of n nodes. 
	//If there are multiple answers, return the answer that occurs last in the input.
	
	 HashMap<Integer,HashMap<Integer,Integer>>map1=new HashMap<>();
	    
	   
	    
	    public int[] findRedundantConnection(int[][] edges) {
	        
	        
	        
	        for(int i=1;i<=edges.length;i++){
	            map1.put(i,new HashMap<>());
	         
	            
	            
	        }
	        
	        for(int i=0;i<edges.length;i++){
	            
	            map1.get(edges[i][0]).put(edges[i][1],1);
	            map1.get(edges[i][1]).put(edges[i][0],1);
	        }
	        
	        DisjointSet dsu =new DisjointSet();
	        
	        for(int key:map1.keySet()){
	            
	            dsu.create(key);
	        }
	        
	       for(int[]edge :edges ){
	           
	           int r1=dsu.find(edge[0]);
	           int r2=dsu.find(edge[1]);
	           
	           if(r1==r2){
	               
	               return edge;
	           }else{
	               dsu.union(r1,r2);
	           }
	       }
	        
	        return null;
	        
	        
	        
	        
	    }
	}


	class DisjointSet{
	    
	    
	    class Node{
	        
	    
	    
	    int vtx;//the vertex of set
	    int r;//the hieght tree
	        
	    Node parent;//the representing element of the st
	    
	    
	    
	  
	    
	    }
	    
	    HashMap<Integer,Node>dsu=new HashMap<>();

	    public void create(int vtx){
	        
	       Node nn=new Node();
	        nn.parent=nn;
	        nn.r=0;
	        nn.vtx=vtx;
	        
	        dsu.put(vtx,nn);
	        
	        
	    }
	    
	    public int find(int v1){
	         Node nn=dsu.get(v1);
	        
	        return find(nn).vtx;
	        
	        
	        
	        
	    }
	    
	    
	    public Node find(Node nn){
	        
	        if(nn==nn.parent){
	            return nn;
	        }
	        
	        return find(nn.parent);
	    }
	    
	    public void union(int v1,int v2){
	        Node nn1=dsu.get(v1);
	        Node nn2=dsu.get(v2);
	        
	        Node r1=find(nn1);
	        Node r2=find(nn2);
	        
	        if(r1.r==r2.r){
	            r2.parent=r1;
	            r1.r=r2.r+1;
	        }else if(r1.r>r2.r){
	            r2.parent=r1;
	        }else{
	            r1.parent=r2;
	        }
	    }
	    
	    
	    //leetcode 785
	    
	    //Is Graph Bipardite
	    
	    //if it possible to divide the vertex into mutually exhaustive and exclusive set
	    //such that edges are across set
	    
	    //every non cyclic graph is bipardite 
	    //and every graph of even length is bipardite
	    
	    //in odd mutually exclusive property is failing --logic mutually inclusive property fail //---refrence pep coding is 
	    //graph bipardite vidio 9:02 cf
	    
	    
	    HashMap<Integer,HashMap<Integer,Integer>>map2=new HashMap<>();
	    public boolean isBipartite(int[][] graph) {
	        
	        for(int i=0;i<graph.length;i++){
	           
	            map2.put(i,new HashMap<>());
	        }
	        
	        for(int i=0;i<graph.length;i++){
	            
	            for(int j=0;j<graph[i].length;j++){
	                
	                map2.get(i).put(graph[i][j],1);
	            }
	        }
	      
	        
	        Queue<Bipardite>qq=new LinkedList<>();
	        
	        HashMap<Integer,Integer>set=new HashMap<>();
	        
	        for(int src:map2.keySet()){
	            
	            Bipardite bp=new Bipardite(src,0);
	           
	            if(set.containsKey(bp.vtx)){
	                continue;
	            }
	            
	            qq.add(bp);
	            
	            while(!qq.isEmpty()){
	               
	                Bipardite rv=qq.remove();
	                
	                if(set.containsKey(rv.vtx)){
	                    
	                    if(set.get(rv.vtx)!=rv.lv){
	                         return false;
	                    }
	                    
	                    continue;
	                }
	                
	                set.put(rv.vtx,rv.lv);
	                
	                for(int nbrs:map2.get(rv.vtx).keySet()){
	                    
	                    if(!set.containsKey(nbrs)){
	                     
	                        Bipardite np=new Bipardite(nbrs,rv.lv+1);
	                        qq.add(np);
	                    }
	                }
	                
	                
	            }
	            return true;
	        }}
	            
	            
	            class Bipardite{
	                int vtx;
	                int lv;
	                public Bipardite(int vtx,int lv){
	                    this.vtx=vtx;
	                    this.lv=lv;
	                }
	            }
	            
	            
	            //leetcode 200
	            
	            //Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), 
	            //return the number of islands.

	            	//An island is surrounded by water and is formed by connecting adjacent lands horizontally
	            	//or vertically. You may assume all four edges of the grid are all surrounded by water.
	            
	            public int numIslands(char[][] grid) {
	                int no=0;
	                for(int i=0;i<grid.length;i++){
	                    
	                    for(int j=0;j<grid[i].length;j++){
	                        
	                        if(grid[i][j]=='1'){
	                            no++;
	                            
	                            dfs(grid,i,j);//now we will mark all the island horizontally and vertically
	                        }
	                    }
	                }
	                
	                return no;
	            }
	            
	            
	             void dfs(char[][]grid,int i,int j){
	                
	                if(i<0 || j<0 || i>=grid.length || j>=grid[i].length || grid[i][j]=='0'){
	                  
	                    return; 
	                }
	                
	                
	                grid[i][j]='0';
	                
	             
	                dfs(grid,i+1,j);//bottom
	                dfs(grid,i-1,j);//top
	                dfs(grid,i,j+1);//right
	                dfs(grid,i,j-1);//left
	                
	                return;
	            }
	             
	             
	             
	             
	            
	            
	            
	    
	public static void main(String[]args) {
		Graph_implementation gg=new Graph_implementation(7);
		gg.addedge(1, 2, 10);
		gg.addedge(2, 3, 20);
		gg.addedge(3, 4, 30);
		gg.addedge(1, 4, 50);
		
		gg.addedge(4, 5, 60);
		gg.addedge(5, 6, 70);
		gg.addedge(6, 7, 15);
		gg.addedge(5, 7, 90);
		gg.removeedge(3, 4);
		gg.removeedge(5, 7);                                                                              
		
		
		System.out.println(gg.bfs(1,6));
		System.out.println(gg.dfs(1, 6));
		
		gg.BST();
		gg.DFS();
	
		System.out.println(gg.iscyclepresent());
		System.out.println(gg.isCycle());
		
		
		System.out.println(gg.isconnected());
		
		System.out.println(gg.isvalidtree());
		

//		HashSet<Integer>visited=new HashSet<>();
//		System.out.println(gg.ispathpresent(1, 6,visited));
		
//		gg.display();
		
	}
	
	

}


	
	
	
