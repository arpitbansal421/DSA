package Dynamic_programming;

import java.util.*;
//You are provided a sequence of number. All numbers of that sequence is in increasing order (including 1) and
//whose only prime factors are 2, 3 or 5 (except 1).
//You need to find the nth number of that sequence.

public class ugly_number {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int k=count(n);
			System.out.println(count(n));
			
			
		
		}
		
	}
	
	public static int count(int n)   {
		
		int i=1;
		for(int count=1;count<n;) {
			
			i++;
//			System.out.println("hello");
			if(i==1 || i%2==0 ||i%3==0 || i%5==0) {
				count++;
			}
			
		}
		
		return i;
		
				
			
		}
		
	
		
	

}
