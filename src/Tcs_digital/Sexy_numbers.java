package Tcs_digital;


import java.util.*;
public class Sexy_numbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int h=sc.nextInt();
		boolean[]prime=new boolean[h+1];
		
		
		sexynumber(h,l,prime);
		
		HashSet<Integer>isvisted=new HashSet<>();
		for(int i=l;i<=h;i++) {
			if(prime[i]) {
			
				isvisted.add(i);
			
			}
			
		}
		
//		System.out.println(isvisted);
		
		   for(int i=l;i<=h-6;i++) {
			   
			if(prime[i]&& prime[i+6]) {
//				System.out.println(i+6);
				System.out.print("("+i+","+(i+6)+")"+" ");
			}
		}
		
		
	}
	
	//sexy number code
	public static void sexynumber(int h,int l,boolean[]prime) {
		Arrays.fill(prime, true);
		prime[0]=false;
		prime[1]=false;
		//checking prime number till root n
		for(int i=2;i*i<=h;i++) {
			//checking whether the given iteration is prime or not
			if(prime[i]) {
				
				
				//removing all the multipules of prime number
				for(int mul=2;mul*i<=h;mul++) {
					prime[mul*i]=false;
					
					
				}
			}
			
			
		}
	}
	
	
	

}
