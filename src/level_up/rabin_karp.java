package level_up;

import java.util.*;

//implementation of rabin_karp algorithm 
//basic this algo rithm so for pattern matching

//so basically in this algorithm we generate hashcode--in terms of polynomial ax^3+bx^2+cx+d
//we a,b,c are axcii character of that string and we take value of x greater than 26 or 52 for capital letter
//for ex if we take value less than 26 for x=7
//so for aa =8 and h=8 here are case will fail
// abcdeabc so from our logic de will equl to=d*x^3+e*x^4 but if we have count de- equation (1)
//so hashcode of de will be equal to d+ex so to match are hashcodes we will simply divide our equation (1) with
//starting index of equation (1)
//but we can also write (patttern eqation)*(starting power of(equation))==currenty equation then our first string is matched

//finally we use the slinding window technique to culcumutate our ans
public class rabin_karp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String p=sc.next();
		rabin_karp_patternmatching(s,p);
		
		
	}
	
	public static void rabin_karp_patternmatching(String s,String p){
		
		//step 1:firstly we will generate our hashcode for p for which we have to match pattern
		long pow=1;
		int pr=31;
		long hv=0;
		long mod=1000000007;//so that we can keep our ans in int
	    
		for (int i = 0; i < p.length(); i++) {
			hv = (hv + ((p.charAt(i) - 'A' + 1) * pow) % mod) % mod;
			System.out.println("hv"+ hv);
			
			pow = (pow * pr) % mod;

		}
		
	
		
		
		
		long []dp=new long[s.length()];//this array we will keep the track of
		//culmutive sum of hashcode till ith index
		dp[0]=s.charAt(0)-'A'+1;
		long[]power=new long[s.length()];//so cheching the corresponding along each frequency
		power[0]=1;
		
		pow=31;
		
		for(int i=1;i<s.length();i++) {
			dp[i]=(dp[i-1]+((s.charAt(i)-'A'+1)*pow)%mod)%mod;
			power[i]=pow;
			pow=(pow*pr)%mod;
			
			
		}
		ArrayList<Integer>list=new ArrayList<>();
		
		//now we will use the sliding window to culcumate our ans
		
		for(int ei=p.length()-1,si=0;ei<s.length();si++,ei++) {
			long currhash=dp[ei];
			if(si>0) {
				
				currhash=(currhash-dp[si-1]+mod)%mod;//we are doing + mod because if(curr==mod then cuurhash-dp[si-1] might be negative
				
			}
			
			if(currhash==hv*power[si]%mod) {
				list.add(si);
			}
			
		}
		
		if(list.size()==0) {
			System.out.println("Not found");
			
		}else {
			System.out.println(list.size());
			for(int v:list) {
				System.out.println(v+" ");
			}
		}
		
		
		
		
		
		
		
	}
		

}
