package Dynamic_programming;

import java.util.*;

//Harry Potter has n mixtures in front of him, arranged in a row. 
//Each mixture has one of 100 different colors (colors have numbers from 0 to 99).
//
//He wants to mix all these mixtures together. 
//At each step, he is going to take two mixtures that stand next to each other and mix them together,
//and put the resulting mixture in their place.
//
//When mixing two mixtures of colors a and b, the resulting mixture will have the color (a+b) mod 100.
//
//Also, there will be some smoke in the process. The amount of smoke generated 
//when mixing two mixtures of colors a and b is a*b.
//
//Find out what is the minimum amount of smoke that Harry can get when mixing all the mixtures together.
//You can find the original problem here.


//so firsly in this question we will combine two mixture by taking their individual sum and we will  take their dot product
public class Mixtures {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int[]arr=new int[n];
		
		int[][]dp=new int[arr.length][arr.length];
		
		for(int[]a:dp) {
			Arrays.fill(a, -1);
		}
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int k=mixtures(arr,0,arr.length-1,dp);
		System.out.println(k);
		
	}
	
	
	public static int mixtures(int[]arr,int si,int ei,int[][]dp) {
		
		if(si==ei) {
			return 0;
		}
		
		int ans=Integer.MAX_VALUE;
		
		
		if(dp[si][ei]!=-1) {
			return dp[si][ei];
		}
		for(int k=si;k<=ei;k++) {
//			System.out.println("hhhhhhhhhh");
//			System.out.println(si);
			int fs=mixtures(arr,si,k,dp);
			int sd=mixtures(arr,k+1,ei,dp);
			
			int smoke=sum(arr,si,k)*sum(arr,k+1,ei);
			ans=Math.min(ans, smoke+fs+sd);
		}
		
		return dp[si][ei]=ans;
	}


	private static int sum(int[] arr, int k, int ei) {
		// TODO Auto-generated method stub
		int ans=0;
		for(int i=k;i<=ei;i++) {
			
			ans+=arr[i];
			
		}
		return ans%100;
	}

}
