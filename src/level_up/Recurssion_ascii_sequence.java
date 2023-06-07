package level_up;

//Take as input str, a string. We are concerned with all the possible ascii-subsequences of str. 
//E.g. “ab” has following ascii-subsequences “”, “b”, “98”, “a”, “ab”, “a98”, “97”, “97b”, “9798”

//a. Write a recursive function which returns the count of ascii-subsequences for a given string. Print the value returned.

//b. Write a recursive function which prints all possible ascii-subsequences for a given string (void is the return type for function)

import java.util.*;
public class Recurssion_ascii_sequence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int k=printsubsequence(str,"");
		System.out.println();
		System.out.print(k);
	}
	public static int printsubsequence(String ques,String ans){

		if(ques.length()==0){
			System.out.print(ans+" ");
			return 1;
		}

		char ch=ques.charAt(0);

		int ex=printsubsequence(ques.substring(1),ans);
		int inc=printsubsequence(ques.substring(1),ans+ch);//a
		int inc1=printsubsequence(ques.substring(1),ans+(int)ch);//98
		return ex+inc+inc1;

	}

}
