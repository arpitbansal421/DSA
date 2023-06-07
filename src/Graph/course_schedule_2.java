package Graph;
import java.util.*;

/*There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. 
 * You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want 
 * to take course ai.

For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
Return the ordering of courses you should take to finish all courses. If there are many valid answers, 
return any of them. If it is impossible to finish all courses, return an empty array.
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class course_schedule_2 {
HashMap<Integer,HashMap<Integer,Integer>>map=new HashMap<>();
    
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        for(int i=0;i<numCourses;i++){
            
            map.put(i,new HashMap<>());
        }
        
        for(int i=0;i<prerequisites.length;i++ ){
            
            int a=prerequisites[i][1];
            
            int b=prerequisites[i][0];
            
            map.get(a).put(b,1);
        }
        
        int[]ind=indgree();
    
        int[]ans=new int[map.size()];
        int i1=0;//for tracking the no of elements
        Queue<Integer>qq=new LinkedList<>();
        for(int i=0;i<ind.length;i++){
            
            if(ind[i]==0){
              
                qq.add(i);
            }
        }
        
        while(!qq.isEmpty()){
            int rv=qq.remove();
        
            ans[i1]=rv;
            i1++;
            
            for(int nbrs:map.get(rv).keySet()){
                ind[nbrs]--;
                if(ind[nbrs]==0){
                    qq.add(nbrs);
                }
            }
            
            
        }
        
        return i1==map.size()?ans:new int[0];
        
        
        
        
    }
    
    
    public int[]indgree(){
        
        int[]ans=new int[map.size()];
        
        for(int key:map.keySet()){
            
            for(int nbrs:map.get(key).keySet()){
                
                ans[nbrs]++;
            }
        }
        
        return ans;
    }
    
    

}
