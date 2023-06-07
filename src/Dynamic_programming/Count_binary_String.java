package Dynamic_programming;
import java.util.*;

//You are provided an integers N.
//You need to count all possible distinct binary strings of length N 
//such that there are no consecutive 1’s.

//excellent logic for 1 and o create a seprate array

public class Count_binary_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			
			int n=sc.nextInt();
		
		
			int k1=count(n);
			System.out.println(k1);
			
			
		}
		
	}
	
	public static int count(int n) {
		
		int[]a=new int[n];//0 array
		int[]b=new int[n];//1 array
		
		a[0]=1;
		b[0]=1;
		
		for(int i=1;i<a.length;i++) {
			a[i]=a[i-1]+b[i-1];//
			b[i]=a[i-1];
		}
		
		return a[n-1]+b[n-1];
	

}
	}
