package Graph;

import java.util.*;
/*
 * kruskal and prism do not works for directed graph as they assume to be it a cycle  
 * 
 */

public class Dijkstra_Algo{
	
	HashMap<Integer,HashMap<Integer,Integer>>map;
	
	//now we will make an constructor
	
	public Dijkstra_Algo(int v) {
		this.map=new HashMap<>();
		for(int i=1;i<=v;i++) {
			map.put(i, new HashMap<>());
		}
		
		
	
}
	public void addedge(int v1,int v2,int cost) {
		map.get(v1).put(v2,cost);
		map.get(v2).put(v1, cost);
		
		
	}
	
	
	public class DikstraPair implements Comparable<DikstraPair>{
		
		int vtx;//the current vertex of 
		String acqvtx;//the net path
		int cost;//total cost
		
		public DikstraPair(int vtx,String acqvtx,int cost) {
			this.vtx=vtx;
			this.acqvtx=acqvtx;
			this.cost=cost;
		}

		@Override
		public int compareTo(DikstraPair o) {
			// TODO Auto-generated method stub
			return this.cost-o.cost;
		}
		 
		
		@Override
		
		public String toString() {
			return this.vtx+" "+ this.acqvtx+" @ "+this.cost;
		}
	}


	
	
	
	public void dijastra_algo(int src) {
		
		PriorityQueue<DikstraPair>pq=new PriorityQueue();
		HashSet<Integer>isvisited=new HashSet<>();//for marking the visited element
		
		DikstraPair pp=new DikstraPair(src,"1",0);
		
		
		
		
		
		pq.add(pp);
		
		
	
		
		while(!pq.isEmpty()) {
		
			DikstraPair rv=pq.remove();
			
			if(isvisited.contains(rv.vtx)) {
				continue;
			}
			
			if(src!=rv.vtx ) {
				
				System.out.print(rv.cost+" ");
			}
			
			
			isvisited.add(rv.vtx);
			//checking the neighbours of vtx
			for(int nbrs:map.get(rv.vtx).keySet()) {
				
				if(!isvisited.contains(nbrs)) {
					
					DikstraPair np=new DikstraPair(nbrs,rv.acqvtx+nbrs,rv.cost+map.get(rv.vtx).get(nbrs));
					pq.add(np);
					
				}
			}
		}
		
		
		
	}
		
		
		
		
	


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int v=sc.nextInt();
			Dijkstra_Algo dd=new Dijkstra_Algo(v);
			int e=sc.nextInt();
			
			for(int i=1;i<=e;i++) {
				int v1=sc.nextInt();
				int v2=sc.nextInt();
				int cost=sc.nextInt();
				dd.addedge(v1, v2, cost);
				
			}
			int src=sc.nextInt();
					
			dd.dijastra_algo(src);
		}
		
		
//		    	1
//		    	4 4
//				1 2 24
//				1 4 20
//				3 1 3
//				4 3 12
//			 	1
  

	}

}
