package binary_search;
import java.util.*;
///Farmer John has built a new long barn, with N (2 <= N <= 100,000) stalls. 
//The stalls are located along a straight line at positions x1,…,xN (0 <= xi <= 1,000,000,000).

//His C (2 <= C <= N) cows don't like this barn layout and become aggressive towards each other once put into a stall. 
//To prevent the cows from hurting each other, FJ wants to assign the cows to the stalls, 
//such that the minimum distance between any two of them is as large as possible. 
//What is the largest minimum distance?

//ver very important 
//basically in this question we have to find the maximum of minimum

public class Aggressive_cows {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int noc=sc.nextInt();
			int nos=sc.nextInt();
			int[]stall=new int[nos];
			for(int i=0;i<stall.length;i++) {
				stall[i]=sc.nextInt();
			}
			System.out.println(minimum_distance(stall,noc));
		}
		
	}

	private static int minimum_distance(int[] stall, int noc) {
		// TODO Auto-generated method stub
		
		int lo=0;
		int hi=stall[stall.length-1]-stall[0];
		int ans=0;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(isitpossible(stall,noc,mid)) {
				ans=mid;
				lo=mid+1;
				
			}else {
				hi=mid-1;
			}
		}
		
		return ans;
	}

	private static boolean isitpossible(int[]stall,int noc, int mid) {
		// TODO Auto-generated method stub
		
		int last_pos=stall[0];
		int cows=1;
		
		
	
		for(int i=1;i<stall.length;i++) {
			
			if(stall[i]-last_pos>=mid) {
				cows++;
				last_pos=stall[i];
			}
			if(cows>=noc) {
				return true;
			}
		}
		
		return false;
	}

}
