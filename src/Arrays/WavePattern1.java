package Arrays;

import java.util.*;
public class WavePattern1{
	//vertical wave
	public static void main(String[] args) {
		int[][]arr= {{1,5,9},{10,6,2},{3,7,11},{12,8,4}};
		printwave(arr);
		
	}
	
	public static void printwave(int[][]arr) {
		
		
		for(int r=0;r<arr.length;r++) {
			if(r%2==0) {
				for(int c=0;c<arr[r].length;c++) {
					System.out.print(arr[r][c]+" ");
				}
			}else {
				for(int c=arr[r].length-1;c>=0;c--) {
					System.out.print(arr[r][c]+" ");
				}
				
			}
			
			
			
			
			
			System.out.println();
			
		}
	}
	
	

}
