package level_up;

import java.util.*;
public class Search_rotatedarray {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		int k=sc.nextInt();

		int ans=Rotatedarray(arr,k);

		System.out.println(ans);
	}
	
	public static int Rotatedarray(int[]arr ,int target){

		int lo=0;

		int hi=arr.length-1;

		while(lo<=hi){

			int mid=(lo+hi)/2;

			if(arr[mid]==target){

				return mid;
			}


			if(arr[lo]<arr[mid]){
				

				if(arr[lo]<=target && target<=arr[mid]){

					

					hi=mid-1;

				}else{

				

					lo=mid+1;
				}
			}
			else{

				if( mid+1 <arr.length && arr[mid+1]<=target && arr[hi]>=target){
					lo=mid+1;
					System.out.println("hello");
					
				}

				else{
					hi=mid-1;

				}

				
			}
		}

		return -1;
	}

}
