package Dynamic_programming;

import java.util.*;

public class Valentine_magic {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int[]boys=new int[n];
		
		//boys candy
		for(int i=0;i<n;i++) {
			boys[i]=sc.nextInt();
		}
		
		//girls candy
		
		int[]girls=new int[m];
		
		for(int i=0;i<m;i++) {
			girls[i]=sc.nextInt();
		}
		int[][]dp=new int[n][m];
		for(int[]a:dp) {
			Arrays.fill(a, -1);
		}
//		int k=ValentineMagic(boys,girls,0,0);
//		System.out.println(k);
//		
		
		//we are sorting our array so that minimum could paired with the minimum
		Arrays.sort(boys);
		Arrays.sort(girls);
		int l=ValentineMagic2(boys,girls,0,0,dp);
		
		System.out.println(l);
		
		System.out.println( valentine_magic_bu(boys,girls));
		
		
		
		
	}
	
//	
	public static int ValentineMagic2(int[]boys,int girls[],int i,int j,int[][]dp) {
		
		//base case1
		
		if(i==boys.length ) {
			return 0;
		}
		
		//we are return 1000 here because we looking to maximize our solution so for unsoted array answer will become wrong
		if(j==girls.length) {
			return 1000000;
		}
		int inc=0;
		int exc=0;
		
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}

			inc=Math.abs(boys[i]-girls[j])+ValentineMagic2(boys,girls,i+1,j+1,dp);
			exc=ValentineMagic2(boys,girls,i,j+1,dp);
			
			
			return  dp[i][j]=Math.min(inc, exc);
			
			
			
		
	}
	
//	public static int ValentineMagic(int[] boys, int[] girls, int i, int j) {
//	      if(i==boys.length) {
//	    	  return 0;
//	      }
//	      if(j==girls.length) {
//	    	  return 10000000;
//	      }
//			
//			
//			int gs =  ValentineMagic(boys, girls, i + 1, j + 1)+Math.abs(boys[i]-girls[j]);
//			int gr = ValentineMagic(boys, girls, i, j + 1);
//			return Math.min(gs, gr);
//		}
	
	
	
	public static int valentine_magic_bu(int[]boys,int[]girls) {
		 
		int[][]dp=new int[boys.length+1][girls.length+1];
		
		for(int i=1;i<=boys.length;i++) {
			for(int j=1;j<=girls.length;j++) {
				
				int inc=0;
				int exc=0;
				
				inc=Math.abs(boys[i-1]-girls[i-1])+dp[i-1][j-1];
				exc=dp[i][j-1];
				dp[i][j]=Math.min(inc,exc);
			}
		}
		
		return dp[boys.length][girls.length];
	}

	

}
