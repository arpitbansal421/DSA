package Arrays;
//extremely important


import java.util.*;
public class prime_sieve {

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean[]k=prime_sieve(n);
		
		for(int i=0;i<k.length;i++) {
//			System.out.println("hi");
			if(k[i]) {
				System.out.print(i+" ");
			}
		}
		
	}
	

	
	
	
	
	public static boolean[] prime_sieve(int n) {
		
		boolean[]prime=new boolean[n+1];//we are making an array of size n+1 becaause we taking the numbers from
		//0-n
	
		Arrays.fill(prime, true);
		
		prime[0]=false;//because 0 is not a prime
		prime[1]=false;//because 1 is not a prime
		//we are using i*i logic //observational
		for(int i=2;i*i<=n;i++) {
			//if the number is prime
			if(prime[i]) {
				for(int mul=2;mul*i<=n;mul++) {
					prime[i*mul]=false;
					
				}
			}


		
	}
		return prime;
}
	}
