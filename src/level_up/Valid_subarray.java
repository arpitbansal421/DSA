package level_up;

import java.util.*;
import java.util.Stack;

//you are given an integer array return the no of subaaray 
//with leftmost element not larger than the ele in subarray
public class Valid_subarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print(Number_of_subarray(arr));
	}
	
	public static int Number_of_subarray(int[]arr) {
		
		Stack<Integer>ss=new Stack<>();
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			while(!ss.isEmpty() && arr[i]<arr[ss.peek()]) {
				ss.pop();
			}
			ss.push(i);
			ans+=ss.size();
		}
		
		return ans;
		
	}

}
