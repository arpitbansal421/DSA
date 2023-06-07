package level_up;

import java.util.*;

///A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
//The next permutation of an array of integers is the next lexicographically greater permutation of its integer. 
//More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, //
//then the next permutation of that array is the permutation that follows it in the sorted container. 
//If such arrangement is not possible,
// the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

//simple logic of dictionary
public class Next_permutation {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		nextPermutation(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
				
		
	}
	
	public static void nextPermutation(int[] nums) {
	        
	        int n=nums.length-2;
	        
	        int idx=-1;
	        
	        //we check for the break point 
	        for(int i=nums.length-2;i>=0;i--){
	            
	            if(nums[i+1]>nums[i]){
	                idx=i;
	                break;
	            }
	        }
	        
	        //no break point in the element so the element are sorted in decreasing order
	        
	        if(idx==-1){
	            reverse(nums,0,nums.length-1);
	            return;
	            
	        }
	        
	      
	        
	        int idx2=-1;
	        
	        int i=nums.length-1;
	        
	        //now find the first increasing element from left so that we can make the next greater element
	        while(i>=0){
	            
	                        if(nums[idx]<nums[i]){
	                
	                        idx2=i;
	                            break;
	                
	            }
	            i--;
	        }
	        
	
	        //now swaping the element so that we could have a proper refix
	        
	      
	        int temp=nums[idx];//2
	        nums[idx]=nums[idx2];//3--2
	        nums[idx2]=temp;
	        
	        //now we wiil the reverse the element after idx so that we could have proper increasing order
	        // after our prefix so that dictionary order could be maintain
	        reverse(nums,idx+1,nums.length-1);
	        
	        
	   
	        
	    }
	
	 public static  void reverse(int[]nums,int start ,int end){
	        
	        while(start<end){
	            int temp=nums[start];
	            nums[start]=nums[end];
	            nums[end]=temp;
	            start++;
	            end--;
	        }
	                                                      
	 
	 }
			

}
