package binary_search;
import java.util.*;
/*
 * 875. Koko Eating Bananas
 * Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.
 * 
 */
public class Koko_eating_banana {
	   public int minEatingSpeed(int[] piles, int h) {
	        Arrays.sort(piles);

	        int lo=0;
	        int ans=0;
	        int hi=piles[piles.length-1];

	        while(lo<=hi){
	            int mid=lo+(hi-lo)/2;

	            if(isitpossible(piles,mid,h)){
	               
	                ans=mid;
	                hi=mid-1;
	            }else{
	                lo=mid+1;
	            }

	        }

	        return ans;
	        
	    }

	    public boolean isitpossible(int[]piles,int s,int h){

	        int time=0;
	        for(int i=0;i<piles.length;i++){

	            time+=(int)Math.ceil(piles[i]*1.0/s);

	            
	        }

	        return time<=h;


	    
	      
	}

}
