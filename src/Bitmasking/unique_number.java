as  , package Bitmasking;

import java.util.*;
//find the non repeating element in set
public class unique_number {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {1,1,1,2,2,2,3};
		
		int ans=0;
		/*so basically 16-10000
			8-1000
			4-100
			2-10
			
			so basically we observe in this question every multiple of 2 has only one set bit
			and after that set bit all remaining are zeroes
			and if we take n-1 and first set bit from right becomes zero and remaing are bits negotiated
			for ex-16-10000
			15-01111
			so if we takes it & we can observe that if after first bits all bits are zero
			so we will get zero otherwise and non zero
			
		
		
		*/
		for(int i=0;i<arr.length;i++) {
			ans=(arr[i]^ans);
		}
		
		System.out.println(ans);
	}

}
