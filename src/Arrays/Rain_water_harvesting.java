 package Arrays;
//given n array of non negative elements reprenting the hiegth of each building where the wiedth of each
//bar is 1 compute how much water it can trap.
//we will use the logic that a maximum amount between two things can be maximum amount between letf max and right max
public class Rain_water_harvesting {
	public static void main(String[]args) {
		int []arr= {3,5,1,4};
		System.out.println((total_amount(arr)));
		System.out.println(water_trap(arr));
		
		
	}

	private static int  total_amount(int[] arr) {
		int[]left=new int[arr.length];//left array
		int[]rigth=new int[arr.length];//rigth array
		left[0]=arr[0];
		rigth[arr.length-1]=arr[arr.length-1];
		int ans=0;
		
		//putting elements for left array
		for(int i=1;i<arr.length;i++) {
			left[i]=Math.max(left[i-1], arr[i]);
		}
		//putting elements to the rigth array
		for(int i=arr.length-2;i>=0;i--) {
			rigth[i]=Math.max(rigth[i+1], arr[i]);
		}
		
		//making ans array
		for(int i=0;i<arr.length;i++) {
			
			ans+=Math.min(left[i], rigth[i])-arr[i];
		}
		
		
		  
		
		return ans;
		// TODO Auto-generated method stub
		
	
	
	        }
	    public static int water_trap(int[]arr){
	        int n=arr.length;
	        int []left=new int[n];
	        int []right=new int[n];
	        left[0]=arr[0];
	        right[n-1]=arr[n-1];
	        for(int i=1;i<n;i++){
	            left[i]=Math.max(left[i-1],arr[i]);
	        }
	        for(int i=n-2;i>=0;i--){
	            right[i]=Math.max(right[i+1],arr[i]);
	        }

	    int water=0;
	    for(int i=0;i<right.length;i++){
	        water=water+(Math.min(left[i],right[i]))-arr[i];
	    }
	    return water;
	    }
	

}
