///package Arrays;

//in this question we have to find the maximum product of an element of an array by skipping the self product
//it can be achivied by breaking an array into left and rigth array
//and multiplying the both arrays

public class Maximum_self_product {
	
	public static void main(String[]args) {
		int[]arr= {1,5,3,6,1,7};
		
		int[]ans=product(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(ans[i]+" ");
		}
		
	}

	private static int[] product(int []arr) {
		// TODO Auto-generated method stub
		int[]left=new int[arr.length];
		int[]rigth=new int[arr.length];
		left[0]=1;
		//now filling our left array
		for(int i=1;i<left.length;i++) {
			left[i]=left[i-1]*arr[i-1];
			
		}
		
		//now filling our rigth array
		rigth[arr.length-1]=1;
		//now filling our rigth array
		for(int i=arr.length-2;i>=0;i--) {
			rigth[i]=rigth[i+1]*arr[i+1];
		}
		
		//now multiplying left and rigth array
		int[]ans=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			ans[i]=left[i]*rigth[i];
			
		}
		
	
		
		return ans;
	}
	
	

}
