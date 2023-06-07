package Dynamic_programming;

import java.util.*;
public class coin_problem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		int n=sc.nextInt();
		int[]coin=new int[n];
		
		int[][]dp=new int[amount+1][n];
		for(int []a:dp) {
			Arrays.fill(a, -1);
		}
		for(int i=0;i<n;i++) {
			coin[i]=sc.nextInt();
		}
		int k=coin(coin,amount,0,dp);
		
		System.out.print(k);
		
		
		
		
	}
	
	public static int coin(int[]coin,int amount, int i,int[][]dp) {
		
		if(amount==0) {
			return 1;
		}
		
		if(i>=coin.length) {
			return 0;
		}
		
		if(dp[amount][i]!=-1) {
			return dp[amount][i];
		}
		int inc=0;
		int exc=0;
		if(coin[i]<=amount) {
			amount-=coin[i];//do
			inc=coin(coin,amount,i,dp);//recurrsive
			amount+=coin[i];
		}
		exc=coin(coin,amount,i+1,dp);
		
		return dp[amount][i]=inc +exc;
		
	}
	
	

}
