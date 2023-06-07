package Sliding_Window;

//question --you are given an array and you need to find maximum sum of subarray of length 3
//fixed sliding window pattern
public class Maximum_sum_window_k {
	
	public static void main(String[] args) {
		int[]arr= {1,2,100,4,11,0,0};
		int k=3;
		System.out.println(MaximuminWindow(arr,k));
	}
	
	public static int MaximuminWindow(int[]arr,int k) {
		
		int sum=0;
		int ans=0;
		//maintained a window length 3
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}
		//sliding the window
		ans=sum;//calculating the sum
		for(int i=k;i<arr.length;i++) {
			sum+=arr[i];
			sum-=arr[i-k];//shrinking the window
			ans=Math.max(ans, sum);
			
			
		}
		
		return ans;
	}

}
