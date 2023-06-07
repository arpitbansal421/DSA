package Dynamic_programming;

import java.util.Arrays;

public class fibbonacci {
	public static void main(String[]args) {
//		System.out.println(fibbo(7));
		int[]dp=new int[8];//the size is n+1 because we are accessing 0-7 index
		Arrays.fill(dp, -1);//-1 because in case of n==0 ans could be 0
		System.out.println(fibbo_topdown(0,dp));
		System.out.println(fibbo_bottomup(7));
		
		
	}
	
	public static int fibbo(int n) {
		//base case 
		if(n==0 || n==1) {
			return n;
		}
		int f1=fibbo(n-1);
		int f2=fibbo(n-2);
		return f1+f2;
	
		
	}
	
	//top down solution
	public static int fibbo_topdown(int n,int []dp) {
		if(n==0||n==1) {
			return n;
		}
		if(dp[n]!=-1) {
			return dp[n];
		}
		
		return dp[n]=fibbo_topdown(n-1,dp)+fibbo_topdown(n-2,dp);
	}
	
	//bottom up approach
	//in bottom up approach we will base case manually and by looking recurssion tree by start filling the dp table from backward 
	//and our answer lies at last index of the array
	public static int fibbo_bottomup(int n) {
		int[]dp=new int[n+1];
		dp[0]=0;//base case 1
		dp[1]=1;//base case 2
		for(int i=2;i<=n;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		
		return dp[n];
		
	}

}
