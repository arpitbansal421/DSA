package Arrays;

import java.util.*;
public class Kartik_bhaiya_string {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		String str=sc.next();
		
		System.out.print(Math.max(kartik_bhaiya_String(str,'a',k),kartik_bhaiya_String(str,'b',k)));
		
	}
	
	public static int kartik_bhaiya_String(String str,char ch,int k) {
		int ei=0;
		int si=0;
		int ans=0;
		int flip=0;
		while(ei<str.length()) {
			if(str.charAt(ei)==ch) {
				flip++;
			}
			
			while(flip>k && si<=ei) {
				
				if(str.charAt(si)==ch) {
					flip--;
				}
				si++;
			}
			
			//ans update
			ans=Math.max(ans, ei-si+1);
			ei++;
			
		}
		
		return ans;
		
		
	}

}
