package binary_search;

import java.util.*;

public class Nearest_square_root {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int k=square_root(n);
		System.out.println(k);
	
		
		
	}

	private static int square_root(int n) {
		// TODO Auto-generated method stub
		
		int lo=0;
		int hi=n;
		int ans=0;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(mid*mid<=n) {
				ans=mid;
				lo=mid+1;
			}else {
				hi=mid-1;
			}
		}
		return ans;
	}

}
