package level_up;

//You are given two arrays a and b, both of length n.

//Let's define a function f(l,r)=∑l≤i≤rai⋅bi.

//Your task is to reorder the elements (choose an arbitrary order of elements) of 
//the array b to minimize the value of ∑1≤l≤r≤nf(l,r). Since the answer can be very large, 
//you have to print it modulo 998244353.
//Note that you should minimize the answer but not its remainder.


//in this aaray we change 2 array but not first so basically we calculate the participation entire each element in entire
//range so when sort are the net participation remains unchanged

import java.util.*;
public class Array_and_Sum_of_function {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int mod=998244353;
		
		long[]a=new long[n];
		Integer[]b=new Integer[n];
		
		for(int i=0;i<n;i++) {
			
			a[i]=sc.nextInt();
			a[i]=((i+1)*a[i]*(n-i));
			
		}
		
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}
		Arrays.sort(a);
		
		Arrays.sort(b,Collections.reverseOrder());
		
		long ans=0;
		
		for(int i=0;i<b.length;i++) {
			ans=(ans+(a[i]*b[i]))%mod;
			
		}
		
		System.out.println(ans);
		
	}

}
