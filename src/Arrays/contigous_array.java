package Arrays;

import java.util.*;
public class contigous_array {
	public int findMaxLength(int[] nums) {
	      
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
            
            
        }
        
        //we are here using logic that if the sum is repeating that means the no of zeoes 
        //and one are eaual as we are making zero as -1 so intermidiate zero and one are cutting each other that is why sum is repating
        
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int last=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            
            if(map.containsKey(sum)){
              
                last=map.get(sum);
                max=Math.max(max,i-last);
                
            }else{
                map.put(sum,i);
            }
        }
        

     
      return max;    
 }

}
