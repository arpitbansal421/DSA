package Arrays;

public class printing_sum_sub_array_using_two_loop {
	
	private static final int Integer_MIN_VALUE = 0;

	public static void main(String[]args) {
		int[]arr= {2,7,8,91,-100,100,-34};
		
		sub_array_using_two_loop(arr);
	}

	private static void sub_array_using_two_loop(int[] arr) {
		// TODO Auto-generated method stub
		int ans=Integer_MIN_VALUE;
		int ei=0;
	
		int si=0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;//global variables
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				if(ans<sum) {
//					System.out.println(arr[j]);
//					System.out.println("ggg"+sum);
					ans=sum;
					
					si=i;
					ei=j;
				}
				
				
			}
		}
//		System.out.println(ei);
		System.out.println(ans);
		for(int i=si;i<=ei;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
