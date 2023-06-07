package leetcode_question;

import java.util.*;
public class Restore_ip_adress {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		List<String>li=new ArrayList<>();
		ipadreespartion(s,"",li);
		
		System.out.println(li);
		
	
	}
	
	

	public static void ipadreespartion(String s,String ans,List<String>li,int i,int p) {
		
		//i+1 ke liye partion 
		ipadreespartion(s,ans+s.charAt(i),li,i+1,p+1);
		
		//i+2 ke li partion
		
	}
		


	}
