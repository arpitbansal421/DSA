package leetcode_question;


import java.util.*;
public class stonegame1V {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=stonegame(0,arr.length-1,arr);
		System.out.println(k);
	}
	
	public static int stonegame(int si ,int ei,int[]piles) {
		if(si>=ei) {
			return 0;
		}
		
		int ans=0;
		for(int k=si;k<ei;k++) {
			
			int fs=stonegame(si,k,piles);
			int ls=stonegame(k+1,ei,piles);
			
			int right_sum=sum(si,k,piles);
			int left_sum=sum(k+1,ei,piles);
			
			if(right_sum!=left_sum) {
				ans+=Math.min(sum(si,k,piles), sum(k+1,ei,piles));
			}else {
				ans+=Math.max(sum(si,k,piles), sum(k+1,ei,piles));
			}
			
		
			
			
		}
		return ans;
	}
	private static int sum(int i, int mid, int[] piles) {
		// TODO Auto-generated method stub
		int ans=0;
		while(i<=mid) {
			ans+=piles[i];
			i++;
			
		}
		return ans;
	}

}
