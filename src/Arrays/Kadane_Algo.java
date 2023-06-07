package Arrays;
import java.util.*;
//Maximum sum subarray
public class Kadane_Algo {
	public static void main(String[] args) {
		int[]arr= {-11,-99,-399,-6,-7,-3};
		
		int k=maximum_sum(arr);
		System.out.println(k);
	}

	private static int maximum_sum(int[] arr) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int ans=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			ans=Math.max(ans, sum);
			if(sum<0) {
				sum=0;
			}
		}
		return ans;
	}

}
