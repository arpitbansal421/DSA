package Graph;
import java.util.*;
//leetcode 1306
//Given an array of non-negative integers arr, you are initially positioned at start index 
//of the array. When you are at index i, you can jump to i + arr[i] or i - arr[i], check if you can reach to any index with value 0.

//Notice that you can not jump outside of the array at any time
class Solution {
	   
    public boolean canReach(int[] arr, int start) {
        Queue<Integer>qq=new LinkedList<>();
        HashSet<Integer>set=new HashSet<>();
        
        qq.add(start);
        while(!qq.isEmpty()){
            
            int rv=qq.remove();
            
            if(arr[rv]==0){
                return true;
            }
            
            int m1=rv-arr[rv];
            int m2=rv+arr[rv];
            set.add(rv);
                                                                                     
            if(!set.contains(m1)&& m1>=0){
                qq.add(m1);
            }
            
              if(!set.contains(m2)&& m2<arr.length){
                qq.add(m2);
            }
        }
        
        return false;
        
    }
}