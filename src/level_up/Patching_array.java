package level_up;

//Given a sorted integer array nums and an integer n, add/patch elements to the array 
//such that any number in the range [1, n] inclusive can be formed by the sum of some elements in the array.

//Return the minimum number of patches required.

//logic we will use the logic of rang like we knew when a number r in added in range (l,h) so range become (r,h+r) so we aree
//assuming intially thr range in(1,) where one excluded if are number in arrary in less or equal to the minimum in range then 
//we patch a element in array
//other we add element to the range because (l,h) should have considered

import java.util.*;
public class Patching_array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[]arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int k=sc.nextInt();
		
		int l=minPatches(arr,k);
		
		System.out.println(l);
		
	}
	
	
	public static int minPatches(int[] arr, int n) {

 
 
 	long miss = 1;
		int i = 0;
		int count = 0;
		while (miss <= n) {

			if (i < arr.length && miss >= arr[i]) {

				miss += arr[i];
             
				i++;
			} else {
             
				miss += miss;
				count++;
			}

		}
     
		return count;

}

}
