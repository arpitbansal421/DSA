package leetcode_question;


import java.util.*;
public class Minimumtraveller_cost {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int c=sc.nextInt();
		int[]days=new int[d];
		for(int i=0;i<d;i++) {
			days[i]=sc.nextInt();
			
		}
		int[] cost=new int[c];
		for(int i=0;i<c;i++) {
			cost[i]=sc.nextInt();
		}
	}
	
	public static int Mininumtraveller(int[]days,int[]cost) {
		HashSet<Integer>map=new HashSet<>();
		for(int i=0;i<days.length;i++) {
			map.add(days[i]);
		}
		
		int n=0;
		for(int i=0;i<days.length;i++) {
			
			n=Math.max(n, days[i]);
		}
		
		int[]dp=new int[n+1];
		dp[0]=0;
		dp[1]=0;
		dp[2]=2;
		Arrays.fill(dp, 1000000);
		for(int i=3;i<=n;i++) {
			int p1=0;
			int p2=0;
			int p3=0;
			for(int j=1;j<i;j++) {
				if(j+1==i) {
					p1=Math.min(dp[i], dp[j+1]+cost[1]);
				}
				if(j+6==i) {
					p2=Math.min(dp[i],dp[j+6]+cost[1]);
				}else {
					
				}
				
			}
		}
	}

}
