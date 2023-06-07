package Dynamic_programming;


import java.util.*;
public class cody_friends {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int s=sc.nextInt();
        int []item=new int[n];
//        int []wiegth=new int[n];
        int[][]dp=new int[item.length][s+1];
        for(int i=0;i<item.length;i++){
            item[i]=sc.nextInt();
        }
//        for(int i=0;i<n;i++){
//            wiegth[i]=sc.nextInt();
//        }
        int k=maximum(item,s,0,dp);
        System.out.println(k);
        // Your Code Here
    }

    public static int maximum(int []item,int val,int i,int[][]dp){
        //base condition
        if(i==item.length){
            return 10000;
        }
        
//        
        if(val==0) {
        	return 0;
        	
        }

        if(dp[i][val]!=0){
            return dp[i][val];
        }

        int inc=0;
        int exc=0;
    
        if(val>=item[i] && item[i]!=-1){
            val-=item[i];
            inc=maximum(item,val,i,dp);
            val+=item[i];
        }
        //exclusive
        exc=maximum(item,val,i+1,dp);
        
        return dp[i][val]=Math.min(inc,exc)+item[i];
    }
}

