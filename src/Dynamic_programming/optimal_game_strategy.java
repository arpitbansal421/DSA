package Dynamic_programming;
///Piyush and Nimit are playing a coin game. They are given n coins with values x1, x2 …. xn 
//where 'n' is always even. They take alternate terms. In each turn, 
//a player picks either the first coin or the last coin from the row and removes it from the row. 
//The value of coin is received by that player. 
//Determine the maximum value that Piyush can win with if he moves first. 
//Both the players play optimally.



//in this question the basic logic is that we are both players are playing optimally when I picked the
//first coin from the starting I am left with choice whether of minimum coin left by the opponent as the oppont
// is also playing optimaally
//simalarly for last coin case also

import java.util.*;
public class optimal_game_strategy {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[]coin=new int[n];
		for(int i=0;i<coin.length;i++) {
			coin[i]=sc.nextInt();
		}
		
		int[][]dp=new int[coin.length][coin.length];
		for(int[]a:dp) {
			Arrays.fill(a, -1);
		}
		
		System.out.println(maxamount(coin,0, dp,coin.length-1));
		
		
		
	}
	
	public static int maxamount(int[]arr,int i,int [][]dp,int j) {
		
		if(i>j) {
			return 0;
		}
		
		//dp condition
		
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		
		//first picking recurssion
		// when i picked the the first the opponent will give the choice minimimum coin left
		int p1=arr[i]+Math.min(maxamount(arr,i+2,dp,j),maxamount(arr,i+1,dp,j-1));
		//when ponent picks last coin
		 
		int p2=arr[j]+Math.min(maxamount(arr,i+1,dp,j-1),maxamount(arr,i,dp,j-2));
		
		
		return dp[i][j]=Math.max(p1, p2);
		
		
		
	
		
		
		
		
	}
	


}
           