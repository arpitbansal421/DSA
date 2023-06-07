package Graph;

import java.util.*;
public class prism {
	//firstly we created the map
	HashMap<Integer,HashMap<Integer,Integer>>map=new HashMap<>();
	
	public prism(int v) {                                                                                                                                                  
		for(int i=1;i<=v;i++) {
			map.put(i, new HashMap<>());//an empty hashmap is put across each vertex for its neighbour and its cost
			
		}
	}
	
	//add edge code
	public void addedge(int v1,int v2,int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	
	//now will create and DikstraPair class so that we can put in the priority queue
	public class edgepair implements Comparable<edgepair>{
		
		int vtx;
		int  aqvtx;
		int cost;
		
		
		//creating the constructor
		public edgepair(int vtx,int aqvtx,int cost) {
			this.vtx=vtx;
			this.aqvtx=aqvtx;
			this.cost=cost;
		}
		
		@Override
		public int compareTo(edgepair o) {
			// TODO Auto-generated method stub
			return this.cost-o.cost ;
		}
		
		@Override
		public  String toString() {
			return this.vtx+" via "+ this.aqvtx+" @ "+this.cost;
			
		}
		
		
	}
	
	//prism algo
	//the prism algorithm is similar to bfs the the difference the instead queue we are using priotity queue
	//so that we can have local minima always at the bottom
	
	public void prismalgo() {
		
		HashSet<Integer>isvisited=new HashSet<>();//marking visited 
		
		PriorityQueue<edgepair>pp=new PriorityQueue<>();//priority queue
		
		edgepair ep=new edgepair(1,1,0);
		pp.add(ep);//for iteration
		
		//now the entire code will be similar to the bfs
		while(!pp.isEmpty()) {
			
			edgepair rv=pp.remove();//now removing the DikstraPair
			
			//now checking the circular array condition
			if(isvisited.contains(rv.vtx)) {
				continue;
			}
			
			isvisited.add(rv.vtx);//marking the element
			System.out.println(rv);
			
			//now checking the neibhours of the array
			for(int nbrs:map.get(rv.vtx).keySet()) {
				if(!isvisited.contains(nbrs)) {
					 edgepair np =new edgepair(nbrs,rv.vtx,map.get(rv.vtx).get(nbrs));
					 pp.add(np);
				}
			}
			
			
		}
		
		
	}
	
	public static void main(String[]args) {
		
		prism p=new prism(7);
		p.addedge(1, 2, 20);
		p.addedge(2, 3, 5);
		p.addedge(1, 4, 60);
		p.addedge(3, 4, 10);
		p.addedge(5, 6, 70);
		p.addedge(5, 7, 10);
		p.addedge(6, 7, 13);
		p.prismalgo();
		
	}

}
