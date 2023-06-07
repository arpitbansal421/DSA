package Bitmasking;

//in magic no the given number of array following particular pattern 
//we have to deduce that pattern and found the number
//a magic no is express as power or sum of 5
//5 25 30 125
import java.util.*;
public class Magic_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=0;
		int mul=5;
		while(n>0) {
			if((n&1)!=0) {
				ans=ans+mul;
			}
			
			n=n>>1;
			mul*=5;
			
			
		}
		
		System.out.println(ans);
		
	}

}
