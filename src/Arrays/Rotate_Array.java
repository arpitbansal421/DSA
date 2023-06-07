package Arrays;

import java.util.*;

//rotate an array basically in this element we to shift k element from rigth to left if k is positive
//and if k is negative we have to shift k elements from left to rigth
//here we will use reversal algorithm
//for rotating k element from an array of n
//we have to follow the following steps
//step1: first rotate k,n-1 elements
//step2 :then rotate 0 to k-1 elements
//step3: then rotate entire array

public class Rotate_Array {
	
	public static void main (String[]args) {
		int[]arr= {1,2,3,4,5,6,7};
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		
		k=k%arr.length;
		if(k<0) {
			k=(k+arr.length)%arr.length;
			
		}
		
		System.out.println(k);

		//step 1
		reverse(arr,arr.length-k,arr.length-1);//step1: rotating k elements
		reverse(arr,0,arr.length-k-1);//step2: rotating n-k elements
		reverse(arr,0,arr.length-1);//step3:rotating entire arr
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
		
	}

	private static void reverse(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		
	}

}



}
