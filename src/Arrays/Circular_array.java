package Arrays;

import java.util.*;

public class Circular_array {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		int[]arr= {1,3,4,5,7};
		
		for(int i=0;i<=arr.length;i++) {
			System.out.print((arr[i%arr.length])+" ");
		}
		
	}

}
