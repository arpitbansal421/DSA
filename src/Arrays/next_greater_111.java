package Arrays;

import java.util.*;
//leetcode 556
/*
 * Given a positive integer n, 
 * find the smallest integer which has exactly the same digits existing in the integer n and 
 * is greater in value than n. If no such positive integer exists, return -1.

Note that the returned integer should fit in 32-bit integer, 
if there is a valid answer but it does not fit in 32-bit integer, return -1.
 * 
 * 
 * 
 */
public class next_greater_111 {

	public int nextGreaterElement(int n) {
        // char []arr=(n+"").tocharArray();
        int count=0;
        
        if(n>=Integer.MAX_VALUE){
            return -1;
        }
        int no=n;
        while(no>0){
            no=no/10;
            count++;
        }
    
        int[]arr=new int[count];
        
        no=n;
        int l=arr.length-1;
        while(no>0 && l>=0){
            arr[l]=no%10;
            no=no/10;
            l--;
        }
        
        
        //breakpoint calcultate karenge
        int i=arr.length-2;
        int j=arr.length-1;
    
        int bpt=-1;
        while(i>=0){
            
            if(arr[i]<arr[j]){
             
                bpt=i;
                break;
            }
            i--;
            j--;
        }
        if(bpt==-1){
            return bpt;
        }
        
        j=arr.length-1;
        int min=Integer.MAX_VALUE;
        int mini=-1;
        while(j>bpt){
             
            if(arr[bpt]<arr[j]){
                
                if(min>arr[j]){
                    
                    min=arr[j];
                    mini=j;
                }
                
            }
            
            j--;
            
        }
        
        if(mini==-1){
            return mini;
        }
        
        //now we will swap the index
        swap(arr,bpt,mini);
        //sort bpt+1 
   
        reverse(arr,bpt+1,arr.length-1);
        
        long ans=formno(arr);
        
        return ans>Integer.MAX_VALUE?-1:(int)ans;
        
    }
    
    public void swap(int []arr,int i,int j){
        
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
    
    public void reverse(int []arr,int si,int ei){
        
       while(si<ei){
           int temp=arr[si];
           arr[si]=arr[ei];
           arr[ei]=temp;
           si++;
           ei--;
       }
    }
    
    public long formno(int []arr){
        
        int p=0;
        long ans=0;
        for(int i=arr.length-1;i>=0;i--){
            ans+=(int)arr[i]*Math.pow(10,p);
            p++;
        }
        
        return ans;
    }
}
