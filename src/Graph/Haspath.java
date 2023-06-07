package Graph;
import java.util.*;
/*
 * 1971. Find if Path Exists in Graph
 * There is a bi-directional graph with n vertices, where each vertex is labeled from 0 to n - 1 (inclusive). The edges in the graph are represented as a 2D integer array edges, where each edges[i] = [ui, vi] denotes a bi-directional edge between vertex ui and vertex vi. Every vertex pair is connected by at most one edge, and no vertex has an edge to itself.

You want to determine if there is a valid path that exists from vertex source to vertex destination.

Given edges and the integers n, source, and destination, return true if there is a valid path from source to destination, or false otherwise.

 
 * 
 * 
 */
public class Haspath {
	   public boolean validPath(int n, int[][] edges, int source, int destination) {
	        Graph gg=new Graph(n);
	        gg.addedge(edges);
	        if(source==destination){
	            return true;
	        }
	        return gg.haspath(source,destination);
	    }


	    class Graph{

	        HashMap<Integer,HashMap<Integer,Integer>>map=new HashMap<>();

	        public Graph(int n){

	        

	            for(int i=0;i<n;i++){

	                map.put(i,new HashMap<>());
	            }}



	            public void addedge(int[][]edges){

	            for(int i=0;i<edges.length;i++){
	                map.get(edges[i][0]).put(edges[i][1],0);
	                map.get(edges[i][1]).put(edges[i][0],0);
	            }

	            System.out.print(map);
	            
	        }

	        public boolean haspath(int src,int dis){


	            if(src==dis){
	                return true;
	            }
	            HashSet<Integer>set=new HashSet<>();//mark karne ke liye

	            Queue<Integer>qq=new LinkedList<>();//levelorder traversal

	            qq.add(src);

	            while(!qq.isEmpty()){

	                int rv=qq.remove();

	                if(rv==dis){
	                    return true;
	                }

	                if(set.contains(rv)){

	                    continue;
	                }

	                set.add(rv);


	                //marking all neighbours

	                for(int nbrs:map.get(rv).keySet()){

	                    if(!set.contains(nbrs)){
	                        qq.add(nbrs);
	                    }
	                }
	            }

	            return false;
	        }
	    }
	}

}
