package Arrays;
import java.util.*;;
/*795. Number of Subarrays with Bounded Maximum
 * Given an integer array nums and two integers left and right, return the number of contiguous non-empty subarrays such that the value of the maximum array element in that subarray is in the range [left, right].

The test cases are generated so that the answer will fit in a 32-bit integer.
 * 
 * 
 */
public class Leetcode_795_Maximum_bounded_subarray {
	
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {

        int ans=0;
        int si=0;
        int current_sum=0;

        for(int i=0;i<nums.length;i++){
          
        	//when the element is within the range
            if(left<=nums[i]&&nums[i]<=right){
                current_sum=i-si+1;
                ans+=current_sum;
            }
//when we get an element which is less left lower limit so such element can not form its individual subaaray
            /*ya but it can contribute in the existing subaaray
             * for ex[5,4,3] left=2 right =5 
             * new element =1
             * 
             * so currently we six subaaray 
             * 5  5 4  5 4 3
             *    4 3
             * 4
             * 3
             * so we can append 1 in every exisiting sub array
             * 
             * 51  541  5431 
             * 41  431
             * 31          and previous 6 subaaray 
             * so total subaaray is equal to 12
             * 
             * 
             */
            else if(nums[i]<left){
                ans+=current_sum;
            }
            
            /*now when element greater than right so we start from new position
             * now we cannot append our element to our existing subarray
             * 
             * 
             */
            if(nums[i]>right){
                current_sum=0;
                si=i+1;
            }
            
        }

        return ans;
        
    }
	

}
