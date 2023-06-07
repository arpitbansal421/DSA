package Arrays;
//good question

import java.util.*;
public class pi_string {
	
	public static void main(String[]args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		String ans="";
		replace(str,0,ans);
//		System.out.println(ans);
	}
    
	private static void replace(String str, int i,String ans) {
		// TODO Auto-generated method stub
//		String ans="";
		if(i==str.length()) {
			System.out.println(ans);
			return;
			
		}
		if(i+1<=str.length() && str.charAt(i)=='p'&& str.charAt(i+1)=='i') {
			replace(str,i+2,ans+"3.14");
			
			
		}else {
			replace(str,i+1,ans+str.charAt(i));
		}
		
		return ;
		
		
		
		
	}

}
