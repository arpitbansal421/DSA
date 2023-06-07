package Arrays;

import java.util.*;
/*
 * 
 * 1304. Find N Unique Integers Sum up to Zero
 * Given an integer n, return any array containing n unique integers such that they add up to 0.

 
 * 
 * 
 */
public class n_unique_sum_to_zero {
	 public static void main (String args[]) {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int[]ans=sumZero(n);
	        Arrays.sort(ans);
	        for(int i=0;i<n;i++){
	            System.out.print(ans[i]+" ");
	        }

	    }

	     public static int[] sumZero(int n) {
	        int nums=-1;
	        
	        int i=0;
	        int[]ans=new int[n];
	        while(i<n/2){
	            ans[i]=nums;
	            nums--;
	            i++;
	        }
	        
	        nums=1;
	        int k=i;
	        while(i<n/2+k){
	            ans[i]=nums;
	            nums++;
	            i++;
	        }
	        
	        return ans;
	        
	    }

}
