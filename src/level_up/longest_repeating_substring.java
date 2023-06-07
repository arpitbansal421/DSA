package level_up;
import java.util.*;

//Given a string s, return the length of the longest repeating substrings. If no repeating substring exists, return 0

//exactly similar to kmp
public class longest_repeating_substring {
	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
	        String str=sc.next();
	        System.out.println(longestrepeatingstring(str));
	}
	
	public static int longestrepeatingstring(String str){

        int len=0;
        int[]dp=new int[str.length()];
        int i=1;
        
        while(i<str.length()){

            if(str.charAt(i)==str.charAt(len)){

                len++;
                dp[i]=len;
                i++;

            }else{
                if(len>0){
                    len=dp[len-1];

                }else{
                    dp[i]=0;
                    i++;
                }
            }
            

        }

        int max=0;

        for(int j=0;j<dp.length;j++){
            max=Math.max(max,dp[j]);
        }

        return max;
    }

}
