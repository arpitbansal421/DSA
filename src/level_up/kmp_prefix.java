package level_up;

//we have to find the substring which largest prefix and also a suffix of the given string
//so basically we using array to keep track of length of the prefix whic also an suffix
//but also we knew pattern will repeat itseft len >1 for len character so we also are when character so not matching we are trying find the 
//from the prev ans 

import java.util.*;
public class kmp_prefix {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		String str=sc.next();
		
		System.out.println(longest_prefix_suffix(str));
		
		
	}
	
	public static String longest_prefix_suffix(String str) {
		
		int[]dp=new int[str.length()];//tracking len
		
		int i=1;
		int len=0;
		while(i<str.length()) {
			if(str.charAt(i)==str.charAt(len)) {
				len++;
				dp[i]=len;//increasing length of ans
				i++;
			}else {
				if(len>0) {
					len=dp[len-1];//checking from prev value
					
				}else {
					dp[i]=0;//it no value exixt for ans;
					i++;
				}
			}
		}
		
		return str.substring(0,dp[str.length()-1]);
		
	}

}
