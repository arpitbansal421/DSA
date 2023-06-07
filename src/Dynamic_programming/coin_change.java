package Dynamic_programming;
import java.util.*;

public class coin_change {
	
	public static void main(String[]args) {
		int[]coin= {2,3,5};
		int amount=10;
		int[][]dp=new int[coin.length][amount+1];
		
		for(int []a:dp) {
			Arrays.fill(a, -1);
			
		}
		
		ArrayList<Integer>ques=new ArrayList<>();
		ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
		System.out.println(different_combinations(amount,coin,0,ques,ans,dp));
		System.out.println(ans);
		System.out.println(coinchange(coin,10));
		
	}
     


	private static int different_combinations(int amount, int[] coin, int i,ArrayList<Integer>ques,ArrayList<ArrayList<Integer>> ans, int[][] dp) {
		
		// TODO Auto-generated method stub
		
		if(amount==0) {
			
			ans.add(new ArrayList<>(ques));
			return 1;
			
		}
		
      if(i>=coin.length) {
    	  return 0;
      }
      
      
		if(dp[i][amount]!=-1) {
			System.out.println("hi");
			return dp[i][amount];
		}
		
		
		int inc=0;
		int exc=0;
		
		
		if(coin[i]<=amount) {
			ques.add(coin[i]);
		 inc=different_combinations(amount-coin[i],coin,i, ques, ans, dp);
		 ques.remove(ques.size()-1);
		}
		
		
		 exc=different_combinations(amount,coin,i+1, ques, ans, dp);
		 
//		 return inc+exc;
		
		return dp[i][amount]=inc+exc;
		
		
	}
	
	private static int coinchange(int[]coin,int amount) {
		int[][]dp=new int[amount+1][coin.length+1];
		for(int i=0;i<dp[0].length;i++) {
			dp[0][i]=1;
			
		}
		dp[0][0]=1;
		//iterative loop on amount
		for(int am=1;am<=amount;am++) {
			for(int c=1;c<=coin.length;c++) {
				int inc=0;
				int exc=0;
				//inculsive call
				if(am>=coin[c-1]) {
					inc=dp[am-coin[c-1]][c];
				}
				//exclusive call
				exc=dp[am][c-1];
				dp[am][c]=inc+exc;
				
				
			}
			
		}
		return dp[amount][coin.length];
		
	}

}
