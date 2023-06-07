package Bitmasking;

import java.util.*;
//
//We are given an array containg n numbers. All the numbers are present 
//thrice except for one number which is only present once. 
//Find the unique number. Only use - bitwise operators, and no extra space.
public class unique_number111 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		
		for(int i=0;i<arr.length;i++){
			
			arr[i]=sc.nextInt();
		}
		
		unique_number111(arr);
		
			
	}
	
	public static void unique_number111(int[]arr) {
		
		int[]ans=new int[32];//an array of size 32 bits
		
		for(int i=0;i<arr.length;i++) {
			int no=arr[i];//no will fill are ans array
			int j=0;
			while(no>0) {
				
				if((no&1)!=0) {
					ans[j]+=(no&1);
				}
				
				no=no>>1;
				
		        j++;
					
				
			}
		}
		
		//no we take module of array as every bit will in form of 3N or 3n+1
		for(int i=0;i<ans.length;i++) {
			ans[i]=ans[i]%3;
		}
		
		
		int pos=0;//will track the position
		int res=0;
		for(int i=0;i<ans.length;i++){
			
			res+=ans[i]*(1<<pos);
			pos++;
		
			
		}
		
		
		System.out.println(res);
		
		
		
	}
	
	
	///unique number 3 with constant space
	
	  public int singleNumber(int[] nums) {
	        int ans=0;
	        for(int i=0;i<32;i++){
	            int sum=0;
	            for(int j=0;j<nums.length;j++){
	                
	                if(((nums[j])&1<<i)!=0){
	                    sum++;
	                }
	            
	            }
	            
	            
	            sum%=3;
	            
	            if(sum==1){
	                ans|=1<<i;
	            }
	        }
	            
	        
	        
	        return ans;
	        
	    }

}
