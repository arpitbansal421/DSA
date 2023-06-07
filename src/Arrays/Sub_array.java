package Arrays;
//printing all arrays using three loops
//one loop for stating array
//second loop for ending 
//third loop for printing that range
public class Sub_array {
	
	public static void main(String[]args) {
		int[]arr= {1,2,4,5,6,8};
		
		all_array(arr);
	}

	private static void all_array(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
		
		
		
	}

}
