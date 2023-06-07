package Tcs_digital;

//very good question
import java.util.*;
public class Three_String_Palindrome {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
//			int n=sc.nextInt();
//			String[]list=new String[n];
			
				palindrome(sc.next());
			
		}
		
	}
	
	public static void palindrome(String str) {
		boolean isvisited = false;
		if(str.length()<=2) {
			System.out.println("Impossible");
			return;
		}
		if(str.length()==3){
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(1));
			System.out.println(str.charAt(2));
			
		}
		if(str.length()>3) {
			for(int i=1;i<str.length();i++) {
				if(isitpossible(str.substring(0,i))) {
					
					for(int j=1;j<str.length()-i;j++) {
						
						if(isitpossible(str.substring(i,j+i))&& isitpossible(str.substring(j+i))) {
							System.out.println(str.substring(0,i));
							System.out.println(str.substring(i,j+i));
							System.out.println(str.substring(j+i));
							isvisited=true;
							break;
						}
						if(isvisited) {
							break;
						}
					}
					
				}
			}
		}
		if(!isvisited) {
			System.out.println("Impossible");
			
		}
	}

	private static boolean isitpossible(String sub) {
		// TODO Auto-generated method stub
		
		int i=0;
		int j=sub.length()-1;
		while(i<=j) {
			if(sub.charAt(i)!=sub.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
