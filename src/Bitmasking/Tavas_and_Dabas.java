package Bitmasking;

//Once again Tavas started eating coffee mix without water! 
//Keione told him that it smells awful, but he didn't stop doing that. 
//That's why Keione told his smart friend, SaDDas to punish him! SaDDas took Tavas' headphones and told him: 
//"If you solve the following problem, I'll return it to you."
//
//The problem is:
//
//You are given a lucky number n. Lucky numbers are the positive integers whose decimal representations contain only the lucky digits 4 and 7. For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not.
//
//If we sort all lucky numbers in increasing order, what's the 1-based index of n?
//
//Tavas is not as smart as SaDDas, so he asked you to do him a favor and solve this problem so he can have his headphones bac

import java.util.*;
public class Tavas_and_Dabas {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		
		int k=tavas_and_dabas(n);
		System.out.println(k);
	}
	
	
	public static int tavas_and_dabas(String str) {
		//step 1 we will calculate total nos
		int n=str.length();
		int count=(1<<n)-2;//no digits form of length n-1
		System.out.println(count);
		int pos=0;
		//now we will calculate first no before n-1 digits
		for(int i=n-1;i<=0;i--) {
			
			if(str.charAt(i)=='7') {
				count=count+1<<pos;
			}
			pos++;
		}
		
		return count+1;
	}

}
