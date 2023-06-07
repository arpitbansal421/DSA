package leetcode_question;

import java.util.*;

public class Smallest_neighbours {
	
	static HashMap<Integer,HashMap<Integer,Integer>>map=new HashMap<>(); 
	public static void main(String[] args) {
		
	
		Smallest_neighbours ss=new Smallest_neighbours();
		int[][]edes= {{0,1,3},{1,2,1},{1,3,4},{1,2,1},{2,3,1}};
		
		
		for(int i=0;i<4;i++) {
			map.put(i, new HashMap<>());
			
		}
		
		for(int i=0;i<4;i++) {
			map.get(edes[i][0]).put(edes[i][1],edes[i][2]);
			map.get(edes[i][1]).put(edes[i][0], edes[i][2]);
			
		}
		

		ss.Smallestneighbours(2);
		
		
	}
	
	
	  public class dijaskraPair implements Comparable<dijaskraPair>{
		int vtx;
		int t;
		int cost;
		
		
		public dijaskraPair(int vtx,int t,int cost) {
			this.vtx=vtx;
			this.t=t;
			this.cost=cost;
		
		}

		@Override
		public int compareTo(dijaskraPair o) {
			// TODO Auto-generated method stub
			return this.cost-o.cost;
		}
		
		
	}
	  

	 

	
	public void Smallestneighbours(int th) {
		
		int ans=Integer.MIN_VALUE;
		int city=-1;
		for(int i=0;i<map.size();i++) {
			System.out.println(map.size());
//			ans=Math.max(ans, dijasktra_algo(i,th));
			if(ans>=dijasktra_algo(i,th)) {
				city=i;
			}
			
		}
		
		System.out.println(city);
		
	}

	private int dijasktra_algo(int i, int th) {
		// TODO Auto-generated method stub
		
		HashSet<Integer>visited=new HashSet<>();
		PriorityQueue<dijaskraPair>qq=new PriorityQueue<>();
		int ans=Integer.MIN_VALUE;
		dijaskraPair pp=new dijaskraPair(i,0,0);
		
		qq.add(pp);
		while(!qq.isEmpty()) {
			
			dijaskraPair rv=qq.remove();
			
			if(visited.contains(rv.vtx)) {
				continue;
			}
			
			if(rv.cost<=th) {
				rv.t=rv.t+1;
			}
			
			ans=Math.max(ans, rv.t);
			visited.contains(rv.vtx);
			
			for(int nbrs:map.keySet()) {
				
				if(!visited.contains(nbrs)) {
					dijaskraPair np=new dijaskraPair(nbrs,rv.t,rv.cost+map.get(rv.vtx).get(nbrs));
					
					qq.add(np);
				}
			}
			
		}
		return ans;
	}

}
