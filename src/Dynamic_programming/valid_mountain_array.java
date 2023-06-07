package Dynamic_programming;

import java.util.*;
//leetcode 941 valid mountain array
/*Given an array of integers arr, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:*/
public class valid_mountain_array {
	public boolean validMountainArray(int[] arr) {
        if(arr.length<3 || arr[0]>arr[1]){
            return false;
        }
        boolean isp=false;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                
            }else if(arr[i-1]==arr[i]){
                return false;
            }
            else{
                for(;i<arr.length;i++){
                    isp=true;
                    if(arr[i-1]<arr[i]|| arr[i-1]==arr[i]){
                        return false;
                    }
                }
                
            }
                
               
            }
        
        return isp==true?true:false;
        }

}
