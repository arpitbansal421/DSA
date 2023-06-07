package Recurssion;
/*
 * important coding blocks assingment
 * 
 */
import java.util.*;
public class Recurssion_ascii_subseq {
	public static void main(String[] args) {
		
		String ques="ab";
		print_ascii_seq(ques,"");
	}
	
	public static void print_ascii_seq(String ques,String ans) {
		
		if(ques.length()==0) {
			
			System.out.print(ans+" ");
			return;
		}
		
		print_ascii_seq(ques.substring(1),ans);//no
		print_ascii_seq(ques.substring(1),ans+ques.charAt(0));//yes char
		print_ascii_seq(ques.substring(1),ans+(int)ques.charAt(0));
		return;
		
		
	}

}
