package Dynamic_programming;
import java.util.*;

//longest increasing sequence-here we have find the longest increaing sequence

public class longest_Increasing_subsequence {
	
	public static void main(String[]args) {
		
		int[]arr= { 10, 9, 2, 5, 3, 7 };
		System.out.print(lis(arr)) ;
		
	}

//	private static int  lis(int[] arr) {
//		// TODO Auto-generated method stub
//		int[]dp=new int[arr.length];
//		Arrays.fill(dp, 1);
//		
//		for(int i=1;i<arr.length;i++) {
//			for(int j=0;j<=i;j++) {
//				if(arr[i]<arr[j]) {
//					dp[i]=Math.max(dp[i], dp[j]+1);
//				}
//			}
//		}
//		
//		int ans=1;
//		for(int i=0;i<dp.length;i++) {
//			ans=Math.max(dp[i], ans);
//			
//		}
//		return ans;
//		
//		
//	}
	
	
	public static int lis(int arr[]) {
		int[] dp = new int[arr.length];
		Arrays.fill(dp, 1);
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i]) {
					dp[i] = Math.max(dp[j] + 1, dp[i]);
//					System.out.println(arr[i]);
				}
				
			}

		}

		int ans = 1;
		for (int i = 0; i < dp.length; i++) {
			ans = Math.max(ans, dp[i]);
		}
		return ans;

	}

}
	
	


