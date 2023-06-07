package Stack;

import java.util.*;
/*
 * Given an array of integers heights representing the histogram's bar height where the width of each bar is 1,
 *  return the area of the largest rectangle in the histogram.
 * 
 * 
 */
public class Histogram_nlogn {
	
	int[]arr= {2,3,5,4,6,1,7};
	
	public  int nlogn_hist(int[]arr,int si,int ei) {
		
		if(si>ei) {
			return 0;
		}
		
		int min=si;
		
		for(int i=si+1;i<=ei;i++) {
			if(arr[i]<arr[min]) {
				min=i;
			}
		}
		int max_a=arr[min]*(ei-si+1);
		
		int left=nlogn_hist(arr,si,min-1);
		int right=nlogn_hist(arr,min+1,ei);
		
	
		
		return Math.max(max_a,Math.max(left, right));
		
		
		
		
	}
	
	public static void main(String[] args) {
		Histogram_nlogn his=new Histogram_nlogn();
		his.nlogn_hist(null, 0, 0);
	}

}
