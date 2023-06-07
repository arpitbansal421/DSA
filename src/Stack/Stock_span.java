package Stack;

import java.util.*;

//The stock span problem is a financial problem where we have a series of N daily price quotes for a stock and we need to calculate span of stock’s price for all N days.
//You are given an array of length N, where ith element of array denotes the price of a stock on ith. 
//Find the span of stock's price on ith day, for every 1<=i<=N.
//A span of a stock's price on a given day, i, is the maximum number of consecutive days before the (i+1)th day, 
//for which stock's price on these days is less than or equal to that on the ith day.

public class Stock_span {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[]arr=new int[n];
		//stock array
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int[]k=span(arr);
		for(int i=0;i<k.length;i++) {
			System.out.print(k[i]+" ");
		}
		
		
		
		
		
	}
	
	public static int []span(int[]arr){
		
		int[]ans=new int[arr.length];//answer array here we keep than track of stock
		
		Stack<Integer>s1=new Stack<>();//as we are iterating in lifo manner
		
		for(int i=0;i<arr.length;i++) {
			
			//stack empty condition meet kar jayenge and all element in the stack are less than current element
			
			while(!s1.isEmpty() && arr[i]>arr[s1.peek()]) {
				s1.pop();
				
			}
			//case 1 if stack empty
			if(s1.isEmpty()) {
				ans[i]=i+1;
			}else {
				ans[i]=i-s1.peek();
			}
			
			//neccessary condition
			s1.push(i);
		}
		return ans;
		
	}

}
