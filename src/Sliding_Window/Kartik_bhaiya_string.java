package Sliding_Window;
//q--you are given a string and you have to find the maximum length of string having no repeating characters
//and the string only consist of a and b 
//you can only flip the string k times
public class Kartik_bhaiya_string {
	public static void main(String[] args) {
		String s="abbbbbbbbabaaa";
		
		int k=2;
		int flipa=KartikbhaiyaString(s,k,'a');
		int flipb=KartikbhaiyaString(s,k,'b');
		int ans=Math.max(flipa, flipb);
		System.out.println(ans);
	}
	
	public static int KartikbhaiyaString(String s,int k,char ch) {
		
		//window maintain
		int flip=0;
		int ei=0;
		int si=0;
		int ans=0;
		while(ei<s.length()) {
			//intial condition
			if(ch==s.charAt(ei)) {
				flip++;
			}
			//window shrink
			while(flip>k && si<=ei)
			if(flip>k) {
				if(ch==s.charAt(si)) {
					flip--;
				}
				si++;
			}
			
			//answer
			ans=Math.max(ans, ei-si+1);
			ei++;
			
		}
		return ans;
		
		
	
	}

}
