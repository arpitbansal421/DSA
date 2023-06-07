package Tcs_digital;

import java.util.Scanner;

public class cyclicly_rotate_an_array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		k=k%arr.length;
		if(k<0) {
			k=(k+arr.length)%arr.length;
		}
		
		reverse(arr.length-k,arr.length-1,arr);//rotating firsrt k elwments
		reverse(0,arr.length-1-k,arr);//rotating n-k elements
		reverse(0,arr.length-1,arr);//rotating entire array
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void reverse(int low ,int hi,int []arr) {
		
		while(low<=hi) {
			int temp=arr[low];
			arr[low]=arr[hi];
			arr[hi]=temp;
			low++;
			hi--;
		}
		
		
		
	}

}
