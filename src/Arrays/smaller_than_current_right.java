package Arrays;
import java.util.*;
/*
 * 315. Count of Smaller Numbers After Self
 * Given an integer array nums, return an integer array counts where counts[i] is the
 * number of smaller elements to the right of nums[i].

 
 * 
 * 
 */

public class smaller_than_current_right {
	 int[]count;
	    public List<Integer> countSmaller(int[] nums) {
	        count=new int[nums.length];
	 
	        int[]ind=new int[nums.length];
	        for(int i=0;i<nums.length;i++){
	            ind[i]=i;
	           
	        }
	        
	        int[]ans=sort(ind,0,ind.length-1,nums);
	        
	        List<Integer>a1=new ArrayList<>();
	        for(int ele:count){
	            a1.add(ele);
	        }
	        
	        return a1;
	        
	    }
	    
	    public int[]sort(int[]ind,int si,int ei,int[]nums){
	        
	        if(si>=ei){
	           
	            int[]bs=new int[1];
	            bs[0]=ind[si];
	            return bs;
	                
	        }
	        int mid=(si+ei)/2;
	        int []fs=sort(ind,si,mid,nums);//left side
	        int[]ls=sort(ind,mid+1,ei,nums);//right side
	        
	        return mergesorted(fs,ls,nums);
	        
	        
	    }
	    
	    public int[]mergesorted(int[]arr1,int[]arr2,int[]nums){
	        
	        int i=0;//for first array
	        int j=0;//for second array
	        int[]ans=new int[arr1.length+arr2.length];//merged array
	        int k=0;
	        int rcount=0;//no of right smaller element
//	         while(i<arr1.length && j<arr2.length){
	            
//	             if(nums[arr1[i]]<=nums[arr2[j]]){
//	                 count[arr1[i]]+=rcount;
//	                 ans[k]=arr1[i];
//	                 i++;
//	                 k++;
//	             }else{
//	                 rcount++;
//	                 ans[k]=arr2[j];
//	                 j++;
//	                 k++;
	                
	                
//	             }
	            
	            
	            
//	         }
	        
	             while( i < arr1.length && j < arr2.length){
	            if(nums[arr1[i]] <= nums[arr2[j]]){
	                
	                count[arr1[i]] += rcount;       //**
	                
	                ans[k] = arr1[i];
	                i++;
	                k++;
	            }else{
	                
	                rcount++;                       //***
	                
	                ans[k] = arr2[j];
	                j++;
	                k++;
	            }
	        }
	    
	        while(i<arr1.length){
	            count[arr1[i]]+=rcount;
	            ans[k]=arr1[i];
	    
	            i++;
	            k++;
	        }
	        
//	                 while(i < arr1.length){
//	             count[arr1[i]] += rcount;           //****
	            
//	             ans[k] = arr1[i];
//	             i++;
//	             k++;
//	         }
	        while(j<arr2.length){
	          
	            ans[k]=arr2[j];
	            j++;
	            k++;
	        }
	        
	        return ans;
	    }

}
