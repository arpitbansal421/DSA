package binary_search;
import java.util.*;
/*2226. Maximum Candies Allocated to K Children
 * You are given a 0-indexed integer array candies. Each element in the array denotes a pile of candies of size candies[i]. You can divide each pile into any number of sub piles, but you cannot merge two piles together.

You are also given an integer k. You should allocate piles of candies to k children such that each child gets the same number of candies. Each child can take at most one pile of candies and some piles of candies may go unused.

Return the maximum number of candies each child can get.
 * 
 * 
 * 
 */
public class Maximum_allocation_to_k_child {
	public int maximumCandies(int[] candies, long k) {

	     
		   

        Arrays.sort(candies);
        long t=0;
        for(int i:candies){
            t+=i;
        }

        if(t<k){
            return 0;
        }
        

        int hi=candies[candies.length-1];
        int lo=1;
        int ans=0;
        while(lo<=hi){

            int mid=lo+(hi-lo)/2;

            if(itispossible(candies,mid,k)){
                ans=mid;
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }

        return ans;
        
    }

    public boolean itispossible(int[]candies,int dis,long k){
        long res=0;
        for(int i=0;i<candies.length;i++){
            res+=candies[i]/dis;

        }

        return res>=k;
    }

}
