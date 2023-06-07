package level_up;
import java.util.*;
public class Strong_password_checker {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(passwordchecker(str));
		
	}
	
	public static boolean passwordchecker(String str) {
		
		//checking the length of the password
		int n=str.length();
		if(n<8) {
			return false;
		}
		boolean l=false;
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			
			if(Character.isLowerCase(c)) {
				l=true;
			}
		}
		boolean u=false;
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			
			if(Character.isUpperCase(c)) {
				u=true;
			}
		}
		
		boolean d=false;
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			
			if(Character.isDigit(c)) {
				d=true;
			}
		}
		
		boolean s=false;
		HashSet<Character>set= new HashSet<>();
		//!@#$%^&*()-+
		set.add('!');
		set.add('@');
		set.add('#');
		set.add('$');
		set.add('$');
		set.add('%');
		set.add('^');
		set.add('&');
		set.add('*');
		set.add('(');
		set.add(')');
		set.add('-');
		set.add('+');
		
		for(int i=0;i<str.length();i++) {
			
			if(set.contains(str.charAt(i))) {
				s=true;
			}
			
		}
		
		
		boolean f=true;
		
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i-1)==str.charAt(i)) {
				f=false;
			}
			
		}
		
		return l&&u&&d&&s&&f;
		
	}

}
