package level_up;
import java.util.*;

public class single_in_engineering {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		
		long k=maxwood(arr,x);
		
		System.out.println(k);
		
		
	}
	
	public static long maxwood(int[]arr,int x) {
		
		Arrays.sort(arr);
		
		
		long lo=0l;
		long hi=arr[arr.length-1];
		

		
		long ans=0;
		while(lo<hi) {
			
			long mid=(hi+lo)/2;
			if(itispossible(mid,arr,x)) {
				ans=mid;
				lo=mid+1;
				
				
				
				
			}else {
				hi=mid-1;
			}
		}
		
		return ans;
		
	}
	
	public static boolean itispossible(long mid,int[]arr,int x) {
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=(mid)) {
				continue;
			}
			else {
				count+=(arr[i]-mid);
				
				
			}
		}
		
		if(count>=x) {
			return true;
		}
		
		return false;
	}

}
