package Arrays;

public class printing_sum_using_three_loop {
	
	private static final int Integer_MIN_VALUE = 0;

	public static void main(String[]args) {
		int[]arr= {3,10,6,7,0,1};
		
		printing_sum(arr);
	}

	private static void printing_sum(int[] arr) {
		// TODO Auto-generated method stub
		
		int ans=Integer_MIN_VALUE;//ans sum
		int ei=0;
		int si=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum=0;

				for(int k=i;k<=j;k++) {
					sum+=arr[k];
					if(ans<sum) {
						ans=sum;
						si=i;
						ei=j;
						
					}
					
				}
			}
		}
		
		System.out.println(ans);
		for(int i=si;i<=ei;i++) {
			System.out.print(arr[i]+" ");
			
		}
		
	}

}
