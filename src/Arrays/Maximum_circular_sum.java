package Arrays;
import java.util.*;
public class Maximum_circular_sum {
	public static void main(String[] args) {
		
		int[] arr= {1,-2,-3,4,5};
		int k=maximumSum(arr);
		System.out.println(k);
	}

	private static int maximumSum(int[] arr) {
		// TODO Auto-generated method stub
		int linaer_sum=linersum(arr);
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			arr[i]*=-1;
		}
		int mid=linersum(arr);
		System.out.println(mid);
		int circular_sum=mid+sum;
		if(circular_sum==0) {
			return linaer_sum;
		}
		return Math.max(linaer_sum, circular_sum);
		
		
		
		
	
	}
	
	private static int linersum(int []arr) {
		int ans=Integer.MIN_VALUE;
		int sum=0;
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
