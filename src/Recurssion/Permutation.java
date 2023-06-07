package Recurssion;
import java.util.*;
/*
 * basically in permutation an we have to explore different cases with different partion 
 * so we extract each character--and do prmutation with other characters
 * 
 * 
 */

public class Permutation {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		print_all_permutation(str,"");
	}
  
	private static void print_all_permutation(String que, String ans) {
		// TODO Auto-generated method stub
		
		//base case
		
		if(que.length()==0) {
			System.out.print(ans+" ");
		}
		
		for(int i=0;i<que.length();i++) {
			String part1=que.substring(0,i);
			String part2=que.substring(i+1);
			print_all_permutation(part1+part2,ans+que.charAt(i));
			
		}          
		
	}
		
}
