package Dynamic_programming;

import java.util.*;
public class NumberStepstoreach1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int k=n;
		
		int[]dp=new int[n+1];
		Arrays.fill(dp, -1);
		int ans=minimumsteps(n);
		System.out.println(ans);
		
	}
	
	public static int minimumsteps(int n) {
		
		int[]dp=new int[n+1];
		Arrays.fill(dp, 100000);
		//base case
		dp[1]=0;
		
		for(int i=2;i<=n;i++) {
			if(i%2==0) {
				dp[i]=dp[i/2]+1;
			}else {
				
				dp[i]=Math.min(dp[i-1], (dp[(i+1)/2]+1))+1;
			}
			
		}
		
		return dp[n];
		
	}
	

}
