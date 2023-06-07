package Stack;

//Given an array, print the Next Greater Element (NGE) for every element. 
//The Next Greater Element for an element x is the first greater element on the right side of x in array.
//Elements for which no greater element exist, consider next greater element as -1.

import java.util.*;

public class NextGreater {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < arr.length; i++)
				arr[i] = scn.nextInt();

			nextLarger(arr);

			t--;
		}

	}

	// Function to print Next Greater Element for each element of the array
	public static void nextLarger(int[] arr) {
		
		int[]ans=new int[arr.length];
//		Arrays.fill(ans, -1);
		//time complexity 2*(o(n) one time push one time pop
		Stack<Integer>s=new Stack<>();
		for(int i=0;i<arr.length;i++) {
			while(!s.isEmpty()&& arr[s.peek()]<arr[i]) {
//				System.out.print("hello");
				ans[s.pop()]=arr[i];
				
				
			}
			s.push(i);
		}
		
		while(!s.isEmpty()) {
			ans[s.pop()]=-1;
		}
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]+","+ans[i]);
		}
		
		

// Write Code here

	}
}

