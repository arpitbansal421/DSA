package Dynamic_programming;

import java.util.*;


//Any programmer worth his salt would be familiar with the famous Longest Common Subsequence problem. 
//Mancunian was asked to solve the same by an incompetent programmer. As expected, he solved it in a flash. 
//To complicate matters, a twist was introduced in the problem.
//
//In addition to the two sequences, an additional parameter k was introduced. 
//A k-ordered LCS is defined to be the LCS of two sequences 
//if you are allowed to change atmost k elements in the first sequence to any value you wish to. 
//Can you help Mancunian solve this version of the classical problem?

public class K_odered_LCS {
	
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		int[]first_seq=new int[m];
		int []second_seq=new int[n];
		
		for(int i=0;i<m;i++) {
			first_seq[i]=sc.nextInt();
		}
		
		for(int j=0;j<n;j++) {
			second_seq[j]=sc.nextInt();
		}
		
		int[][][]dp=new int[first_seq.length][second_seq.length][k+1];
		for(int i=0;i<first_seq.length;i++) {
			for(int j=0;j<second_seq.length;j++) {
				for(int l=0;l<=k;l++) {
					dp[i][j][l]=-1;
				}
			}
		}
		System.out.println(LCS(first_seq,second_seq,0,0,k,dp));
		
		
		
		
		
	}
	
	public static int LCS(int[]first,int[]sec,int i,int j,int k,int[][][]dp) {
		if(i==first.length|| j==sec.length ||k==0) {
			return 0;
			
		}
		//if character matches with no change
		int ans=0;
		if(first[i]==sec[j]) {
			 ans=LCS(first,sec,i+1,j+1,k,dp)+1;
		}
		
		if(dp[i][j][k]!=-1) {
			return dp[i][j][k];
		}
		//when made the changes
		//if character do not matches
		else {
			int fd=LCS(first,sec,i+1,j,k,dp);
			int sd=LCS(first,sec,i,j+1,k,dp);
			ans=Math.max(ans,Math.max(fd, sd));
		}
		int change=LCS(first,sec,i+1,j+1,k-1,dp)+1;
		
		
		return dp[i][j][k]=Math.max(ans, change);
		
	}
	

}
