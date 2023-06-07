package Dynamic_programming;

import java.util.*;
public class Burst_ballon {
	
public int maxCoins(int[] nums) {
        
        int[]a=new int[nums.length+2];
        
        for(int i=1;i<=nums.length;i++){
            a[i]=nums[i-1];
        }
        
        a[0]=a[a.length-1]=1;
        
        int[][]dp=new int[a.length][a.length];
        
        for(int[]a1:dp){
            Arrays.fill(a1,-1);
        }
        
        return  MatrixMultiplication(a,0,a.length-1,dp);
        
    }
    
    public int maxCoins(int []a,int si,int ei,int[][]dp){
        
        if(si+1==ei){
            return 0;
        }
        
        if(dp[si][ei]!=-1){
            return dp[si][ei];
        }
        
        int ans=Integer.MIN_VALUE;
        for(int i=si+1;i<ei;i++){
            
            int fs=maxCoins(a,si,i,dp);
            int ls=maxCoins(a,i,ei,dp);
            int self=a[si]*a[ei]*a[i];
            
            ans=Math.max(ans,self+ls+fs);
            
        }
        
        return dp[si][ei]= ans;
    }
    
    public  int MatrixMultiplication(int[]arr,int si,int ei,int[][]dp) {
		
		//base condition
		
		if(si+1==ei) {
			return 0;
		}
		
		//no of partition
		
		
		int ans=Integer.MIN_VALUE;
		
		//dp equation
		if(dp[si][ei]!=-1) {
			
			return dp[si][ei];
		}
		for(int k=si+1;k<ei;k++) {
			
			int sd=MatrixMultiplication(arr,k,ei,dp);
			int fs=MatrixMultiplication(arr,si,k,dp);
			
			
			int ws=arr[si]*arr[k]*arr[ei];
			
			ans=Math.max(ans, fs+sd+ws);
			
			
		}
		
		return  dp[si][ei]= ans;
		
	}

    
	
	

}
