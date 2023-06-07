package Arrays;
/*
 * 628. Maximum Product of Three Numbers
 * Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
 * 
 * 
 */

import java.util.*;
public class Maximum_product_of_three_numbers {
	public int maximumProduct(int[] nums) {
        int c1=Integer.MIN_VALUE;
        int c2=Integer.MIN_VALUE;
        int c3=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){

            if(nums[i]>c1){
                int no=c1;
                c1=nums[i];
                int no2=c2;
                c2=no;
                c3=no2;
            }else if(nums[i]>c2){
                int no=c2;
                c2=nums[i];
                c3=no;
            }else if(nums[i]>c3){
                c3=nums[i];
            }

            if(min1>nums[i]){
              
                int n1=min1;
                min1=nums[i];
                min2=n1;

            }else if(min2>nums[i]){
                min2=nums[i];
            }
      
        }

      

        return Math.max(c1*c2*c3,c1*min1*min2);
        
    }

}
