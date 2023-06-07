package Dynamic_programming;
import java.util.*;


//You are provided an array of integers where each element represents 
//the max number of steps you can take to move ahead. 
//You need to check that how many minimum steps required to reach at the end of the array.
public class Minimum_jumps_required {
	
	public static void main(String[]args) {
		 Scanner sc=new Scanner(System.in);
		 
		 int t=sc.nextInt();
		 while(t-->0) {
			 int n=sc.nextInt();
			 int[]arr=new int[n];
			 for(int i=0;i<arr.length;i++) {
				 arr[i]=sc.nextInt();
			 }
			 
//			 int l=jumps_required(arr);
//			 System.out.print(l);
			 
			 int k=minimumjumps2(arr);
			 
			 System.out.println(k);
			 
			 

		 
	}
	
		
	
		
	}
	
	
	//jumps required
	
	public static int jumps_required(int[]arr) {
		
		//base condition
		if(arr[0]==0) {
			return Integer.MAX_VALUE;
				
		}
		
		int[]dp=new int[arr.length+1];
		
		Arrays.fill(dp, 1000000000);
		dp[0]=0;
		for(int i=1;i<=arr.length;i++) {
			//we will check the minimum jumps to reach the ith index
			for(int j=0;j<i;j++) {
				//is it possible to reach j from i
				if(j+arr[j]>=i && dp[j]!=1000000000) {
					
					dp[i]=Math.min(dp[i], dp[j]+1);
					
				}
				if(j+arr[j]>=arr.length) {
					return dp[j]+1;
				}
			}
		}
		return dp[arr.length];
	}
	
	//2nd approach
	//time complexityo(n)
	//space complexityo(1)
	
	public static int minimumjumps2(int[]arr) {
		if(arr[0]==0) {
			return Integer.MAX_VALUE;
		}
		int max=0;
		int jumps=0;
		int halt=0;
		
		for(int i=0;i<arr.length;i++) {
			
			//max jumps could to taken from ith position
			if(max<arr[i]+i) {
				max=arr[i]+i;
				
			}
			
			//if max is greater than arr.length
			if(max>=arr.length) {
				jumps++;
				return jumps;
			}
			
			//halt update maximum distance travleled from ith position
			if(i==halt) {
				halt=max;//we are trying to halt to maximum in achieved in ith distance
				jumps++;//one jump to reach this position
				
				
			}
			
			
		}
		return jumps;
	}
}
	
	


