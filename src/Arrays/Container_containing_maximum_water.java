package Arrays;

import java.util.*;
/*
 * 11. Container With Most Water
 * 
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.
 * 
 * 
 * 
 */
public class Container_containing_maximum_water {
	//basically we are movimg lower pointer because if we visualize if we get some bar lower than our lower pointer still 
	//our current value will be the maximum value
    public int maxArea(int[] height) {
        
        int area=0;//maximum area
        int left=0;
        int right=height.length-1;
        while(left<=right){
            
            area=Math.max(area,Math.min(height[left],height[right])*(right-left));
            
            if(height[left]<height[right]){
                left++;
            }else {
                right--;
            }
            
     
 
        }
        
        return area;
        
        
    }

}
