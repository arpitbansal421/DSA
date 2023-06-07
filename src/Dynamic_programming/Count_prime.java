package Dynamic_programming;

import java.util.*;
public class Count_prime {
	 public int countPrimes(int n) {
	        boolean prime[]=new boolean[n+1];
	        if(n==0 || n==1){
	            return 0;
	        }
	        prime[1]=false;
	        
	        Arrays.fill(prime,true);
	        
	        for(int i=2;i*i<n;i++){
	            
	            if(prime[i]){
	                
	                for(int mul=2;mul*i<=n;mul++){
	                    
	                    prime[mul*i]=false;
	                }
	            }
	        }
	        int count=0;
	        for(int i=2;i<prime.length-1;i++){
	            
	            if(prime[i]){
	                count++;
	            }
	        }
	        
	        return count;
	        
	        
	    }

}
