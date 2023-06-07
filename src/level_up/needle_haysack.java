package level_up;
import java.util.*;

//Given two strings needle and haystack, 
//return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//similar to rabin karp
public class needle_haysack {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String p=sc.next();
        System.out.println((int)needle_haystack(s,p));
		
	}
	
	public static long needle_haystack(String s,String p){

        long po=1;
        int pr=31;
        long hv=0;
        long mod=100_000_007;

        for(int i=0;i<p.length();i++){

            hv=(hv+((p.charAt(i)-'a'+1)*po)%mod)%mod;
            po=(po*pr)%mod;
        }

        //now we will calculate the culcumutive sum of p

        long[]dp=new long[s.length()];
        po=31;
        long[]power=new long[s.length()];

        dp[0]=s.charAt(0)-'a'+1;
        power[0]=1;

        for(int i=1;i<s.length();i++){
            dp[i]=(dp[i-1]+((s.charAt(i)-'a'+1)*po)%mod)%mod;
            power[i]=po;
            po=(po*pr)%mod;

        }

        //now we will use sliding window technique for fixed size
        for(int ei=p.length()-1, si=0;ei<s.length();ei++,si++){

            long currhash=dp[ei];
            if(si>0){

                currhash=(currhash-dp[si-1]+mod)%mod;
                }

                if(currhash==(hv*power[si])%mod){

                    return si;
                }
                
                
            
        }

        return -1;

    }

}
