package Stack;

import java.util.*;

//Find the largest rectangular area 
//possible in a given histogram where the largest 
//rectangle can be made of a number of contiguous bars

//important q
//logic --ke in stack their will be always first minimum below the stack

public class Histogram {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// no of bars
		int[] hist = new int[n];// bar array
		for (int i = 0; i < hist.length; i++) {
			hist[i] = sc.nextInt();

		}
		Stack<Integer> s = new Stack<>();
		System.out.println(hist(hist, s));

		// function

	}

	public static long hist(int[] arr, Stack<Integer> stack) throws Exception {

		// step 1--iterating throw the function
		int i = 0;
		int maxarea = 0;
		while (i < arr.length) {

			// we will only push the element in the stack when the stack is empty
			// or next element is greater than the elment on the peek of the stack
			// so that the only the first minimum element is left below each element in the
			// stack
			if (stack.isEmpty() || arr[i] > arr[stack.peek()]) {
				stack.push(i);// we are keeping indexex in the stack so that we can easily acess the element
				i++;
			} else {
//				int l = stack.peek();
				int hi = arr[stack.pop()];
				int r = i;
				int l=stack.peek();
				if (!stack.isEmpty()) {
							

					maxarea = Math.max(maxarea, hi * (r - l - 1));

				} else {
//					int r=i;
					maxarea = Math.max(maxarea, hi * r);
				}
			}

		}
		
		while (!stack.isEmpty()) {

			int hi = arr[stack.pop()];
			if (!stack.isEmpty()) {
				int r = i;
				int l = stack.peek();

//				System.out.println("hi");
				maxarea = Math.max(maxarea, hi * (r - l - 1));

			} else {
				int r = i;
				maxarea = Math.max(maxarea, hi * r);
			}
		}

		return maxarea;
	}
}
