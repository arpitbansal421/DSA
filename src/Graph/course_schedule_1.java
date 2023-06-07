package Graph;
import java.util.*;
//leetcode 207 course schulde
//There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. 
//You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi 
//first if you want to take course ai.

//For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
//Return true if you can finish all courses. Otherwise, return false.
public class course_schedule_1 {
	
	 HashMap<Integer,HashMap<Integer,Integer>>map=new HashMap<>();
	    public boolean canFinish(int numCourses, int[][] prerequisites) {
	        
	        for(int i=0;i<numCourses;i++){
	            map.put(i,new HashMap<>());
	            
	        }
	        
	        
	        for(int i=0;i<prerequisites.length;i++){
	            
	            int a=prerequisites[i][0];
	            int b=prerequisites[i][1];
	            
	            map.get(a).put(b,1);
	        }
	        
	        //topological sort
	        int[]ind=indegree();
	        int count=0;
	        Queue<Integer>qq=new LinkedList<>();
	        for(int i=0;i<ind.length;i++){
	            
	            if(ind[i]==0){
	                
	                qq.add(i);
	                
	                
	                
	            }
	        }
	            
	            while(!qq.isEmpty()){
	                count++;
	                
	                int rv=qq.remove();
	                
	                for(int nbrs:map.get(rv).keySet()){
	                    
	                    ind[nbrs]--;
	                    
	                    if(ind[nbrs]==0){
	                        
	                        qq.add(nbrs);
	                    }
	                }
	                
	            }
	        
	          return count==map.size();
	        }
	        
	        
	    
	    
	    public int[]indegree(){
	        
	        int[]ans=new int[map.size()];
	        
	        for(int key:map.keySet()){
	            
	            for(int nbrs:map.get(key).keySet()){
	                
	                ans[nbrs]++;
	            }
	            
	        }
	        
	        return ans;
	    }

}
