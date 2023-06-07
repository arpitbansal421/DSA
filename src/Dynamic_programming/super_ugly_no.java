package Dynamic_programming;

import java.util.*;
//leetcode 313
/*
 * A super ugly number is a positive integer whose prime factors are in the array primes.

Given an integer n and an array of integers primes, return the nth super ugly number.

The nth super ugly number is guaranteed to fit in a 32-bit signed integer.

 
 * 
 * 
 * 
 * 
 */
public class super_ugly_no {
	  public int nthSuperUglyNumber(int n, int[] primes) {
//        int[]dp=new int[n+1];
//        dp[1]=1;
//        int[]pointer=new int[primes.length];
       
//        Arrays.fill(pointer,1);
       
//        for(int i=2;i<=n;i++){
           
//            int min=Integer.MAX_VALUE;
           
//            for(int j=0;j<primes.length;j++){
               
//                //min=Math.min(min,primes[j]*dp[pointer[j]]);
               
//                if(min>primes[j]*dp[pointer[j]]){
                   
//                    min=primes[j]*dp[pointer[j]];
            
//                }
               
               
//            }
//            dp[i]=min;
           
           
//            for(int j=0;j<primes.length;j++){
               
//                if(primes[j]*dp[pointer[j]]==min){
//                    pointer[j]++;
//                }
               
               

           
//            }
          
//        }
       
       return Solution(primes,n);
       
   }
   
   public int Solution(int[]primes,int n){
       int[]dp=new int[n+1];
       PriorityQueue<Pairs>qq=new PriorityQueue<>();
       for(int i=0;i<primes.length;i++){
           qq.add(new Pairs(primes[i],1,primes[i]));
       }
       dp[1]=1;
       for(int i=2;i<=n;){
           Pairs rp=qq.remove();
           if(dp[i-1]!=rp.val){
               dp[i]=rp.val;
              i++;
               
           }
            qq.add(new Pairs(rp.prime,rp.pointer+1,dp[rp.pointer+1]*rp.prime));
               
       }
       
       return dp[n];
       
   }
   
   class Pairs implements Comparable<Pairs>{
       
       int prime;
       int val;
       int pointer;
       public Pairs(int prime,int pointer,int val){
           this.prime=prime;
           this.val=val;
           this.pointer=pointer;
       }
       
       public Pairs(){
           
       }
       
       public int compareTo(Pairs o){
           return this.val-o.val;
       }
   }

}
