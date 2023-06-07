package Graph;

/*
 * You are given an integer n. There is an undirected graph with n vertices, numbered from 0 to n - 1. You are given a 2D integer array edges where edges[i] = [ai, bi] denotes that there exists an undirected edge connecting vertices ai and bi.

Return the number of complete connected components of the graph.

A connected component is a subgraph of a graph in which there exists a path between any two vertices, and no vertex of the subgraph shares an edge with a vertex outside of the subgraph.

A connected component is said to be complete if there exists an edge between every pair of its vertices.
 * 
 */

//extremely important

import java.util.*;
public class Count_Complete_Component {
	
	class Solution {
	    
	    HashMap<Integer,HashMap<Integer,Integer>>map=new HashMap<>();
	    public int countCompleteComponents(int n, int[][] edges) {
	        
	        for(int i=0;i<n;i++){
	            map.put(i,new HashMap<>());
	        }
	        
	        for(int i=0;i<edges.length;i++){
	            
	            map.get(edges[i][0]).put(edges[i][1],1);
	            map.get(edges[i][1]).put(edges[i][0],1);
	        }
	        
	        HashSet<Integer>set=new HashSet<>();
	        int ans=0;
	        int prev=0;
	        for(int i=0;i<n;i++){
	            if(set.contains(i)){
	                continue;
	            }
	            
	            //now we will calculate the the no of nodes in the component
	            
	            
	            HashSet<Integer>cset=new HashSet<>();
	            
	            
	            dfs(i,cset,set);
	           
	            
	            int vtx=cset.size();
	            
//	             System.out.println(vtx);
	           
//	             System.out.println(cset);
	         
	            
	            ArrayList<Integer>ll=new ArrayList<>(cset);
	            
	            
	             int ed=0;
	            
	            for(int v1:ll){
	                
	                ed+=map.get(v1).size();
	            }
	            
	            //System.out.println(cset);
	            //System.out.println(ed);
	            
	            
	            
	            
	            
	            
	            
	            ed=ed/2;
	            
	            if((((vtx)*(vtx-1))/2)==ed){
	                ans++;
	            }
	            
	            
	           
	            
	            
	                
	                
	        }
	        
	        return ans;}
	        
	        public void dfs(int node,HashSet<Integer>set,HashSet<Integer>cset){
	            
	            
	            if(set.contains(node)){
	                
	                return ;
	            }
	            
	            set.add(node);
	            cset.add(node);
	            
	            for(int nbrs:map.get(node).keySet()){
	                
	                if(!set.contains(nbrs)){
	                    dfs(nbrs,set,cset);
	                    
	                }
	            }
	            
	            return;
	            
	        }
	        
	        
	        
	    }


}
