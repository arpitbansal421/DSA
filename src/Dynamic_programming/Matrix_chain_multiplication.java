
package Dynamic_programming;


import java.util.*;
public class Matrix_chain_multiplication {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
			
		}
		
		int[][]dp=new int[arr.length][arr.length];
		                                                                                                 
		for(int []a:dp) {
			Arrays.fill(a, -1);
		}
		int k=MatrixMultiplication(arr,0,arr.length-1,dp);
		
		System.out.println(k);
		
	}
	                                                    
	public static int MatrixMultiplication(int[]arr,int si,int ei,int[][]dp) {
		
		//base condition
		
		if(si+1==ei) {
			return 0;
		}
		
		//no of partition
		
		
		int ans=Integer.MAX_VALUE;
		
		//dp equation
		if(dp[si][ei]!=-1) {
			System.out.println("hello");
			return dp[si][ei];
		}
		for(int k=si+1;k<ei;k++) {
			
			int sd=MatrixMultiplication(arr,k,ei,dp);
			int fs=MatrixMultiplication(arr,si,k,dp);
			
			
			int ws=arr[si]*arr[k]*arr[ei];
			
			ans=Math.min(ans, fs+sd+ws);
			
			
		}
		
		return  dp[si][ei]= ans;
		
	}

}
