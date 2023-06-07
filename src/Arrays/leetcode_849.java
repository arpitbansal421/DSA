package Arrays;

/*
 * You are given an array representing a row of seats where seats[i] = 1 represents a person sitting in the ith seat, and seats[i] = 0 represents that the ith seat is empty (0-indexed).

There is at least one empty seat, and at least one person sitting.

Alex wants to sit in the seat such that the distance between him and the closest person to him is maximized. 

Return that maximum distance to the closest person.
 * 
 * 
 */
public class leetcode_849 {
    public int maxDistToClosest(int[] seats) {
        int maxzero=0;
        int prefix=-1;
        int suffix=-1;
        int ans=0;
        for(int i=0;i<seats.length;i++){
            if(seats[i]==1){

                    
                if(prefix==-1){
                    prefix=i;
                }
                suffix=i;
                maxzero=0;
                
            }else{
                maxzero++;

              
                  ans=Math.max(ans,Math.max(prefix,(maxzero+1)/2));
              
         

            }
     
    }
    int n=seats.length;
    ans=Math.max(ans,Math.max(prefix,n-suffix-1));
    return ans;
}

}
