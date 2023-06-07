package Graph;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        
        return this.networknodes(n,k);
    }
    
    
    
    HashMap<Integer,HashMap<Integer,Integer>>map;
        
        public Solution(int n){
            this.map=new HashMap<>();
            for(int i=1;i<=n;i++){
                map.put(i,new HashMap<>());
            
        }
        
        
        
    }
    
      public void addedge(int v1,int v2,int cost,int[][]times){
            
          for(int []time: times){
              
              int src=time[0];
              int des=time[1];
              int trvl=time[2];
              map.get(src).put(des,trvl);
          }
          
          
        }
        
        public boolean isedgepresent(int v1,int v2){
            
            return map.get(v1).containsKey(v2);
            
        }
    
    public class DijasktraPair implements Comparable<DijasktraPair>{
        int vtx;//vertex
         String acqvtx;//acquire vertex
        int cost;//total cost
        
        //constructor
        
        public DijasktraPair(int vtx, String acqvtx, int cost){
            this.vtx=vtx;
            this.acqvtx=acqvtx;
            this.cost=cost;
            
        }

		@Override
		public int compareTo(DijasktraPair o) {
			// TODO Auto-generated method stub
			return 0;
		}
       
    }
    public int networknodes(int no,int src){
        int cost=0;
        PriorityQueue<DijasktraPair>pq=new PriorityQueue();
        HashSet<Integer>isvisited=new HashSet<>();
        
        int[]visted=new int[no+1];
        Arrays.fill(visted,-100);
        visted[0]=0;
        DijasktraPair pp=new DijasktraPair(src,""+src,0);
        pq.add(pp);
        
        while(!pq.isEmpty()){
            DijasktraPair rv=pq.remove();
            
        
            
            if(isvisited.contains(rv.vtx)){
                continue;
            }
            
            isvisited.add(rv.vtx);
            visted[rv.vtx]=rv.cost;//check that whether we visited this position or not
            cost+=rv.cost;
            for(int nbrs:map.get(rv.vtx).keySet()){
              if(!isvisited.contains(nbrs)){
                   DijasktraPair np=new  DijasktraPair(nbrs,rv.acqvtx+nbrs,map.get(rv.vtx).get(nbrs));
                  pq.add(np);
                
              }
               
            }
        }
        
        
        for(int i=1;i<=no;i++){
            if(visted[i]==-100){
                return -1;
            }
        }
        return cost;
        
    }
}
