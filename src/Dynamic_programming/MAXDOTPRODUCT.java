package Dynamic_programming;


import java.util.*;
public class MAXDOTPRODUCT {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		int []arr1=new int[m];//first array
		int []arr2=new int[n];//second array

		
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
		for(int j=0;j<arr2.length;j++) {
			arr2[j]=sc.nextInt();
		}
		
		int[][]dp=new int[arr1.length][arr2.length];

		for(int []a:dp) {
			Arrays.fill(a, -100000);
		}
		int k=maxdotproduct(arr1,arr2,0,0,false,dp);
		System.out.println(k);
		
	
		
	}
	
	
	public static int maxdotproduct(int[]arr1,int[]arr2,int i,int j,boolean isvisted,int[][]dp) {
		
		if(i==arr1.length || j==arr2.length) {
			if(isvisted) {
			
				return 0;
				
			}
			return -100000;
			
		}
		
		if(dp[i][j]!=-100000) {
			return dp[i][j];
		}
		int dotproduct=arr1[i]*arr2[j]+maxdotproduct(arr1,arr2,i+1,j+1,true,dp);
		System.out.println("hello");
//		System.out.println(dotproduct);
		
		int fd=maxdotproduct(arr1,arr2,i+1,j,false,dp);
		int sd=maxdotproduct(arr1,arr2,i,j+1,false,dp);
		
		
		return dp[i][j]=Math.max(arr1[i]*arr2[j], Math.max(dotproduct, Math.max(fd, sd)));
		
		
	
	}
	
	

}
