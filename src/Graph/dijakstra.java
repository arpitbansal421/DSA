 package Graph;


//Dijakstra -this algorithm is use for single source shortest path from a starting node to end node
import java.util.*;
public class dijakstra {
	
	
	HashMap<Integer,HashMap<Integer,Integer>>map=new HashMap<>();//this hashmap is use for key value pair
	//now constructor
	
	public dijakstra(int v) {
		
		for(int i=1;i<=v;i++) {
			map.put(i, new HashMap<>());
		}
	}
	
	//now edge method
	public void addedge(int v1,int v2,int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
		//undirected graph
	}
	
	//now we create an edge pair class which will contain the following information
	//int vtx
	//string acqvtx
	//int cost
	public class DikstraPair implements Comparable<DikstraPair>{
		
		int vtx;
		int cost;
		String acqvtx;
		
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
			return this.vtx+" "+"via "+this.acqvtx+"@ "+this.cost;
		}
		
		
	}
	
	//now we will create our dijaskstra method
	//similar to bfs ,and prism
	
	public void dijaskstraalgo(int src) {
		
		HashSet isvisited=new HashSet<>();//for marking elements
		
		PriorityQueue<DikstraPair> pq=new PriorityQueue<DikstraPair>();
		
		DikstraPair ep=new DikstraPair(1,"1",0);
		
		pq.add(ep);
		while(!pq.isEmpty()) {
			
			DikstraPair rv=pq.remove();
			
			//now checking the circular array condition
			if(isvisited.contains(rv.vtx)) {
				continue;
			}
			//now marking the element
			isvisited.add(rv.vtx);
			
//		    if(src==rv.vtx) {
//		    	
//		    	System.out.println(rv.cost+" ");
//		    }
			//now checking the neighbours of the vertex
			for(int nbrs:map.get(rv.vtx).keySet()) {
				if(!isvisited.contains(nbrs)) {
					DikstraPair np=new DikstraPair(nbrs, rv.acqvtx+nbrs,rv.cost+map.get(rv.vtx).get(nbrs));
					pq.add(np);
				}
			}
			
			
		}
		
		
		
		
		
	}
//	public static void main(String[]args) {
//		Scanner sc=new Scanner(System.in);
//		int t=sc.nextInt();
//		
//		while(t-->0) {
//			int v=sc.nextInt();
//			dijakstra da=new dijakstra(v);
//			int e=sc.nextInt();
//			for (int i = 1; i <=e; i++) {
//				int v1=sc.nextInt();
//				int v2=sc.nextInt();
//				int cost=sc.nextInt();
//				da.addedge(v1, v2, cost);
//				
//
//			}
//			int src=sc.nextInt();
//			da.dijaskstraalgo(src);
//	
//			
//		}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int v=sc.nextInt();
			dijakstra dd=new dijakstra(v);
			int e=sc.nextInt();
			
			for(int i=1;i<=e;i++) {
				int v1=sc.nextInt();
				int v2=sc.nextInt();
				int cost=sc.nextInt();
				dd.addedge(v1, v2, cost);
				
			}
			
			int src=sc.nextInt();	
			dd.dijaskstraalgo(src);
	
	
	}
	
	

}}
