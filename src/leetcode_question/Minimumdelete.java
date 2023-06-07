package leetcode_question;
import java.util.*;



public class Minimumdelete {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=sc.next();
		int[][]dp=new int[str.length()][str1.length()];
		for(int[]a:dp) {
			Arrays.fill(a, 1000000);
		}
		int k=minimumDeleteSum(str,str1,0,0,dp);
		System.out.println(k);
		
	}
  
        
    
    
    public static int minimumDeleteSum(String s1,String s2,int i,int j,int[][]dp){
        //base1 condition
        if(s1.length()==i && s2.length()==j){
            return 0;
        }
        
        //2nd base condition
        if(s1.length()==i && s2.length()!=j){
            int temp=0;
            while(s2.length()!=j){
                temp+=(int)(s2.charAt(j));
                j++;
                
            }
            return temp;
        }
        
        
             if(s1.length()!=i && s2.length()==j){
                int temp=0;
                while(s1.length()!=i){
                temp+=(int)(s1.charAt(i));
                i++;
                
            }
            return temp;
        }
             
        if(dp[i][j]!=1000000) {
        	
        
        	return dp[i][j];
        }
        
        int ans=1000000;
        int del=1000000;
        if(s1.charAt(i)==s2.charAt(j)){
            ans=minimumDeleteSum(s1,s2,i+1,j+1,dp);
            
        }else{
            int fd=minimumDeleteSum(s1,s2,i+1,j,dp)+(int)(s1.charAt(i));
            int sd=minimumDeleteSum(s1,s2,i,j+1,dp)+(int)(s2.charAt(j));
            del=Math.min(Math.min(fd,sd),del);
        }
        
        
        return dp[i][j]=Math.min(ans,del);
        
        
        
        
        
    }
}
