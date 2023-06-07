package Bitmasking;

import java.util.*;
public class Missing_number_bitwise_xor {
	 public int missingNumber_bitwise_Xor(int[]nums){
	        
	        int x=0;
	        int y=0;
	        
	        for(int i=0;i<nums.length;i++){
	            x^=nums[i];
	        }
	        
	        for(int i=0;i<=nums.length;i++){
	            y^=i;
	        }
	        
	        return x^y;
	        
	    }

}
          