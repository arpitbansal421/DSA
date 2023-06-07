package level_up;

import java.util.*;
//Given an array of integers nums, find the maximum length of a subarray where the product of all its elements is positive.

//A subarray of an array is a consecutive sequence of zero or more values taken out of that array.

//Return the maximum length of a subarray with positive product.
public class Maximum_length_positive_product {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
	}
	
	//if we encounter a zero we will start a new subarray because zero into any ting is equsal to the zero
	//we increase the length array till all element are positive or we have even negative numbers in our array
	//we firstly check from left side
	//then from right side\
	//for this case [1,2,-3,4,6,8]
	public static int getMaxLen(int[] nums) {  
	        
	        int pos=-1;
	        int product=1;
	        int maxlen=0;
	        int ans=0;
	       
	        
	        for(int i=0;i<nums.length;i++){
	            
	            if(nums[i]==0){
	                product=1;
	                pos=i;
	                maxlen=0;
	            }else if(nums[i]!=0){
	                product=product*nums[i];
	                
	                product=product/(Math.abs(product));
	                
	                if(product>0){
	                    maxlen=i-pos;
	                    ans=Math.max(maxlen,ans);
	                    
	                }
	                
	                
	            }
	                
	            
	        }
	        
	        System.out.println(ans);
	        product=1;
	        pos=nums.length;
	        for(int i=nums.length-1;i>=0;i--){
	            
	                  if(nums[i]==0){
	                    product=1;
	                    pos=i;
	                    maxlen=0;
	            }else if(nums[i]!=0){
	                product=product*nums[i];
	                
	                product=product/(Math.abs(product));
	                
	                if(product>0){
	                    maxlen=pos-i;
	                    ans=Math.max(maxlen,ans);
	                    
	                }
	                
	                
	            }
	            
	            
	        }
	        
	            
	        
	        
	        
	        return ans;
	                                      
	        
	    }
	

}
