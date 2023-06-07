package Arrays;
//this principle is basically to find the good arrays or the arrays which are divisible by n 
//so basically we make array int[]hole and fing the culcumative sum of all the elements in array
//we use basics of mathematics (b-a)%n==0 whichs gives us a good subarray
//so b%n=b%a
//so we basically developed an frquency array
public class pigeon_hole_principle {
	public static void main(String[]args) {
		int[]arr= {5,5,5,5,5};
		 
		System.out.println(good_sub_array(arr));
		
		
	}
	public static int good_sub_array(int[]arr) {
		int[]hole=new int[arr.length];
		//adding frequencies to hole array
		int sum=0;
		hole[0]=1;//for no element in the array
		for(int i=0;i<hole.length;i++) {
			sum+=arr[i];
			sum%=arr.length;                          
		
			hole[sum]++;
			
		}
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			if(hole[i]>=2) {
				int p=hole[i];
				ans+=((p)*(p-1))/2;
				
			}
		}
		
		return ans;
		
	}

}
