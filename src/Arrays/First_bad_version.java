package Arrays;

/*278. First Bad Version
 * 
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad.
 Implement a function to find the first bad version. 
You should minimize the number of calls to the API.
 */
public class First_bad_version {
	public int firstBadVersion(int n) {

        if(isBadVersion(0)){
            return 0;
        }

        int l=1;
        int hi=n;
        int ans=0;

        while(l<=hi){
            int mid=l+(hi-l)/2;

            if(isBadVersion(mid)){
                ans=mid;
                hi=mid-1;
            }else{
                l=mid+1;
                
        }


        
    }
        return ans;
}

	private boolean isBadVersion(int i) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
