package Tcs_digital;

import java.util.*;
public class Print_LIS {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int k=LISP(arr);
		System.out.print(k);
		
	}
	
	
	public static int LISP(int[]arr) {
		int []dp=new int[arr.length];//ans ko track rakhega
		for(int i=0;i<arr.length;i++) {
			dp[i]=arr[i];
		}
		
		for(int i=1;i<arr.length;i++) {
			int ans=arr[i];
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j]) {
					ans+=arr[j];
					dp[i]=ans;
					
				}
			}
		}
		
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<dp.length;i++) {
			ans=Math.max(ans, dp[i]);
		}
		
		return ans;
		
	}
	
	

}
