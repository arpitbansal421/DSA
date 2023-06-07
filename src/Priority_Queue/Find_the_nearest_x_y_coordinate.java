package Priority_Queue;
import java.util.*;
//leetcode 1779
/*You are given two integers, x and y, which represent your current location on a Cartesian grid: (x, y).
 *  You are also given an array points where each points[i] = [ai, bi] represents that a point exists at (ai, bi).
 *   A point is valid if it shares the same x-coordinate or the same y-coordinate as your location.

Return the index (0-indexed) of the valid point with the smallest Manhattan distance from your current location. 
If there are multiple, return the valid point with the smallest index. If there are no valid points, return -1.

The Manhattan distance between two points (x1, y1) and (x2, y2) is abs(x1 - x2) + abs(y1 - y2).
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class Find_the_nearest_x_y_coordinate {
	 public int nearestValidPoint(int x, int y, int[][] points) {
	        
	        int mind=Integer.MAX_VALUE;
	        int id=-1;      HashMap<Character,Integer>flinceseplate=new HashMap<>();
	        for(int []point:points){
	            
	            if(x==point[0]|| y==point[1]){
	            int dis=Math.abs(x-point[0])+Math.abs(y-point[1]);
	            if(dis==0){
	                id=0;
	            }
	            else if(mind>dis){
	                mind=dis;
	                id=point[0];
	            }else if(mind==dis){
	                if(point[0]<id){
	                    id=point[0];
	                }
	            }
	                
	                }
	            
	           
	        }
	        
	        return id;
	        
	    
	        
	      
	    }

}
