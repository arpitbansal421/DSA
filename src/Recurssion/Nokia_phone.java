package Recurssion;
import java.util.*;
public class Nokia_phone {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		Print(str,"");
		
	
	
		
		
		
	}
	
	static String[]key= {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz"};

	private static void Print(String que, String ans) {
		// TODO Auto-generated method stub
		
		//Base case
		if(que.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		
		char c=que.charAt(0);//1
		String keystring=key[c-48];//abc
		//keystring
		for(int i=0;i<keystring.length();i++) {
			Print(que.substring(1),ans+keystring.charAt(i));
			
		
		}
		
		
	}
	

	public static void keypiad(String ques, String ans) {// 123,""

		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);// 1
		String keyString = key[ch - 48];// 49-48

		for (int i = 0; i < keyString.length(); i++) {
			keypiad(ques.substring(1), ans + keyString.charAt(i));//23,a

		}

	}
	

}
