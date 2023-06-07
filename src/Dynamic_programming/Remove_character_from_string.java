package Dynamic_programming;


import java.util.*;
public class Remove_character_from_string {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			
			String str=sc.next();
			replace(str,0,1,"");
		}
		
		
	}
	
	
	public static void replace(String ques,int i,int j,String ans) {
		
		//base case
		if(j==ques.length()) {
			if(i!=ques.length()) {
				ans+=ques.charAt(i);
			}
		
			System.out.println(ans);
			return;
		}
		
		if(ques.charAt(i)=='7' ) {
			
			replace(ques,i+1,j+1,ans);
			
			
			
			
		} 
		else if(ques.charAt(i)=='5'&& ques.charAt(j)=='6') {
			
			replace(ques,i+2,j+1,ans);
		}else {
			
		
			replace(ques,i+1,j+1,ans+ques.charAt(i));
		}
		
		
		
		
		return;
		
		
	}
	
	

}
