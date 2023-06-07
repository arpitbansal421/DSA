package Graph;

import java.util.*;
public class Bellmon_ford {
	
	HashMap<Integer,HashMap<Integer,Integer>>map=new HashMap<>();
	
	//add edge function
	
	public Bellmon_ford(int v) {
		
		for(int i=1;i<=v;i++) {
			map.put(i, new HashMap<>());
		}
	}
	
	public Bellmon_ford() {
		for(int i=1;i<=10;i++) {
			map.put(i, new HashMap<>());
		}
	}
	
	public void addedge(int v1,int v2,int cost) {
		
		map.get(v1).put(v2, cost);
		
		
		
		
	}
	
	public class Edge {
		
		int v1;//vertex 1
		int v2;//vertex2
		
		int cost;//vertex
		
		public Edge() {
			this.v1=v1;
			this.v2=v2;
			this.cost=cost;
		}
		
		public Edge(int v1,int v2,int cost) {
			this.v1=v1;
			this.v2=v2;
			this.cost=cost;
		}
	@Override
	
	public String toString() {
		
		return this.v1+" via@ "+this.v2+" @cost"+this.cost;
	}}
		
		public ArrayList<Edge>getedgepair(){
			ArrayList<Edge>li=new ArrayList<>();
			
			
			for(int vtx:map.keySet()){
				
				for(int nbrs:map.get(vtx).keySet()) {
					Edge ep=new Edge(vtx,nbrs,map.get(vtx).get(nbrs));
					li.add(ep);
					
					
				}
				
			}
			return li;
		}
		

	
		
	
		
		
	/*you have to relax avery edge v-1 times
	 * 
	 * 
	 * 
	 */
	
	public void Bellmonford() {
		int v=map.size();
		
		int[]dis=new int[map.size()+1];
		Arrays.fill(dis, 100000);
		dis[1]=0;
		ArrayList<Edge>alledge=this.getedgepair();
		for(int i=1;i<v;i++) {
			
			for(Edge ep:alledge) {
				
				int oldcost=dis[ep.v2]; 
				int newcost=dis[ep.v1]+ep.cost;
				
				if(oldcost>newcost) {
					if(i!=v) {
					dis[ep.v2]=newcost;
				}else {
					System.out.println("negative cycle");
				}
				
		}}}
			
			for(int i=1;i<dis.length;i++) {
				System.out.println(i+"--> "+dis[i]);
			}
		
		
	}
	
	
	public static void main(String[] args) {
		Bellmon_ford bf = new Bellmon_ford(5);
		bf.addedge(1, 2, 8);
		bf.addedge(1, 3, 4);
		bf.addedge(1, 4, 5);
		bf.addedge(2, 5, 1);
		bf.addedge(5, 2, 2);
		bf.addedge(3, 4, -3);
		bf.addedge(4, 5, 1);
		bf.Bellmonford();

	}
	
	

}
