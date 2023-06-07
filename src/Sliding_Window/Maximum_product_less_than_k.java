package Sliding_Window;
//given an array you need to find the maximum length of subarray less than k
//variable size sliding window

public class Maximum_product_less_than_k {
	public static void main(String[] args) {
		int[]nums= {10,5,2,6};
		int k=100;
		int a=product_less_than_k(nums,k);
		System.out.println(a);
	}

	private static int product_less_than_k(int[] nums, int k) {
		// TODO Auto-generated method stub
		int si=0;//start pointer
		int ei=0;//end pointer
		int start=0;
		int end=0;
		int p=1;
		int ans=0;
		//mainting window
		while(ei<nums.length) {
			//calculating the value
			p*=nums[ei];
			
			//window shrink hoge ya nhi
			while(p>=k &&si<=ei) {
				p/=nums[si];//product decrease
				si++;
			}
			
			
			
			
			//ans update
			if(ans<ei-si+1) {
				ans=ei-si+1;
				start=si;
				end=ei;
			}
			ei++;
			
			
			
			
			
		}
		
		for(int i=start;i<=end;i++) {
			System.out.print(nums[i]+" ");
		}
		return ans;
		
		
	}

}
