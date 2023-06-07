package Dynamic_programming;
//leetcode 845
//longest mountain array
/*
 * You may recall that an array arr is a mountain array if and only if:

arr.length >= 3
There exists some index i (0-indexed) with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given an integer array arr, return the length of the longest subarray, which is a mountain. 
Return 0 if there is no mountain subarray.
 * 
 * 
 * 
 */
public class Longest_mountain_array {
	public int longestMountain(int[] nums) {
        int n=nums.length;
       int ans=0;
       
       int i=1;
       while(i<=n-2){
           
           //firstly we will find our peek element
           
           if(nums[i-1]<nums[i] && nums[i]>nums[i+1]){
               int count=1;
               int j=i;
               //left side elements check
               while(j>0 && nums[j-1]<nums[j]){
                 
                   count++;
                   j--;
               }
             
               //right side elements will be checked
               while(i<=n-2 && nums[i]>nums[i+1]){
                   count++;
                   i++;//basically here we are doing i++ because if we according nums[i]>nums[i+1] so i+1 cant our peek because
                   //left side of peak must smaler it
               }
               
               ans=Math.max(count,ans);
               
           }else{
               i++;
           }
       }
       
       return ans;
   }

}
